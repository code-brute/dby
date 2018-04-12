package com.dby.shop.utils.security;

import com.dby.shop.config.cache.CacheConfiguration;
import com.dby.shop.utils.security.filter.DBYFormAuthenticationFilter;
import com.dby.shop.utils.security.filter.ATRMLogoutFilter;
import com.dby.shop.utils.security.filter.KickoutSessionControlFilter;
import com.dby.shop.utils.security.filter.SysUserFilter;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.mgt.RememberMeManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.ServletContainerSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import java.util.LinkedHashMap;

import javax.servlet.Filter;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午1:07
 */

@Configuration
@AutoConfigureAfter(CacheConfiguration.class)
public class SecurityConfiguration implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;

    private static final String REMEMBER_ME_COOKIE_NAME = "REMEMBER_ME";

    private static final String COOKIE_REMEMBER_ME_PROPERTIES = "cookie-remember-me";

    private static final String PREFIX = "system.security.";

    private static final String SPRING_SESSION_OPEN = "spring-session-open";

    private static final String SESSION_ID_COOKIE_NAME = "ATRM_SESSION_ID";

    private static final String SESSION_DAO_CACHE_NAME = "shiroActiveSessionCache";

    private static final String HASH_ALGORITHM_NAME = "md5";

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, PREFIX);
    }

    public final Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);

    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        logger.debug("SECURITY初始化：开始初始化 【ShiroFilterFactoryBean】");
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
//         如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/api/login");
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        filterChainDefinitionMap.put("/assets/**", "anon");
        filterChainDefinitionMap.put("/bower_components/**", "anon");
        filterChainDefinitionMap.put("/sass/**", "anon");
        filterChainDefinitionMap.put("/scripts/**", "anon");
        filterChainDefinitionMap.put("/api/app/**", "anon");
        //通过二维码扫描查询资产详情api
        filterChainDefinitionMap.put("/api/assets/ledger/qrCode","anon");
        filterChainDefinitionMap.put("/api/login", "authc");
        filterChainDefinitionMap.put("/api/logout", "logout");
        filterChainDefinitionMap.put("/api/**", "authc,sysUser,kickout");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        // 过滤器
        LinkedHashMap<String, Filter> filterLinkedHashMap = new LinkedHashMap<>();
        filterLinkedHashMap.put("authc", new DBYFormAuthenticationFilter());
        filterLinkedHashMap.put("sysUser", new SysUserFilter());
        filterLinkedHashMap.put("logout", new ATRMLogoutFilter());
        filterLinkedHashMap.put("kickout", new KickoutSessionControlFilter());
        shiroFilterFactoryBean.setFilters(filterLinkedHashMap);
        logger.debug("SECURITY初始化：初始化【ShiroFilterFactoryBean】完成。");
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(SecurityRealm securityRealm, RememberMeManager rememberMeManager, CacheManager shiroCacheManager, SessionManager sessionManager) {
        logger.debug("SECURITY初始化：开始初始化 【SecurityManager】。");
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(securityRealm);
        defaultWebSecurityManager.setSessionManager(sessionManager);
        defaultWebSecurityManager.setCacheManager(shiroCacheManager);
        defaultWebSecurityManager.setRememberMeManager(rememberMeManager);

        logger.debug("SECURITY初始化：初始化【SecurityManager】完成。");
        return defaultWebSecurityManager;
    }

    /**
     * rememberMe 管理器
     */
    @Bean
    public RememberMeManager rememberMeManager(SimpleCookie simpleCookie) {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        // rememberMe cookie 加密的密钥 建议每个项目都不一样 默认AES 算法 密钥 长度（128 256 512） 位
        cookieRememberMeManager.setCipherKey(Base64.decode("4AvVhmFLUs0KTA3Kprsdag=="));
        cookieRememberMeManager.setCookie(simpleCookie);
        return cookieRememberMeManager;
    }

    /**
     * 记住密码cookie
     */
    @Bean
    public SimpleCookie simpleCookie() {
        SimpleCookie simpleCookie = new SimpleCookie(REMEMBER_ME_COOKIE_NAME);
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(Integer.parseInt(propertyResolver.getProperty(COOKIE_REMEMBER_ME_PROPERTIES)));
        return simpleCookie;
    }



    /**
     * spring session管理器（多机环境）
     */
    @Bean
    @ConditionalOnProperty(prefix = "system.security", name = SPRING_SESSION_OPEN, havingValue = "true")
    public ServletContainerSessionManager servletContainerSessionManager() {
        return new ServletContainerSessionManager();
    }

    /**
     * session管理器(单机环境)
     */
    @Bean
    @Primary
    @ConditionalOnProperty(prefix = "system.security", name = SPRING_SESSION_OPEN, havingValue = "false")
    public DefaultWebSessionManager defaultWebSessionManager(SessionDAO sessionDAO, SimpleCookie sessionIdCookie, CacheManager cacheShiroManager) {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setCacheManager(cacheShiroManager);
        // 多久检测一次失效的session 只在单机环境下失效。
        sessionManager.setSessionValidationInterval(Long.parseLong(propertyResolver.getProperty("session-validation-interval")));
        // session 失效时间，只在单机环境下生效，
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setGlobalSessionTimeout(Long.parseLong(propertyResolver.getProperty("session-invalidate-time")));
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setSessionDAO(sessionDAO);
        sessionManager.setSessionIdCookieEnabled(true);
        sessionManager.setSessionIdCookie(sessionIdCookie);
        return sessionManager;
    }

    /**
     * 凭证匹配器
     */
    @Bean
    public RetryLimitHashedCredentialsMatcher retryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        RetryLimitHashedCredentialsMatcher retryLimitHashedCredentialsMatcher = new RetryLimitHashedCredentialsMatcher(cacheManager);
        //算法
        retryLimitHashedCredentialsMatcher.setHashAlgorithmName(HASH_ALGORITHM_NAME);
        //生成Hash值的迭代次数
        retryLimitHashedCredentialsMatcher.setHashIterations(2);
        //默认是 true,此时用的是密码加密用的是 Hex 编码;false 时用 Base64 编码
        retryLimitHashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
        return retryLimitHashedCredentialsMatcher;
    }

    /**
     * 会话凭证生成器
     */
    @Bean
    public JavaUuidSessionIdGenerator sessionIdGenerator() {
        return new JavaUuidSessionIdGenerator();
    }


    /**
     * 会话Cookie模板
     */
    @Bean
    public SimpleCookie sessionIdCookie() {
        SimpleCookie simpleCookie = new SimpleCookie(SESSION_ID_COOKIE_NAME);
        //在支持HttpOnly cookies的浏览器中（IE6+，FF3.0+），
        // 如果在Cookie中设置了"HttpOnly"属性，那么通过JavaScript脚本将无法读取到Cookie信息，
        // 这样能有效的防止XSS攻击，让网站应用更加安全
        simpleCookie.setHttpOnly(true);
        //会话级cookie，关闭浏览器失效
        simpleCookie.setMaxAge(-1);
        return simpleCookie;
    }

    /**
     * 会话DAO
     */
    @Bean
    public EnterpriseCacheSessionDAO sessionDAO(JavaUuidSessionIdGenerator sessionIdGenerator) {

        EnterpriseCacheSessionDAO enterpriseCacheSessionDAO = new EnterpriseCacheSessionDAO();
        enterpriseCacheSessionDAO.setActiveSessionsCacheName(SESSION_DAO_CACHE_NAME);
        enterpriseCacheSessionDAO.setSessionIdGenerator(sessionIdGenerator);
        return enterpriseCacheSessionDAO;
    }



    /**
     * 相当于调用SecurityUtils.setSecurityManager(securityManager)
     */
    @Bean
    public MethodInvokingFactoryBean methodInvokingFactoryBean(SecurityManager securityManager) {
        MethodInvokingFactoryBean methodInvokingFactoryBean = new MethodInvokingFactoryBean();
        methodInvokingFactoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
        Object[] objects = new Object[]{securityManager};
        methodInvokingFactoryBean.setArguments(objects);
        return methodInvokingFactoryBean;
    }

    @Bean
    public SecurityRealm securityRealm(RetryLimitHashedCredentialsMatcher retryLimitHashedCredentialsMatcher) {
        SecurityRealm securityRealm = new SecurityRealm();
        securityRealm.setCachingEnabled(true);
        securityRealm.setCredentialsMatcher(retryLimitHashedCredentialsMatcher);
        return securityRealm;
    }
}
