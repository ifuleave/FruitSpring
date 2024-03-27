package com.spring.fruit.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.fruit.domain.Fruit;
import com.spring.fruit.domain.FruitSold;
import com.spring.fruit.dto.FruitCountReponse;
import com.spring.fruit.dto.FruitOptionResponse;
import com.spring.fruit.dto.FruitPriceResponse;
import com.spring.fruit.dto.FruitRequest;
import com.spring.fruit.dto.FruitResponse;
import com.spring.fruit.dto.FruiteSoldRequest;
import com.spring.fruit.dto.OptionRequest;
import com.spring.fruit.repository.FruitRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class FruitService {

	private final FruitRepository fruitRepository;

	@Transactional
	public void save(FruitRequest fruitRequest) {
		// TODO Auto-generated method stub

		Fruit fruit = new Fruit(fruitRequest.getName(), fruitRequest.getWarehousingDate(), fruitRequest.getPrice());

		fruitRepository.save(fruit);
	}

	@Transactional
	public void fruitSoldUpdate(FruiteSoldRequest request) {
		fruitRepository.fruitSoldUpdate(request);
	}

	public FruitPriceResponse fruitList(String name) {
		// TODO Auto-generated method stub
		List<FruitResponse> fruitResponse = fruitRepository.fruitList(name);

		long saleAmount = 0;
		long notSaleAmount = 0;

		for (int i = 0; i < fruitResponse.size(); i++) {

			if (fruitResponse.get(i).isSoldYn()) { // getter is
				saleAmount += fruitResponse.get(i).getPrice();
			} else {
				notSaleAmount += fruitResponse.get(i).getPrice();
			}
		}

		return new FruitPriceResponse(saleAmount, notSaleAmount);
	}

	public FruitCountReponse fruitCount(String name) {
		// TODO Auto-generated method stub
		FruitCountReponse count = fruitRepository.fruitCount(name);
		return count;
	}

	public List<FruitOptionResponse> fruitOptionList(String option, long price) {
		// TODO Auto-generated method stub
		return fruitRepository.fruitOptionList(option,price);
	}

}
