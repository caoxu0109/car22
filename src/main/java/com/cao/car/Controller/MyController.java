package com.cao.car.Controller;

import com.cao.car.dao.LoginUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    LoginUserMapper userMapper;
    @RequestMapping("/")
    public String toadminlogin(){
        return "AdminLogin";
    }

}
