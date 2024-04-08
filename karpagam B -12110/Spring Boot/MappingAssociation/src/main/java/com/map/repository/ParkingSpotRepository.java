package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.map.bean.ParkingSpot;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer> {
	
	
	@Query("select id from ParkingSpot")
	public List<Integer> getAllParkId();

}
