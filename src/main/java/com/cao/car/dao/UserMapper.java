package com.cao.car.dao;

import com.cao.car.pojo.Car;
import com.cao.car.pojo.User;
import com.cao.car.pojo.UserMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public UserMessage getmessage(Integer number);

    public boolean addUser(UserMessage userMessage);

    public boolean changeUser(UserMessage userMessage);

    public boolean deleteUser(Integer id);

    public  List<Car> searchCar(Integer master);

}
