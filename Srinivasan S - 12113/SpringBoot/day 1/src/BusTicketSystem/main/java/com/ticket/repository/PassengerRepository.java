package com.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ticket.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	

	
	Passenger findByPassengerId(int passengerId);
	
	@Query("select passengerId from Passenger")
	public List<Integer> getPassengerId();
}
