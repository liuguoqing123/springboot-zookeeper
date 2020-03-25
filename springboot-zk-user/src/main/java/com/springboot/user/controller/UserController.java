package com.springboot.user.controller;

import com.springboot.user.feiginInterface.SayHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Bean
    public RestTemplate restTemplate (RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    SayHelloFeign sayHelloFeign;

/*    @GetMapping("/userSay")
    public String userSay(){
        System.out.println("进去/userSay方法。");

        //ribbon方式负载均衡
        String [] targetAddress = new String []
                {"http://localhost:8080/say","http://localhost:8081/say"};
        //1.地址很多的话，难以维护。2.服务端地址发生变化（动态生效）
        //3.服务提供方的动态感知
        //String targetUrl = Ribbon();
        //String rs = restTemplate.getForObject(targetUrl,String.class);
        String rs = restTemplate.getForObject("http://localhost:8080/say",String.class);
        return rs;
    }*/

    @GetMapping("/userSay")
    public String userSay(){
       return sayHelloFeign.say();
    }
}
