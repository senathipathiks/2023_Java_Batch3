package com.rms.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rms.bean.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query("select cid from  Customer")
	List<Integer> findAllId();

}
