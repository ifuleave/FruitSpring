package com.spring.fruit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fruit.dto.FruitCountReponse;
import com.spring.fruit.dto.FruitOptionResponse;
import com.spring.fruit.dto.FruitPriceResponse;
import com.spring.fruit.dto.FruitRequest;
import com.spring.fruit.dto.FruitResponse;
import com.spring.fruit.dto.FruiteSoldRequest;
import com.spring.fruit.dto.OptionRequest;
import com.spring.fruit.service.FruitService;
import com.spring.service.CalcService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FruitController {

	private final FruitService fruitService;

	@PostMapping("/api/v1/fruit")
	public void fruitSave(@RequestBody FruitRequest fruitRequest) {
		fruitService.save(fruitRequest);
	}

	@PutMapping("/api/v1/fruit")
	public void fruitSoldUpdate(@RequestBody FruiteSoldRequest request) {
		fruitService.fruitSoldUpdate(request);
	}

	@GetMapping("/api/v1/fruit/stat")
	public FruitPriceResponse fruitList(@RequestParam("name") String name) {
		return fruitService.fruitList(name);
	}

	@GetMapping("/api/v1/fruit/count")
	public FruitCountReponse fruitCount(@RequestParam("name") String name) {
		return fruitService.fruitCount(name);
	}

	@GetMapping("/api/v1/fruit/list")
	public List<FruitOptionResponse> fruitOptionList(@RequestParam("option")String option,
			@RequestParam("price") long price) {
		return fruitService.fruitOptionList(option, price);
	}

}