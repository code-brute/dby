package com.dby.shop.utils.cache;


import com.dby.shop.utils.common.BeanUtil;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.session.mgt.SessionManager;

/**
 * @Description:
 * @author: mitnick
 * @date: 2017-10-23 下午5:17
 */
public class DBYCacheManager {

    protected static CacheManager instance;
    protected static SessionManager sessionManagerInstance;

    public static CacheManager getInstance() {
        if (instance == null) {
            instance = BeanUtil.getBean("shiroCacheManager", CacheManager.class);
        }
        return instance;
    }

    public static SessionManager getSessionManagerInstance(){
        if(sessionManagerInstance == null){
            sessionManagerInstance = BeanUtil.getBean("defaultWebSessionManager", SessionManager.class);
        }
        return sessionManagerInstance;
    }
}
