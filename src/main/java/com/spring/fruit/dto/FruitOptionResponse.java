package com.spring.fruit.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitOptionResponse {

	private String name;
	private long price;
	private LocalDate warehousingDate;
	
}
