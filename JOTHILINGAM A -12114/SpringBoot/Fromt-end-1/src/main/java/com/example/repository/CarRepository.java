package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Car;

public interface CarRepository extends JpaRepository<Car , Integer> {
	
	@Query("select id from Car ")
	List<Integer> getIdList();
	

}
