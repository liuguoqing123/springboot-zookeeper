package com.springboot.user.feiginInterface;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("springboot-zk-order")//服务提供者的名字
public interface SayHelloFeign {

    @GetMapping("/say")
    String say();


}
