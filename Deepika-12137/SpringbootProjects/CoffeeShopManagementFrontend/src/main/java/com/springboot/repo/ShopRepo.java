package com.springboot.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.bean.Shop;

public interface ShopRepo extends JpaRepository<Shop, Integer> {

	@Query("select id FROM Shop")
	public ArrayList<Integer> getId();
}
