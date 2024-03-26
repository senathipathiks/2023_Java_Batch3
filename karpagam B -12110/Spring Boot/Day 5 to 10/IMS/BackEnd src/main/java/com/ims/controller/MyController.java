package com.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.bean.Inventory;
import com.ims.exception.InventoryNotFoundException;
import com.ims.repository.InventoryRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MyController {
	
	@Autowired
	private InventoryRepository repo;
	
	//to insert the data
	@PostMapping("/invent")
	Inventory newInvent(@RequestBody Inventory newInvent ) {
			return repo.save(newInvent);
			
		}
	
	//to get all the data from the database
	@GetMapping("/invents")
	List<Inventory> getAllInvents(){
		return (List<Inventory>) repo.findAll();
		}
	
	//to create the custom exception
	@GetMapping("/invent1/{itemId}")
	Inventory getInventoryByItemId(@PathVariable int itemId) {
		return repo.findById(itemId)
				.orElseThrow(()->new InventoryNotFoundException(itemId));
				}
	
	//get the data from name
	@GetMapping("/inventname/{itemName}")
	List<Inventory> getInventoryByItemName(@PathVariable String itemName) {
		List<Inventory> lib=repo.findByItemName(itemName);
		return  lib;
		
	}
	
	@PutMapping("/update")
	Inventory updateInvent(@RequestBody Inventory invent) {
		
		return repo.save(invent);
	}
	
	
	
	//update the data with id
	@PutMapping("/invents/{itemId}")
	Inventory updateInventory(@RequestBody Inventory newInventory,@PathVariable int itemId) {
		return repo.findById(itemId)
		.map(invent ->{
			invent.setItemName(newInventory.getItemName());
			invent.setPrice(newInventory.getPrice());
			invent.setQuant(newInventory.getQuant());
            return repo.save(invent);
            }).orElseThrow(()->new InventoryNotFoundException(itemId));
		}
	
	//delete the data using mapping
	@DeleteMapping("/invent/{itemId}")
	String deleteInventory(@PathVariable int itemId) {
		if(!repo.existsById(itemId)) {
			throw new InventoryNotFoundException(itemId);
		}
		repo.deleteById(itemId);
		
		return "Item with id " +itemId+ " has been deleted successfully.";
		
	}
	@GetMapping("/inventauto")
	List<Integer> getInventorybylist() {
		 List<Integer> idList= repo.getIdList();
	    return idList;

	}
}