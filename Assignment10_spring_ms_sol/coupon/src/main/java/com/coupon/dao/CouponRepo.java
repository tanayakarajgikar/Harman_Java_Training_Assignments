package com.coupon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coupon.entities.Coupon;
@Repository
public interface CouponRepo extends JpaRepository<Coupon, Integer> {
	public Coupon findByCouponCode(String couponCode);
}
