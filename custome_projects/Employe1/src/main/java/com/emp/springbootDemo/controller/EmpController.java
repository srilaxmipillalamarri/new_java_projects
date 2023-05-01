package com.emp.springbootDemo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@RestController
//@Controller
//@RequestMapping("/emp")
public class EmpController {
	@RequestMapping("/display")
	public String display() {
		return "hello new one";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hi sri how are you";
		
	}
	
		
	}

