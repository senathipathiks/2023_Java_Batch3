package com.rms.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rms.bean.Restaurant;



public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {

	@Transactional
	public Restaurant deleteByRname(String rname);

	@Query("select rid from Restaurant")
	public List<Integer> getAllDepId();


}
