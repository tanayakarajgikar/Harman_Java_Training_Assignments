package com.orderapp.model.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponse {
	private String id;
	private double totalPrice;
	private LocalDate orderDate;
	private Customer customer;
	private Product product;
	private Coupon coupon;
	private OrderStatus orderStatus;
	
}
