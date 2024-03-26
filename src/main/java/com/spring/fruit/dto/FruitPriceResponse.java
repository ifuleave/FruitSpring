package com.spring.fruit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitPriceResponse {

	private long salesAmount;
	private long notSalesAmount;
	
	public FruitPriceResponse(long salesAmount, long notSalesAmount) {
		this.salesAmount = salesAmount;
		this.notSalesAmount = notSalesAmount;
	}
	
	
}
