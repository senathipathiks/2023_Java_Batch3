package com.springboot.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.bean.Brand;


public interface BrandRepo extends JpaRepository<Brand, Integer>{

	@Query("select bid FROM Brand")
	public ArrayList<Integer> getId();
}
