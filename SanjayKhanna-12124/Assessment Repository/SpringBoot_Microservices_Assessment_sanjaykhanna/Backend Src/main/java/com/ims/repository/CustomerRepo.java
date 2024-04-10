package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ims.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	@Query("from Customer order by customerName")
	public List<Customer> getAllCustomer();

}
