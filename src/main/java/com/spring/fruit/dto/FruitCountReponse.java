package com.spring.fruit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitCountReponse {

	private int count;

	public FruitCountReponse(int count) {
	
		this.count = count;
	}
	
	
}
