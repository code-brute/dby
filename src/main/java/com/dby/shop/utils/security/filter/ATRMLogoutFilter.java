package com.dby.shop.utils.security.filter;

import org.apache.shiro.web.filter.authc.LogoutFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description:
 * @Author: mitnick
 * @Date: 2017-10-18 下午4:08
 */
public class ATRMLogoutFilter extends LogoutFilter{
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        return true;
    }
}
