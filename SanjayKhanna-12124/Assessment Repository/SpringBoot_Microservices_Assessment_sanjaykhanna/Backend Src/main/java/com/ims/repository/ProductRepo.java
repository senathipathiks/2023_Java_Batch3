package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ims.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Query("from Product order by productName")
	public List<Product> getAllProduct();
	
}
