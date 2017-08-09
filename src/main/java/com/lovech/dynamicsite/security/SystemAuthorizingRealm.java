package com.lovech.dynamicsite.security;

import com.lovech.dynamicsite.entity.User;
import com.lovech.dynamicsite.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by luowq on 2017/8/4.
 */
@Service
public class SystemAuthorizingRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    /**
     * 登录成功后进行角色和权限验证
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * shiro的认证过程最终交由Realm处理，会调用该方法，主要工作：
     * 1.检查提交的认证令牌信息
     * 2.根据令牌信息从数据源中获取用户信息
     * 3.对用户信息进行匹配认证
     * 4.验证通过则返回一个封装了用户信息的AuthorizationInfo实例
     * 5.认证失败则抛出AuthorizationException异常信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) authenticationToken;
        if ("lovech".equals(usernamePasswordToken.getUsername())){
            return new SimpleAuthenticationInfo(usernamePasswordToken.getUsername(),usernamePasswordToken.getPassword(),"test");
        }
        return null;
    }
}
