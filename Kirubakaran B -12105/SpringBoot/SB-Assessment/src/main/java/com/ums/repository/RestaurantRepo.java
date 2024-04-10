package com.ums.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ums.model.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
	
	
	@Query("select resId from Restaurant")
	public List<Integer> getIdList();

}
