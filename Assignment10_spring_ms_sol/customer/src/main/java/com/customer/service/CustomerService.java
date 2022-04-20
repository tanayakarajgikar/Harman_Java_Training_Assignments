package com.customer.service;
import java.util.*;

import com.customer.entity.Customer;
public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	
}
