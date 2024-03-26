package com.spring.fruit.domain;

import lombok.Getter;

@Getter
public class FruitSold {

	private long fruitSoldId;
	private long fruitId;
	
	public FruitSold(long fruitId) {

		this.fruitId = fruitId;
	}

	
}
