package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.CustomerRepo;
import com.customer.entity.Customer;
import com.customer.exceptions.CustomerNotFoundException;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		 customerRepo.save(customer);
		 return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).orElseThrow(CustomerNotFoundException:: new);
	}

}
