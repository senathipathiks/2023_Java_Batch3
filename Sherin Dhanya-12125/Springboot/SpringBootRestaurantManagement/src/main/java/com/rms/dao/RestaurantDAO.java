package com.rms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rms.bean.Restaurant;

import jakarta.transaction.Transactional;

public interface RestaurantDAO extends CrudRepository<Restaurant, Integer> {

	
//	get all employee
	@Query("select id from Restaurant")
	public List<Integer> getIdList();


	
	@Query("select name from Restaurant order by name")
	public List<String> getNameList();
	
	@Transactional						
	public void deleteByName(String name);
//	
	public List<Restaurant>  findByName(String name);
}
