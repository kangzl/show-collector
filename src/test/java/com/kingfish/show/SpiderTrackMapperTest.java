package com.kingfish.show;

import com.kingfish.show.mybatis.dao.SpiderTrackMapper;
import com.kingfish.show.mybatis.model.SpiderTrack;
import com.kingfish.show.mybatis.model.SpiderTrackExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by kingfish on 2017/7/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpiderTrackMapperTest {

    @Autowired
    private SpiderTrackMapper spiderTrackMapper;

    @Test
    public void testSelectByExample() {
        List<SpiderTrack> spiderTracks = spiderTrackMapper.selectByExample(new SpiderTrackExample());
        System.out.println(spiderTracks);
    }

}
