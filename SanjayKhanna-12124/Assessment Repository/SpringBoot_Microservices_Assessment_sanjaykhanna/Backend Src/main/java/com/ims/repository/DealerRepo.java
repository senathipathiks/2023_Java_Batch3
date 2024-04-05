package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ims.entity.Dealer;

public interface DealerRepo extends JpaRepository<Dealer, Integer> {

	@Query("from Dealer order by dealerName")
	public List<Dealer> getAllDealer();
	
}
