package com.dby.shop.utils.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午1:08
 */
public class SecurityRealm extends AuthorizingRealm {

    private final Logger logger = LoggerFactory.getLogger(SecurityRealm.class);
    @Autowired
    private Environment environment;


    /**
     * 登录成功标志
     */
    private static final String LOGIN_LOG_SUCCESS = "A";


    private static final String LOGIN_LOG_ERROR = "P";

    /**
     * 登录验证通用错误
     */
    public static final String ACCOUNT_COMMONS_EXCEPTION_MSG = "fast.login.validation.common.error";

    private Boolean captchaEnable = null;

    @PostConstruct
    public void initParam() {
        captchaEnable = environment.getProperty("system.login.captchaEnable", Boolean.class, false);
    }

    /**
     * 获取用户权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        SysUser sysUser = (SysUser) principalCollection.getPrimaryPrincipal();
//        if (Objects.isNull(sysUser)) {
//            logger.debug("获取鉴权信息：获取鉴权信息失败，无法获取登录用户信息。");
//            return null;
//        }
//        StopWatch stopWatch = new StopWatch(sysUser.getLoginName() + System.currentTimeMillis());
//        stopWatch.start();
//        logger.debug("获取鉴权信息：开始获取登录用户【{}】鉴权信息", sysUser.getLoginName());
//
//        // 获取用户权限 // 获取用户角色
//
//        SimpleAuthorizationInfo simpleAuthorizationInfo = ISecurityRealmService
//                .doGetAuthorizationInfo(sysUser);
//
//        stopWatch.stop();
//        logger.debug("获取鉴权信息：成功获取登录用户【{}】鉴权信息", sysUser.getLoginName());
//        return simpleAuthorizationInfo;
        return null;
    }


    /**
     * 用户登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        logger.debug("获取认证信息：开始获取登录用户【{}】认证信息", token.getUsername());
//
//        logger.debug("获取认证信息：开始校验用户【{}】是否存在", token.getUsername());
//        logger.debug("获取认证信息：开始数据库验证登录用户【{}】信息", token.getUsername());
//        StopWatch stopWatch = new StopWatch(token.getUsername() + System.currentTimeMillis());
//        stopWatch.start();
//        SysUser sysUser;
//        try {
//            sysUser = this.ISecurityRealmService.doGetAuthenticationInfo(token.getUsername());
//        } catch (Exception e) {
//            logger.error("获取认证信息：获取登录用户【{}】鉴权信息时发生异常：{}", token.getUsername(), e.getMessage());
//            throw new AccountUnknownException(i18nCN("fast.login.unknown.sys.exception"));
//        }
//
//        if (sysUser == null) {
//            logger.debug("获取认证信息：登录用户【{}】不存在", token.getUsername());
//            throw new AccountStatusException("用户不存在");
//        }
//        logger.debug("获取认证信息：校验用户【{}】是否存在完成", token.getUsername());
//
//        logger.debug("获取认证信息：开始校验用户【{}】状态", token.getUsername());
//        /*****开始校验用户状态  用户状态 10 初始状态
//         10 新注册用户
//         20 有效状态
//         60  锁定状态
//         99 失效状态****/
//        logger.debug("获取认证信息：开始校验用户【{}】密码", token.getUsername());
//        if (SysUserEnums.DISABLE_USER.getCode().equals(sysUser.getStatus())) {
//            logger.debug("获取认证信息：登录用户【{}】状态异常", token.getUsername());
//            throw new AccountDisabledException("该用户已经被禁用，请联系管理员");
//        }
//        if (SysUserEnums.INVALID_USER.getCode().equals(sysUser.getStatus())) {
//            logger.debug("获取认证信息：登录用户【{}】状态异常", token.getUsername());
//            throw new AccountUnknownException("该用户为无效用户，请联系管理员");
//        }
//        logger.debug("获取认证信息：用户【{}】登陆状态校验完成", token.getUsername());
//        logger.debug("获取认证信息：校验用户【{}】密码是否过期开始", token.getUsername());
//        if (dateNow().getTime() > sysUser.getPwdInactiveTime().getTime()) {
//            logger.debug("获取认证信息：登录用户【{}】状态异常", token.getUsername());
//            throw new InactivePasswordException("密码已经过期，请联系管理员");
//        }
//        logger.debug("获取认证信息：校验用户【{}】密码是否过期完成", token.getUsername());
//
//        /*****校验用户状态结束****/
//
//        logger.debug("获取认证信息：完成数据库验证登录用户【{}】信息", token.getUsername());
//        stopWatch.stop();
//        logger.debug("用户登陆总耗时：{} ms", stopWatch.getTotalTimeMillis());
//
//        Integer orgId = null;
//        String repoCode = null;
//
//        try {
//            //根据登陆员工查询登陆员工部门
//            OrganizationUser organizationUser = new OrganizationUser();
//            organizationUser.setStaffId(sysUser.getStaffId());
//            organizationUser.setStatus(Constants.AVAILABLE_DATA);
//            List<OrganizationUser> organizationUserList = organizationUserMDAO.selectListSelective(organizationUser);
//            if(Objects.nonNull(organizationUserList) && !organizationUserList.isEmpty()){
//                orgId = organizationUserList.get(0).getOrganizationId();
//            }
//        } catch (Exception e) {
//            logger.error("登录时查询员工部门出错 ，{}",e.getMessage(),e);
//        }
//
//        //查询部门对应的仓库
//        try {
//            AssetsRepositoryDTO assetsRepository = new AssetsRepositoryDTO();
//            assetsRepository.setOwnDept(orgId);
//            assetsRepository.setStatus(Constants.AVAILABLE_DATA);
//            List<AssetsRepositoryDTO> assetsRepositoryList = assetsRepositoryMDAO.queryRepositoryList(assetsRepository,"ID");
//            if(Objects.nonNull(assetsRepositoryList) && !assetsRepositoryList.isEmpty()){
//                repoCode = assetsRepositoryList.get(0).getCode();
//            }
//        } catch (Exception e) {
//            logger.error("登录时查询部门对应仓库出错 ，{}",e.getMessage(),e);
//        }
//
//        try {
//            SysStaff sysStaff = sysStaffMDAO.selectByPrimaryKey(sysUser.getStaffId());
//
//            sysUser.setName(sysStaff.getName());
//            sysUser.setGender(sysStaff.getGender());
//            sysUser.setOrganizationId(orgId);
//            sysUser.setRepoCode(repoCode);
//        } catch (Exception e) {
//            logger.error("登录时查询员工staff出错 ，{}",e.getMessage(),e);
//        }
//
//        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                sysUser,
//                sysUser.getPassword(),
//                ByteSource.Util.bytes(sysUser.getCredentialsSalt()),
//                getName());
//        return authenticationInfo;
        return null;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }
}
