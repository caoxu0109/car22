package com.cao.car.dao;

import com.cao.car.pojo.PassCar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PassCarMapper {
    public PassCar Findall();

    public boolean changetitle(PassCar car);
}
