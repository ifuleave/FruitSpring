package com.spring.fruit.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.fruit.domain.Fruit;
import com.spring.fruit.domain.FruitSold;
import com.spring.fruit.dto.FruitResponse;
import com.spring.fruit.dto.FruiteSoldRequest;


@Mapper
public interface FruitMapper {

	void save(Fruit fruit);

	void fruitSoldUpdate(FruiteSoldRequest request);

	List<FruitResponse> fruitList(String name);

}
