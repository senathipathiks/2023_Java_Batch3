package com.rrs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rrs.bean.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	@Query("select pid from Passenger order by pid asc")
	public List<Integer> fetchPassengerIds();
}
