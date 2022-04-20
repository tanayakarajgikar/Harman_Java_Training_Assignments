package com.coupon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coupon.dao.CouponRepo;
import com.coupon.entities.Coupon;
import com.coupon.exceptions.CouponNotFoundException;
@Service
@Transactional
public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponRepo couponRepo;
	
	@Override
	public List<Coupon> getAll() {
		return couponRepo.findAll();
	}

	@Override
	public Coupon getCouponById(int id) {
		return couponRepo.findById(id).orElseThrow(CouponNotFoundException:: new);
	}

	@Override
	public Coupon addCoupon(Coupon coupon) {
		couponRepo.save(coupon);
		return coupon;
	}

	@Override
	public Coupon getCouponByCouponCode(String couponCode) {
		return couponRepo.findByCouponCode(couponCode);
	}

}
