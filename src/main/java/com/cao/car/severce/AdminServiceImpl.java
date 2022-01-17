package com.cao.car.severce;

import com.cao.car.dao.LoginUserMapper;
import com.cao.car.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    LoginUserMapper userMapper;
    @Override
    public User SearchUser(String name) {

        return userMapper.SearchUser(name);
    }
}
