package com.osm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.osm.bean.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	@Query("select pdt_id from Product")
	public List<Integer> getIdList();
	@Query("select pdt_name from Product")
	public List<String> getNameList();
}
