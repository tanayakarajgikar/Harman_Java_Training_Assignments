package com.coupon;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coupon.entities.Coupon;
import com.coupon.service.CouponService;

@SpringBootApplication
public class CouponApplication implements CommandLineRunner{

	@Autowired
	private CouponService couponService;
	
	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Added----");
		couponService.addCoupon(new Coupon("SUP20", 20, new Date()));
		couponService.addCoupon(new Coupon("SUP10", 10, new Date()));
	}

}
