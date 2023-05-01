package com.customer.springboot.restapi;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.springboot.entity.*;


@FeignClient("GATEWAY-SERVER")
public interface CustomerRestApi {
	@GetMapping("/customers/{cId}")
	Customer getCustomer(@PathVariable("cId")int cId);
	@GetMapping("/customers")
	List<Customer> getCustomers();
	
	
}
