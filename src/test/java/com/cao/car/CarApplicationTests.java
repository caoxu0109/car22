package com.cao.car;

import com.cao.car.severce.AdminService;
import com.cao.car.severce.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class CarApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();

        simpleMailMessage.setSubject("包子你好呀~");
        simpleMailMessage.setText("滴滴滴滴滴");
        simpleMailMessage.setTo("2942770852@qq.com");
        simpleMailMessage.setFrom("2837128824@qq.com");
        javaMailSender.send(simpleMailMessage);

    }

}
