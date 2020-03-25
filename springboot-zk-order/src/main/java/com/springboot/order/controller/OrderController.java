package com.springboot.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/say")
    public String userSay(){
        System.out.println("进入/say方法。");
        return "hello world!";
    }
}
