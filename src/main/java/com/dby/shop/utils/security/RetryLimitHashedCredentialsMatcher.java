package com.dby.shop.utils.security;

import com.dby.shop.utils.security.exception.ErrorPasswordException;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午1:09
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {

    Logger logger = LoggerFactory.getLogger(RetryLimitHashedCredentialsMatcher.class);

    @Autowired
    private Environment environment;

    private Cache<String, AtomicInteger> passwordRetryCache;


    private final static int INITIAL_VALUE = 0;// 初始值

    private Boolean loginLimit = null;// 是否开启登录失败次数的限制

    private Integer retryCountLimit = null;

    @PostConstruct
    public void initParam() {
        loginLimit = environment.getProperty("system.login.limit", Boolean.class, false);
        retryCountLimit = environment.getProperty("system.login.retryCount", Integer.class, 0);
    }


    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

        String username = (String) token.getPrincipal();
        logger.debug("获取认证信息：开始校验用户【{}】连续登陆失败次数", username);
        //retry count + 1
        AtomicInteger retryCount = passwordRetryCache.get(username);

        if (retryCount == null) {
            retryCount = new AtomicInteger(INITIAL_VALUE);
            passwordRetryCache.put(username, retryCount);
        }
        if (retryCount.incrementAndGet() > retryCountLimit) {
            //if retry count > 5 throw
            logger.debug("获取认证信息：您 【{}】 已连续登录失败次数【{}】", username, retryCount.get());
            throw new ExcessiveAttemptsException("连续登录失败次数过多");
        }
        logger.debug("获取认证信息：校验用户【{}】连续登陆失败次数完成", username);

        logger.debug("获取认证信息：开始校验用户【{}】密码", username);
        boolean matches = super.doCredentialsMatch(token, info);
        logger.debug("matches" + matches);
        if (matches) {
            //clear retry count
            passwordRetryCache.remove(username);
        } else {
            throw new ErrorPasswordException("登陆密码不正确！");
        }
        logger.debug("获取认证信息：校验用户【{}】密码完成", username);
        return matches;

    }
}