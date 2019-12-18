package com.houzhenguo.demo_1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @GetMapping("/user")
    public String getUser() {
        return "user: "+name +"," +age;
    }
}
