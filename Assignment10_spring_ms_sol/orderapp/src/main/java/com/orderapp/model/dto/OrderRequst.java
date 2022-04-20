package com.orderapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequst {
	private int productId;
	private int customerId;
	private String couponCode;
	private int qty;
	
}
