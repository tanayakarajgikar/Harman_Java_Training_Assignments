package com.coupon.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "coupon_table")
@NoArgsConstructor
public class Coupon {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String couponCode;
	private int discountPercentage;
	private Date expiredOn;
	public Coupon(String couponCode, int discountPercentage, Date expiredOn) {
		this.couponCode = couponCode;
		this.discountPercentage = discountPercentage;
		this.expiredOn = expiredOn;
	}
}
