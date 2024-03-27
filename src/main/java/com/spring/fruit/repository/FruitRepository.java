package com.spring.fruit.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.fruit.domain.Fruit;
import com.spring.fruit.domain.FruitSold;
import com.spring.fruit.dto.FruitCountReponse;
import com.spring.fruit.dto.FruitOptionResponse;
import com.spring.fruit.dto.FruitResponse;
import com.spring.fruit.dto.FruiteSoldRequest;
import com.spring.fruit.dto.OptionRequest;
import com.spring.fruit.repository.mapper.FruitMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FruitRepository {

	private final FruitMapper fruitMapper;

	public void save(Fruit fruit) {
		// TODO Auto-generated method stub
		fruitMapper.save(fruit);

	}

	public void fruitSoldUpdate(FruiteSoldRequest request) {
		// TODO Auto-generated method stub
		fruitMapper.fruitSoldUpdate(request);
	}

	public List<FruitResponse> fruitList(String name) {
		// TODO Auto-generated method stub
		return fruitMapper.fruitList(name);
	}

	public FruitCountReponse fruitCount(String name) {
		// TODO Auto-generated method stub
		return fruitMapper.fruitCount(name);
	}

	public List<FruitOptionResponse> fruitOptionList(String option, long price) {
		// TODO Auto-generated method stub
		return fruitMapper.fruitOptionList(option,price);
	}

}
