package com.kingfish.show;

import com.kingfish.show.utils.TBFeed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kingfish on 2017/7/10.
 */
@Component
public class Collector {

    //detail &on_comment=1直接进评价
    private static final Logger logger = LoggerFactory.getLogger(Collector.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final String url = "https://rate.taobao.com/feedRateList.htm?auctionNumId=552216487074&currentPageNum=1&pageSize=20&rateType=3&orderType=sort_weight&folded=0";
    @Autowired
    RestTemplate restTemplate;

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime() {
        logger.info("The time is now {}", dateFormat.format(new Date()));

        TBFeed body = restTemplate.getForEntity(url, TBFeed.class).getBody();
        System.out.println(body);

    }
}
