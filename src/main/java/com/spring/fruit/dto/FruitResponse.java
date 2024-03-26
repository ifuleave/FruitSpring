package com.spring.fruit.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitResponse {

	private String name;
	private LocalDate warehousingDate;
	private long price;
	private boolean soldYn;
	
}
