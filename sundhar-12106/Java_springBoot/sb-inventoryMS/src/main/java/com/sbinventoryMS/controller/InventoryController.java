package com.sbinventoryMS.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbinventoryMS.model.Inventory;
import com.sbinventoryMS.model.Product;
import com.sbinventoryMS.repository.InventoryRepo;
import com.sbinventoryMS.repository.ProductRepo;

@RestController
public class InventoryController {

	@Autowired
	private InventoryRepo repo;
	@Autowired
	private ProductRepo repo2;

	public InventoryController() {

	}

//	public InventoryController(InventoryRepo repo, ProductRepo repo2) {
//		super();
//		this.repo = repo;
//		this.repo2 = repo2;
//	}

	@PostMapping("saveInventory")
	public Inventory saveInventory(@RequestBody Inventory inventory) {

		return repo.save(inventory);
	}

	@PutMapping
	public Inventory updateInventory(@RequestBody Inventory inventory) {
		

		Product product = inventory.getProduct().get(0);
		

		inventory = repo.findById(inventory.getId()).orElseThrow();
		
		inventory.getProduct().add(product);
		

		return repo.save(inventory);
	}

	@PostMapping("saveProduct")
	public String saveProduct(@RequestBody Product product) {
		repo2.save(product);
		return "product saved successfully..!";
	}

	@GetMapping
	public List<Inventory> getAll() {
		return repo.findAll();
	}

}
