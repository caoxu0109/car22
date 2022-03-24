package com.cao.car.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassCar {
    private String CarId;
    private String type;
    private String time;
    private String master;
    private String title;
}
