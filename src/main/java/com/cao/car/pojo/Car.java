package com.cao.car.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
   private String Carid;
   private String type;
   private Integer master;
  // private List<String> location;
}
