package com.dby.shop.utils.security.filter;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-02-06 下午2:28
 */
public class KickoutSessionControlFilter extends AccessControlFilter {

    Logger logger = LoggerFactory.getLogger(KickoutSessionControlFilter.class);
    //踢出之前登录的/之后登录的用户 默认踢出之前登录的用户

    private boolean kickoutAfter = false;

    //同一个帐号最大会话数 默认1

    private int maxSession = 1;

    private Cache<String, Deque<Serializable>> cache;


    private SessionManager sessionManager;



    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return false;
    }


    @Override
    protected synchronized boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

//        if (Objects.isNull(this.cache)) {
//            this.cache = AtrmCacheManager.getInstance().getCache(CacheConstants.SHIRO_KICKOUT_SESSION);
//            logger.debug("init cache {} init sessionManager {}  init cacheManager {} ", this.cache);
//        }
//
//        Subject subject = getSubject(request, response);
//        SysUser sysUser = (SysUser) subject.getPrincipal();
//        Session session = subject.getSession();
//        Serializable sessionId = subject.getSession().getId();
//        logger.debug("{} {} ====cache content {} ",session.getAttribute(CacheConstants.SHIRO_KICKOUT_SESSION), sysUser.getLoginName(), this.cache.get(sysUser.getLoginName()));
//
//        if (Objects.isNull(this.sessionManager)) {
//            this.sessionManager = AtrmCacheManager.getSessionManagerInstance();
//        }
//
//        if(Objects.isNull(this.cache.get(sysUser.getLoginName()))){
//            this.cache.put(sysUser.getLoginName(), new LinkedList<>());
//        }
//
//        if(!this.cache.get(sysUser.getLoginName()).contains(sessionId) && Objects.isNull(session.getAttribute(CacheConstants.SHIRO_KICKOUT_SESSION))){
//            this.cache.get(sysUser.getLoginName()).push(sessionId);
//        }
//
//        if (this.cache.get(sysUser.getLoginName()).size() > 1) {
//            Serializable kicOutSessionId = null;
//            //            如果踢出后者
//            if (kickoutAfter) {
//                kicOutSessionId = this.cache.get(sysUser.getLoginName()).removeFirst();
//            } else {
//                //否则踢出前者
//                kicOutSessionId = this.cache.get(sysUser.getLoginName()).removeLast();
//            }
//            try {
//                Session kicOutSession = sessionManager.getSession(new DefaultSessionKey(kicOutSessionId));
//                if (kicOutSession != null) {
//                    //设置会话的kickout属性表示踢出了
//                    kicOutSession.setAttribute(CacheConstants.SHIRO_KICKOUT_SESSION, true);
//                }
//            } catch (Exception e) {
//                logger.error("{} 登出报错", sysUser.getLoginName());
//            }
//        }
//
//        //如果被踢出了，直接退出，重定向到踢出后的地址
//        if (session.getAttribute(CacheConstants.SHIRO_KICKOUT_SESSION) != null) {
//            //会话被踢出了
//            try {
//                subject.logout();
//            } catch (Exception e) { //ignore
//                logger.error("{} 登出报错", sysUser.getLoginName());
//            }
//            return false;
//        }
        return true;
    }
}
