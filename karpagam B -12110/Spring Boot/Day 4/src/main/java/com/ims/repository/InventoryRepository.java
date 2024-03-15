package com.ims.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ims.bean.Inventory;

public interface InventoryRepository extends  CrudRepository<Inventory,Integer> {

	
	List<Inventory> findByItemName(String itemName);
}
