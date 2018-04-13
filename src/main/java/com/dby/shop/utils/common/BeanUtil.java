package com.dby.shop.utils.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: mitnick
 * @date: 2017-10-23 下午5:27
 */
@Component
public class BeanUtil implements ApplicationContextAware {
    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtil.context = applicationContext;
    }

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    public static <T> T getBean(String beanName, Class<T> tClass) {
        return context.getBean(beanName, tClass);
    }

    public static <T> T getBean(Class<T> tClass) {
        return context.getBean(tClass);
    }
}
