package com.springboot.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.bean.Inventory;


public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

	@Query("select id FROM Inventory")
	public ArrayList<Integer> getId();
}
