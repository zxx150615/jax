package com.example.jax.stream.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String userName;
    private String address;
    private Integer sex;

    public Boolean isMan() {
        return sex == 1;
    }
}
