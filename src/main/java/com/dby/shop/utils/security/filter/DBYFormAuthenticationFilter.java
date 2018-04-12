package com.dby.shop.utils.security.filter;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: mitnick
 * @Date: 2017-10-18 下午2:40
 */
public class DBYFormAuthenticationFilter extends FormAuthenticationFilter {

    Logger logger = LoggerFactory.getLogger(DBYFormAuthenticationFilter.class);

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject,
                                     ServletRequest request, ServletResponse response) throws Exception {
        SecurityUtils.getSubject().getPrincipal();
        return true;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        logger.debug(" begin onAccessDenied。。。");
        if (isLoginRequest(request, response)) {

            if (isLoginSubmission(request, response)) {
                logger.debug("开始进行用户登录操作。");
                if (logger.isTraceEnabled()) {
                    logger.trace("Login submission detected.  Attempting to execute login.");
                }
                logger.debug("成功进行登录。");
                return executeLogin(request, response);
            } else {
                if (logger.isTraceEnabled()) {
                    logger.trace("Login page view.");
                }
                //allow them to see the login page ;)
                return true;
            }
        } else {
            if (logger.isTraceEnabled()) {
                logger.trace("Attempting to access a path which requires authentication.  Forwarding to the " +
                        "Authentication url [" + getLoginUrl() + "]");
            }
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no_permission 未登录不允许进行api 的访问");
            logger.debug("未登录，不允许进行api 的访问");
            return false;
        }
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
    {
//        if (isLoginRequest(request, response))
//        {
//            if (isLoginSubmission(request, response))
//            {
//                //本次用户登陆账号
//                String username = this.getUsername(request);
//
//                Subject subject = this.getSubject(request, response);
//                //之前登陆的用户
//                SysUser user = (SysUser) subject.getPrincipal();
//                //如果两次登陆的用户不一样，则先退出之前登陆的用户
//                if (username != null && user != null && !username.equals(user.getLoginName()))
//                {
//                    subject.logout();
//                }
//            }
//        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
