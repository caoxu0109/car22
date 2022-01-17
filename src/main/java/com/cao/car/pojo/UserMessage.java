package com.cao.car.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {
    Integer id;
    String name;
    String email;
    String location;
    List<Car> cars;
    Integer phone;
}
