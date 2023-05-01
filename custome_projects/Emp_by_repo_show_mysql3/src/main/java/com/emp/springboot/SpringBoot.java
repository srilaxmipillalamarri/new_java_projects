package com.emp.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
@SpringBootApplication
@ComponentScan(basePackages="com.emp")
public class SpringBoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBoot.class,args);
	}

}
