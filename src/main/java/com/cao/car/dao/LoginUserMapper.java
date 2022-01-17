package com.cao.car.dao;


import com.cao.car.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface LoginUserMapper {

   public User SearchUser(String name);

}
