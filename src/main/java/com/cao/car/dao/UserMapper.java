package com.cao.car.dao;

import com.cao.car.pojo.Car;
import com.cao.car.pojo.UserMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    public UserMessage getmessage(Integer id);

    public boolean addUser(UserMessage userMessage);




}
