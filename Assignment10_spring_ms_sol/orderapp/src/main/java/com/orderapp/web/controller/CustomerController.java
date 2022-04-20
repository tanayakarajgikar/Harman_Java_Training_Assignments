package com.orderapp.web.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderapp.model.dto.Coupon;
import com.orderapp.model.dto.Customer;
import com.orderapp.model.dto.OrderRequst;
import com.orderapp.model.dto.OrderResponse;
import com.orderapp.model.dto.OrderStatus;
import com.orderapp.model.dto.Product;
import com.orderapp.model.service.CouponService;
import com.orderapp.model.service.CustomerService;
import com.orderapp.model.service.ProductService;

@RestController
public class CustomerController {
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CouponService couponService;
	
	
	@PostMapping(path = "orders")
	public ResponseEntity<OrderResponse> processOrder(@RequestBody OrderRequst orderRequst){
		//What i need to to : {}
		
		Customer customer= customerService.getCustomer(orderRequst);
		Product product= productService.getProduct(orderRequst);
		Coupon coupon=couponService.getCoupon(orderRequst);
		
		double totalPrice= 
				product.getPrice()*(100-coupon.getDiscountPercentage())*orderRequst.getQty()*.01;
				
		OrderResponse orderResponse=
				OrderResponse.builder()
				.id(UUID.randomUUID().toString())
				.coupon(coupon)
				.product(product)
				.customer(customer)
				.totalPrice(totalPrice)
				.orderStatus(OrderStatus.PLACED)
				.orderDate(LocalDate.now())
				.build();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
	}

	
	
	
}






