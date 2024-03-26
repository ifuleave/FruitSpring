package com.spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalcResultReponse {

	private int add;
	private int minus;
	private int multiply;
	
	public CalcResultReponse(int add, int minus, int multiply) {
		super();
		this.add = add;
		this.minus = minus;
		this.multiply = multiply;
	}
}
