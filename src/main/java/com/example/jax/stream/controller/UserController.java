package com.example.jax.stream.controller;

import com.example.jax.stream.bo.People;
import com.example.jax.stream.bo.Student;
import com.example.jax.stream.bo.User;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserController {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User u1 = new User(1, "zxx", "330", 1);
        User u2 = new User(2, "zxx", "330", 1);
        list.add(u1);
        list.add(u2);
        List<User> manList = list.stream().filter(User::isMan).collect(Collectors.toList());
        List<String> nameList = list.stream().map(User::getUserName).collect(Collectors.toList());

        Map<Integer, String> userMap = list.stream().collect(Collectors.toMap(User::getId, User::getUserName));
        Set<User> set = new HashSet<User>(list);
        List<String> adds = list.stream().map(new Function<User, String>() {
            @Override
            public String apply(User user) {
                return user.getAddress();
            }
        }).collect(Collectors.toList());
        List<Student> s1 = new ArrayList<>();
        Student st1 = new Student();
        st1.setCardId(1);
        st1.setSNo("001");
        st1.setName("曾祥鑫");
        st1.setSex(1);
        s1.add(st1);
        List<People> man = s1.stream().filter(People::isMan).collect(Collectors.toList());
        System.out.print(man.toString());
    }
}
