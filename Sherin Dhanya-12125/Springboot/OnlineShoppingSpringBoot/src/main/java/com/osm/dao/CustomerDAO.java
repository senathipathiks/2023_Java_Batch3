package com.osm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.osm.bean.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {

	@Query("select id from Customer")
	public List<Integer> getIdList();
	@Query("select name from Customer")
	public List<String> getNameList();
}
