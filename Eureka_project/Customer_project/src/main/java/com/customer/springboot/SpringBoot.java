package com.customer.springboot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
@EnableEurekaClient
@RestController
@RefreshScope
@SpringBootApplication
@ComponentScan(basePackages="com.customer")
public class SpringBoot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBoot.class, args);
	}
	

}
