package com.customer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages="com.customer")
public class SpringBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBoot.class, args);
	}

}
