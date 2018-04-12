package com.dby.shop.config.cache;


import com.dby.shop.config.message.MessageResourceConfiguration;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;

/**
 * 缓存配置
 * @Description: ehcache 配置
 * @author: Mitnick
 * @date: 2017-08-22 15:12
 */
@Configuration
@EnableCaching
@AutoConfigureAfter(MessageResourceConfiguration.class)
public class CacheConfiguration {

    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        factoryBean.setConfigLocation(new ClassPathResource("config/cache/ehcache-config.xml"));
        factoryBean.setShared(true);
        return factoryBean;
    }

    /**
     * 缓存管理器  org.apache.shiro.cache
     */
    @Bean(name = "shiroCacheManager")
    @Primary
    public CacheManager shiroCacheManager(EhCacheManagerFactoryBean ehCacheManagerFactoryBean) {
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManager(ehCacheManagerFactoryBean.getObject());
        return ehCacheManager;
    }
}
