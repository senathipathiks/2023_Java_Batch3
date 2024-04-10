package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ims.bean.Inventory;

public interface InventoryRepository extends  CrudRepository<Inventory,Integer> {

	
	List<Inventory> findByItemName(String itemName);
	
	@Query("select itemId from Inventory")
	public List<Integer> getIdList();
}
