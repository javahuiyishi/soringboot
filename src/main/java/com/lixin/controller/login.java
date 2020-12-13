package com.lixin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @RequestMapping(value = "main",method = RequestMethod.POST)
    public  String test(String name){
        String a ="www";
        System.out.println(a);
        return "1111";
    }
}
