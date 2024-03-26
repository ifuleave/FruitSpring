package com.spring.fruit.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitRequest {

	private String name;
	private LocalDate warehousingDate;
	private long price;

}
