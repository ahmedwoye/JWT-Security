package com.alibou.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @GetMapping("/")
    public String WoyeMap(){
        return "Love to code in SpringBoot";
    }
}
