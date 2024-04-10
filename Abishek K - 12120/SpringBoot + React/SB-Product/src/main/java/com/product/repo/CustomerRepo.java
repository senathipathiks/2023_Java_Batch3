package com.product.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.product.bean.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	
	
	@Transactional
	public List<Customer> findBycName(String cName);
	
	@Transactional
	public void deleteBycName(String cName);
	
	

}
