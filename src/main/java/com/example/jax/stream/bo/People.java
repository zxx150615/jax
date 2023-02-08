package com.example.jax.stream.bo;

import lombok.Data;

@Data
public abstract class People {

    private Integer cardId;
    private String name;
    private Integer sex;

    public Boolean isMan() {
        return sex == 1;
    }
}
