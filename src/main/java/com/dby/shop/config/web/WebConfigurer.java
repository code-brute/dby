package com.dby.shop.config.web;


import com.dby.shop.config.database.DatabaseConfiguration;
import com.dby.shop.utils.filter.HttpTimeFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Configuration of web application with Servlet 3.0 APIs.
 * @author mitnick
 */
@Configuration
@EnableAutoConfiguration
@AutoConfigureAfter(DatabaseConfiguration.class)
public class WebConfigurer extends WebMvcConfigurerAdapter implements ServletContextInitializer, EmbeddedServletContainerCustomizer {

    private final Logger log = LoggerFactory.getLogger(WebConfigurer.class);

    @Autowired
    private Environment env;

    // 自定义注解配置
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
//        argumentResolvers.add(new CurrentUserMethodArgumentResolver());
//        argumentResolvers.add(new TableNameMethodArgumentResolver());
    }

    /**
     * 添加自定义的静态资源映射
     这里使用代码的方式自定义目录映射，并不影响Spring Boot的默认映射，可以同时使用。
     */
   /* @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/")
                .addResourceLocations("file:" + env.getProperty("system.upload")+"**");
    }*/

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("Web application configuration, using profiles: {}", Arrays.toString(env.getActiveProfiles()));
        EnumSet<DispatcherType> enumSetDis = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ASYNC);
        log.info("Web application fully configured");
    }

    /**
     * Set up Mime types.
     */
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
        // IE issue, see https://github.com/jhipster/generator-jhipster/pull/711
        mappings.add("html", "text/html;charset=utf-8");
        // CloudFoundry issue, see https://github.com/cloudfoundry/gorouter/issues/64
        mappings.add("json", "text/html;charset=utf-8");
        container.setMimeMappings(mappings);
    }

    @Bean
    public FilterRegistrationBean httpTimeFilterRegistration(HttpTimeFilter httpTimeFilter) {
        log.debug("Filter初始化：开始注册 httpTimeFilter ");
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(httpTimeFilter);
        registration.addUrlPatterns("/*");
        registration.setName("HttpTimeFilter");
        registration.setOrder(1);
        log.debug("Filter初始化：成功注册 httpTimeFilter ");
        return registration;
    }


    @Bean
    public HttpTimeFilter httpTimeFilter() {
        return new HttpTimeFilter();
    }
}
