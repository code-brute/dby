package com.dby.shop.domain.impl;

import com.alibaba.fastjson.JSONObject;
import com.dby.shop.config.Constants;
import com.dby.shop.config.base.BaseDomain;
import com.dby.shop.config.cache.CacheConstants;
import com.dby.shop.dao.IAppConfigSDAO;
import com.dby.shop.dao.ISysConfigSDAO;
import com.dby.shop.domain.IWechatAppDOM;
import com.dby.shop.entity.AppConfig;
import com.dby.shop.entity.AppConfigExample;
import com.dby.shop.entity.SysConfig;
import com.dby.shop.entity.SysConfigExample;
import com.dby.shop.utils.cache.DBYCacheManager;

import org.apache.shiro.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.dby.shop.utils.common.DateUtil.dateNow;
import static com.dby.shop.utils.common.Encrypt.encrypt;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:36
 */
@Component
public class WechatAppDOMImpl extends BaseDomain implements IWechatAppDOM {


    private static Logger logger = LoggerFactory.getLogger(WechatAppDOMImpl.class);

    @Autowired
    private IAppConfigSDAO appConfigSDAO;

    @Autowired
    private ISysConfigSDAO sysConfigSDAO;

    @Override
    public String login(String code,String nickName) {
        //创建OkHttpClient对象
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria()
                .andPrptyEqualTo("appid").andStatusEqualTo(Constants.AVAILABLE_DATA);

        SysConfigExample.Criteria criteria1 = sysConfigExample.createCriteria()
                .andPrptyEqualTo("secret").andStatusEqualTo(Constants.AVAILABLE_DATA);

        sysConfigExample.or(criteria1);
        String appid = "";
        String secret = "";
        List<SysConfig> sysConfigs = sysConfigSDAO.selectByExample(sysConfigExample);
        logger.debug("{}", sysConfigs);
        if(Objects.nonNull(sysConfigs) && !sysConfigs.isEmpty()){
            for (SysConfig sysConfig : sysConfigs) {
                if ("appid".equals(sysConfig.getPrpty())) {
                    appid = sysConfig.getPrptyValue();
                } else if ("secret".equals(sysConfig.getPrpty())) {
                    secret = sysConfig.getPrptyValue();
                }
            }
        }

        StringBuilder url = new StringBuilder("https://api.weixin.qq.com/sns/jscode2session")
                .append("?appid=").append(appid)
                .append("&secret=").append(secret).append("&js_code=")
                .append(code).append("&grant_type=authorization_code");

        logger.debug("小程序登录验证url: {}", url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //请求接口。如果需要传参拼接到接口后面。
                .url(url.toString())
                //创建Request 对象
                .build();
        Response response;
        String appSession = null;
        try {
            //得到Response 对象
            response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                JSONObject jsonObject = JSONObject.parseObject(response.body().string());
                logger.debug("小程序登录验证返回结果为：{}", jsonObject);
                String sessionKey = jsonObject.getString("session_key");
                String openId = jsonObject.getString("openid");
                appSession= encrypt(sessionKey, openId);
                // 将 openID sessionKey 记录进 表中
                AppConfig appConfig = insertAppconfig(code,nickName, sessionKey, openId, appSession);

                Cache cache = DBYCacheManager.getInstance().getCache(CacheConstants.SESSION_KEY);
                cache.put(appSession, appConfig);
            }

        } catch (IOException e) {
            logger.error(e.getMessage(),e);
        }
        return appSession;
    }


    private AppConfig insertAppconfig(String code,String nickName, String sessionKey, String openId, String appSession) {

        // 需要先查询之前的数据，如果存在则删除
        deleteAppConfigByOpenId(nickName, openId);

        AppConfig appConfig = new AppConfig();
        appConfig.setOpenId(openId);
        appConfig.setSessionKey(sessionKey);
        appConfig.setAppSession(appSession);
        appConfig.setStatus(Constants.AVAILABLE_DATA);
        appConfig.setLastModifyBy(nickName);
        appConfig.setCreateBy(nickName);
        appConfig.setCreateDate(dateNow());
        appConfig.setLastModifyDate(dateNow());
        appConfig.setAppCode(code);
        appConfigSDAO.insert(appConfig);
        return appConfig;
    }


    public void deleteAppConfigByOpenId(String nickName, String openId) {
        AppConfigExample appConfigExample = new AppConfigExample();
        appConfigExample.createCriteria().andOpenIdEqualTo(openId).andLastModifyByEqualTo(nickName);
        appConfigSDAO.deleteByExample(appConfigExample);
    }

}
