package com.customer.springboot.service;
import org.springframework.stereotype.Service;

import com.customer.springboot.entity.Customer;
import com.customer.springboot.repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	public CustomerServiceImpl() {
		
	}
	public Customer getCustomer(int cId) {
		return customerRepository.findById(cId).get();
	}
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	public void insertCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}
	public void updateCustomer(int cId,Customer customer) {
		customerRepository.save(customer);
		
	}
	public void deleteCustomer(int cId) {
		customerRepository.deleteById(cId);
		
	}
	
	
}
