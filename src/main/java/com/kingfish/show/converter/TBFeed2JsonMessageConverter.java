package com.kingfish.show.converter;

import com.alibaba.fastjson.JSONObject;
import com.kingfish.show.utils.TBFeed;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by kingfish on 2017/7/11.
 */
public class TBFeed2JsonMessageConverter extends AbstractHttpMessageConverter<TBFeed> {

    public TBFeed2JsonMessageConverter() {
        super(MediaType.TEXT_HTML);
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        if (aClass == TBFeed.class)
            return true;
        return false;
    }

    @Override
    protected TBFeed readInternal(Class<? extends TBFeed> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String content = IOUtils.toString(httpInputMessage.getBody(), Charset.forName("gbk"));
        String jsonStr = content.substring(content.indexOf("(") + 1, content.lastIndexOf(")"));
        return JSONObject.parseObject(jsonStr, aClass);
    }

    @Override
    protected void writeInternal(TBFeed feed, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
