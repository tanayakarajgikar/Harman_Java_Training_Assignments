package com.orderapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderapp.model.dto.OrderRequst;
import com.orderapp.model.dto.Product;
@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getProductFallback")
	public Product getProduct(OrderRequst orderRequst) {
		return restTemplate.getForObject
				("http://PRODUCT-APP/productapp/products/"+ orderRequst.getProductId(),
						Product.class);
	}

	public Product getProductFallback(OrderRequst orderRequst) {
		return new Product(1, "Laptop", 570000);
	}
	
}
