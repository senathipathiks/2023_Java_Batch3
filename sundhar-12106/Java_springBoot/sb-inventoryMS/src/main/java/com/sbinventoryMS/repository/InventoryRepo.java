package com.sbinventoryMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbinventoryMS.model.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
