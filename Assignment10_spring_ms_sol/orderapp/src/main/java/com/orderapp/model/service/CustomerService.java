package com.orderapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderapp.model.dto.Customer;
import com.orderapp.model.dto.OrderRequst;

@Service
public class CustomerService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getCustomerFallback")
	public Customer getCustomer(OrderRequst orderRequst) {
		return restTemplate.getForObject
				("http://CUSTOMER-APP/customerapp/customers/"+
		orderRequst.getCustomerId(), Customer.class);
	}
	

	public Customer getCustomerFallback(OrderRequst orderRequst) {
		return new Customer(1, "ravi", "ravi@gmail.com");
	}
}
