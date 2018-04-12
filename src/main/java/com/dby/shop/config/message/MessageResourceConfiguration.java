package com.dby.shop.config.message;


import com.dby.shop.config.web.WebConfigurer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description:
 * @author: Mitnick
 * @date: 2017-08-21 19:21
 */
@Configuration
@AutoConfigureAfter(WebConfigurer.class)
public class MessageResourceConfiguration extends WebMvcConfigurerAdapter implements EnvironmentAware {

    private final Logger logger = LoggerFactory.getLogger(MessageResourceConfiguration.class);
    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.messages.");
    }

    @Bean
    public MessageSource messageSource() {
        logger.debug("MessageSource 初始化：开始加载I18N资源文件：【{}】，【{}】", "messages*.properties");
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:/i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");
        logger.debug("MessageSource 初始化：I18N资源加载完成。");
        return messageSource;
    }
}
