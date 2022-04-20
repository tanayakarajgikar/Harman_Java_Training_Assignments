package com.orderapp.model.service;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderapp.model.dto.Coupon;
import com.orderapp.model.dto.OrderRequst;
@Service
public class CouponService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getCouponFallback")
	public Coupon getCoupon(OrderRequst orderRequst) {
		return restTemplate.getForObject
				("http://COUPON-APP/couponapp/coupons/"+ 
		orderRequst.getCouponCode(), Coupon.class);
	}


	public Coupon getCouponFallback(OrderRequst orderRequst) {
		return new Coupon(UUID.randomUUID().toString(), "SUP10", 10, LocalDate.now());
	}
	
}
