package com.houzhenguo.demo_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login success";
    }
    @GetMapping("/")
    public String hello() {
        return "welcome to my first springboot web";
    }
}
