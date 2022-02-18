package com.cao.car.dao;

import com.cao.car.pojo.Car;
import com.cao.car.pojo.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LocationMapper {
    public List<Location> SearchAll();

    public Location SearchLocation(String name);

    public boolean changeLocation(Location location);

    public boolean addLocation(Location location);

    public List<Car> SearchCar(Integer placeid);
}
