package com.coupon.service;
import java.util.*;

import com.coupon.entities.Coupon;
public interface CouponService {
	public List<Coupon> getAll();
	public Coupon getCouponById(int id);
	public Coupon getCouponByCouponCode(String couponCode);
	public Coupon addCoupon(Coupon coupon);
}
