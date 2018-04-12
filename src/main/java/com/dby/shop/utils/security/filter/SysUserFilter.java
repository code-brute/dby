package com.dby.shop.utils.security.filter;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * @Description:
 * @author: Mitnick
 * @date: 2017-08-21 14:23
 */
@Component
public class SysUserFilter extends PathMatchingFilter {

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

//        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
//        request.setAttribute(SYS_USER,sysUser);

        return true;
    }
}
