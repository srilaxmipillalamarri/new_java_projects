package com.emp.springbootDemo.controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
//@RestController
@Controller
@RequestMapping("/emp-api")
public class EmpController {
	@GetMapping("/hello")
	public String display() {
		return "hello new one";
	}

}
