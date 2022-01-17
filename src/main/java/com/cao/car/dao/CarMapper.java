package com.cao.car.dao;

import com.cao.car.pojo.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarMapper {

    public Car getCar(Integer master);

    public boolean addCar(Integer id , Car car);

    public boolean deleteCar(Integer id);

    public List<String> getCarLocation(Integer id);
}
