package com.kingfish.show;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.kingfish.show.bean.TBFeed;
import com.kingfish.show.bean.TBSearch;
import com.kingfish.show.mybatis.dao.ProductMapper;
import com.kingfish.show.mybatis.dao.ShowsMapper;
import com.kingfish.show.mybatis.dao.SpiderTrackMapper;
import com.kingfish.show.mybatis.model.*;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by kingfish on 2017/7/10.
 */
@Component
public class Collector {

    //detail &on_comment=1直接进评价
    //https://s.taobao.com/list?data-key=sort&data-value=sale-desc&ajax=true&seller_type=taobao&cat=51108009&sort=sale-desc
    private static final Logger logger = LoggerFactory.getLogger(Collector.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat chDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");//注意线程问题
    private static final String URL_FEED = "https://rate.taobao.com/feedRateList.htm?auctionNumId=%s&currentPageNum=1&pageSize=20&rateType=3&orderType=sort_weight&folded=0";
    private static final String URL_SEARCH = "https://s.taobao.com/list?data-key=sort&data-value=sale-desc&ajax=true&cat=%s&sort=sale-desc&selle_type=taobao";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SpiderTrackMapper spiderTrackMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ShowsMapper showsMapper;

    @Scheduled(fixedDelay = 1000 * 60 * 60 * 24)
    public void reportCurrentTime() {

        List<SpiderTrack> spiderTracks = spiderTrackMapper.selectByExample(new SpiderTrackExample());
        if (!CollectionUtils.isEmpty(spiderTracks)) {
            for (SpiderTrack spiderTrack : spiderTracks) {
                long startTime = System.currentTimeMillis();
                if (spiderTrack.getCategoryId() == null) continue;
                String urlSearch = String.format(URL_SEARCH, spiderTrack.getCategoryId());
                TBSearch tbSearch = restTemplate.getForEntity(urlSearch, TBSearch.class).getBody();
                if (tbSearch == null) continue;
                String catLevelOne = tbSearch.getMainInfo().getSrpGlobal().getCatLevelOne();
                List<TBSearch.ModsBean.ItemlistBean.DataBeanXX.AuctionsBean> auctions = tbSearch.getMods().getItemlist().getData().getAuctions();
                for (TBSearch.ModsBean.ItemlistBean.DataBeanXX.AuctionsBean auction : auctions) {
                    Product product = new Product();
                    product.setProductId(Long.valueOf(auction.getNid()));

                    ProductExample productExample = new ProductExample();
                    productExample.or().andProductIdEqualTo(product.getProductId());
                    List<Product> products = productMapper.selectByExample(productExample);

                    if (!CollectionUtils.isEmpty(products)) {
                        Product productInDb = products.get(0);
                        DateTime dateTimeInDb = new DateTime(productInDb.getGmtCreate());
                        DateTime dateTimeNow = new DateTime(new Date());
                        int days = Days.daysBetween(dateTimeInDb, dateTimeNow).getDays();
                        if (days < 7) {
                            logger.info("product:{} not yet due!" + product.getProductId());
                            continue;
                        }
                    }

                    product.setCateId(Long.valueOf(auction.getCategory()));
                    product.setL1Category(Long.valueOf(catLevelOne));
                    product.setSaleId(Long.valueOf(auction.getUser_id()));
                    boolean isTmall = auction.getShopcard().isIsTmall();
                    byte source = (byte) (isTmall ? 2 : 1);
                    product.setSource(source);
                    product.setViewSales(auction.getView_sales());
                    product.setDetailUrl(auction.getDetail_url());
                    product.setPicUrl(auction.getPic_url());
                    product.setShopUrl(auction.getShopLink());
                    product.setSimilarUrl(auction.getI2iTags().getSimilar().getUrl());
                    String urlFeed = String.format(URL_FEED, auction.getNid());
                    TBFeed feed = restTemplate.getForEntity(urlFeed, TBFeed.class).getBody();
                    if (feed == null) continue;
                    List<Shows> shows = null;
                    try {
                        shows = extractShow(feed);
                        shows.forEach(show -> show.setProductId(product.getProductId()));
                    } catch (Exception e) {
                        logger.error("ERROR", e);
                    }
                    ProductExample productExample4delete = new ProductExample();
                    ProductExample.Criteria criteria = productExample4delete.createCriteria();
                    criteria.andProductIdEqualTo(product.getProductId());
                    productMapper.deleteByExample(productExample4delete);

                    productMapper.insert(product);

                    ShowsExample showExample = new ShowsExample();
                    ShowsExample.Criteria criteriaShow = showExample.createCriteria();
                    criteriaShow.andProductIdEqualTo(product.getProductId());
                    showsMapper.deleteByExample(showExample);

                    shows.forEach(show -> showsMapper.insert(show));
                }
                logger.info("{} cost:{}", spiderTrack.toString(), System.currentTimeMillis() - startTime);
            }
        }

    }

    private List<Shows> extractShow(TBFeed feed) throws ParseException {
        if (feed == null || feed.getComments() == null || feed.getTotal() == 0) return null;
        List<Shows> result = Lists.newArrayList();
        List<TBFeed.CommentsBean> comments = feed.getComments();
        for (TBFeed.CommentsBean comment : comments) {
            Shows show = new Shows();
            String content = comment.getContent();
            if (StringUtils.isEmpty(content)) {
                continue;
            } else {
                show.setContent(content);
            }
            List<TBFeed.CommentsBean.PhotosBean> photos = comment.getPhotos();
            if (CollectionUtils.isEmpty(photos)) {
                continue;
            } else {
                List<String> urlList = Lists.newArrayList();
                for (TBFeed.CommentsBean.PhotosBean photo : photos) {
                    urlList.add(photo.getUrl());
                }
                show.setPics(Joiner.on(",").join(urlList));
            }

            String dateStr = comment.getDate();
            show.setShowTime(chDateFormat.parse(dateStr));
            show.setProductId(Long.valueOf(comment.getAuction().getAucNumId()));
            show.setIsOutside(true);
            show.setOutsideUserNickname(comment.getUser().getNick());
            show.setOutsideUserHeadPic(comment.getUser().getAvatar());
            result.add(show);
        }
        return result;
    }
}
