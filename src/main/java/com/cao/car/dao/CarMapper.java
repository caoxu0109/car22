package com.cao.car.dao;

import com.cao.car.pojo.Car;
import com.cao.car.pojo.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarMapper {


    public Car getCarbyID(String carID);

    public boolean addCar( Car car);

    public boolean deleteCar(String CarID);

    public List<Location> getCarLocation(String CarID);
}
