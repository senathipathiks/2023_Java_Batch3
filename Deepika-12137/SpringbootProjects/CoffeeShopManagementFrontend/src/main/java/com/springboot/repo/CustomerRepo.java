package com.springboot.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.bean.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	@Query("select cid FROM Customer")
	public ArrayList<Integer> getId();
}
