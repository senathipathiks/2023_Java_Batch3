package com.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ticket.model.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer>{

	List<Bus> findByBusName(String busName);
	
	Bus findByBusId(int busId);
	
	@Query("select busId from Bus")
	public List<Integer> getBusId();
}
