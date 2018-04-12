package com.dby.shop.utils.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: Mitnick
 * @Date: 2017-08-22 11:39
 */
@Component
public class HttpTimeFilter implements Filter{
    private final Logger log = LoggerFactory.getLogger(HttpTimeFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURL = request.getRequestURI();
        if(requestURL.contains("/api")){
            StopWatch stopWatch = new StopWatch(requestURL + System.currentTimeMillis());
            stopWatch.start();
            filterChain.doFilter(servletRequest,servletResponse);
            stopWatch.stop();
            log.debug(requestURL + " " + stopWatch.getTotalTimeMillis() + "ms");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
