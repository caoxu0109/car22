package com.cao.car.confige;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        Map<String,String> filterMap = new LinkedHashMap<>();

        filterMap.put("/admin/*","perms[admin]");
        filterMap.put("/User/*","authc");
       // filterMap.put("/admin/*","authc");

        bean.setFilterChainDefinitionMap(filterMap);
        bean.setLoginUrl("/toLogin");//跳转到登录页
        bean.setUnauthorizedUrl("/toLogin");//跳转到未授权的页面
        return bean;
    }


    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("adminRealm") AdminRealm adminRealm){
        DefaultWebSecurityManager SecurityManager = new DefaultWebSecurityManager();
        //关联
        SecurityManager.setRealm(adminRealm);

        return SecurityManager;

    }


    //创建realm对象
    @Bean
    public AdminRealm adminRealm(){
        return new AdminRealm();
    }
}
