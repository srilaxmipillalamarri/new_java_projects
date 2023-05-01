package com.customer.springboot.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.MediaType;

import com.customer.springboot.entity.Customer;
import com.customer.springboot.service.*;
@RestController
@RequestMapping("/cosumter-api")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	public CustomerController() {
	}
	
	//functions
	@GetMapping(value= "customer/{cId}",produces={ MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
	public Customer getCustomer(@PathVariable("cId")int cId) {
		return customerService.getCustomer(cId);
	}
	
	@GetMapping(value="/customers",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	@PostMapping(value="/customer",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
	public void insertCustomer(@RequestBody Customer customer) {
		customerService.insertCustomer(customer);
		
	}
	@PutMapping(value="/customer",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
	public void updateCustomer(@PathVariable("cId")int cId,@RequestBody Customer customer) {
		customerService.updateCustomer(cId,customer);
	}
	
	@DeleteMapping(value="/customer",produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
	public  void deleteCustomer(@PathVariable("cId")int cId) {
		customerService.deleteCustomer(cId);
	}
}
