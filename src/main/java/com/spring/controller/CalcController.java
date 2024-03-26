package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.CalcResultReponse;
import com.spring.dto.DayResponse;
import com.spring.dto.SumRequest;
import com.spring.service.CalcService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalcController {
	
	private final CalcService calcService;
	
	@GetMapping("/api/v1/calc")
	public CalcResultReponse calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {		

		if(num1 > 100 || num2 > 100) {
			throw new IllegalArgumentException("숫자는 100까지만 입력이 가능합니다.");
		}
		
		return calcService.calculate(num1,num2);
	}
	
	
	@GetMapping("/api/v1/day-of-the-week")
	public DayResponse dayOfTheWeek(@RequestParam("date")String date) {
		return calcService.dayOfTheWeek(date);	
	}
	
	@PostMapping("/api/v1/sum")
	public Integer nummbers(@RequestBody SumRequest request) {
		return calcService.nummbers(request);
	}
	
	
	
}
