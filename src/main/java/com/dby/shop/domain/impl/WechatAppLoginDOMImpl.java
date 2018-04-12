package com.dby.shop.domain.impl;

import com.dby.shop.config.base.BaseDomain;
import com.dby.shop.domain.IWechatAppLoginDOM;
import com.dby.shop.service.impl.WechatAppLoginServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:36
 */
@Component
public class WechatAppLoginDOMImpl extends BaseDomain implements IWechatAppLoginDOM {


    private static Logger logger = LoggerFactory.getLogger(WechatAppLoginDOMImpl.class);

    @Override
    public void login() {
        //创建OkHttpClient对象
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //请求接口。如果需要传参拼接到接口后面。
                //https://api.weixin.qq.com/sns/jscode2session
                // ?appid=APPID&secret=SECRET&
                // js_code=JSCODE&grant_type=authorization_code
                .url("")
                //创建Request 对象
                .build();
        Response response;
        try {
            //得到Response 对象
            response = client.newCall(request).execute();
            logger.debug("{}",response);
            if (response.isSuccessful()) {
                logger.debug("kwwl", "response.code() {}" , response.code());
                logger.debug("kwwl", "response.message() {}" , response.message());
                logger.debug("kwwl", "res {}" ,response.body().string());
            }
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
        }
    }

    public static void main(String[] args) {
        WechatAppLoginDOMImpl wechatAppLoginDOM = new WechatAppLoginDOMImpl();
        wechatAppLoginDOM.login();
    }
}
