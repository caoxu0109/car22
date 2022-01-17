package com.cao.car.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer number;
    String name;
    String password;
    String jurisdiction;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
