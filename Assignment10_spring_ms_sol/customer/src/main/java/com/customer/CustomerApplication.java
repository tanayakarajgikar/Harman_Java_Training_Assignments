package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner{

	@Autowired
	private CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerService.addCustomer(new Customer("raj", "raj@gmail.com"));
		customerService.addCustomer(new Customer("ekta", "ekta@gmail.com"));
	}

}
