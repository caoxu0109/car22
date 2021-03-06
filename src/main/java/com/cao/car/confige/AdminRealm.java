package com.cao.car.confige;

import com.cao.car.pojo.User;
import com.cao.car.severce.AdminServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminRealm extends AuthorizingRealm {

    @Autowired
    AdminServiceImpl adminService;


    @Override
    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("==>执行了授权");
        SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
        Subject subject =SecurityUtils.getSubject();
        User user=(User)subject.getPrincipal();

        info.addStringPermission(user.getJurisdiction());

        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("==>执行了认证");

        UsernamePasswordToken userToken =(UsernamePasswordToken) authenticationToken;
        User user = adminService.SearchUser(userToken.getUsername());
        if(user==null) return null;

        return new SimpleAuthenticationInfo(user,user.getPassword(),"");
    }
}
