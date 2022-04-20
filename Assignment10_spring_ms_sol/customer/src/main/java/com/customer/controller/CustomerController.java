package com.customer.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = "customers")
	public List<Customer> getAll(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping(path = "customers/{id}")
	public Customer getAnCustomer(@PathVariable(name = "id") int id){
		return customerService.getCustomerById(id);
	}
}
