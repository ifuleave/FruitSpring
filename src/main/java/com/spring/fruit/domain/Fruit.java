package com.spring.fruit.domain;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Fruit {
	private long fruitId;	// 아이디
	private String name; 	// 과일이름
	private LocalDate warehousingDate;	//등록일
	private Long price;		// 가격
	private Boolean soldYn;	// 판애여부
	
	public Fruit( String name, LocalDate warehousingDate, Long price) {

		this.name = name;
		this.warehousingDate = warehousingDate;
		this.price = price;
		this.soldYn = false;
	}
	

	
}
