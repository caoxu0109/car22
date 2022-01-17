package com.cao.car.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {


    @GetMapping("/adminLogin")
    public String adminLogin(String username, String password, Model model){
        //获取当前用户
        Subject subject= SecurityUtils.getSubject();
        //用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            return "admin/ceshi";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名不存在");
            return "AdminLogin";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "AdminLogin";
        }
    }
}
