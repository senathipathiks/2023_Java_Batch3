package com.product.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.product.bean.Product;

import jakarta.transaction.Transactional;

public interface ProductRepo extends CrudRepository<Product, Integer> {

	@Query("select pId from Product order by pId")
	public List<Integer> getIdList();
	
	@Query("select pName from Product order by pName")
	public List<String> getNameList();
	
	@Transactional
	public List<Product> findBypName(String pName);
	
	@Transactional
	public void deleteBypName(String pName);
}
