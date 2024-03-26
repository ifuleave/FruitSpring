package com.spring.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dto.CalcResultReponse;
import com.spring.dto.DayResponse;
import com.spring.dto.SumRequest;


@Service
public class CalcService {

	public CalcResultReponse calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		int add = num1 + num2;
		int minus = num1 - num2;
		int multiply = num1 * num2;
				
		return new CalcResultReponse(add,minus,multiply);
	}

	public DayResponse dayOfTheWeek(String date) {
		// TODO Auto-generated method stub
		LocalDate parseDate = LocalDate.parse(date);
		DayResponse dayResponse = new DayResponse();
		dayResponse.setDayOfTheWeek(parseDate.getDayOfWeek());
		
		return dayResponse;
	}

	public Integer nummbers(SumRequest request) {
		// TODO Auto-generated method stub
		List<Integer> list = request.getNumbers();
	
		int sum = 0;
		
		for(int i=0 ; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		return sum;
	}
	

}
