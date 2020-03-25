package com.springboot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootZkUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZkUserApplication.class, args);
		System.out.println("++++++++++++++++SpringbootZkUserApplication++++++++++++++++");
	}

}
