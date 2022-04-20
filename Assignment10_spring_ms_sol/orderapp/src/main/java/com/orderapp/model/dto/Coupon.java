package com.orderapp.model.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

	private String id;
	private String couponCode;
	private double discountPercentage;
	private LocalDate expiredOn;
}
//SUP10, SUP05, 
