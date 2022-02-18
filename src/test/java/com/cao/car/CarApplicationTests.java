package com.cao.car;

import com.cao.car.dao.CarMapper;
import com.cao.car.dao.LocationMapper;
import com.cao.car.dao.LoginUserMapper;
import com.cao.car.dao.UserMapper;
import com.cao.car.pojo.Car;
import com.cao.car.pojo.Location;
import com.cao.car.pojo.UserMessage;
import com.cao.car.severce.AdminService;
import com.cao.car.severce.AdminServiceImpl;
import jdk.nashorn.internal.ir.CallNode;
import lombok.val;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class CarApplicationTests {

    @Autowired
    UserMapper mapper;

    @Test
    void contextLoads() throws SQLException {
        UserMessage user =new UserMessage(2,85132114,"包子","123456@qq.com","山东",123456987);
        boolean b = mapper.changeUser(user);
        System.out.println(b);

    }

}
