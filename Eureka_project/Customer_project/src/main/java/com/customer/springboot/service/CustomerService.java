package com.customer.springboot.service;
import com.customer.springboot.entity.Customer;
import java.util.*;
public interface CustomerService {
	public Customer getCustomer(int cId);
	public List<Customer> getCustomers();
	public void insertCustomer(Customer customer);
	public void updateCustomer(int cId,Customer customer);
	public  void deleteCustomer(int cId);
	
}
