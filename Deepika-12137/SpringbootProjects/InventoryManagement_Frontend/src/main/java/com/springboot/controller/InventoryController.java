package com.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Inventory;
import com.springboot.repo.InventoryRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class InventoryController {
	
@Autowired
InventoryRepo repo;

	@PostMapping("CreateInventory")
	public String createInventory(@RequestBody Inventory inventory) {
		String msg="";
		try {
			repo.save(inventory);
			msg="Inserted Successfully";
		} catch (Exception e) {
			msg="Failed to Insert";
		}
		return msg;
	}
	
	
	@GetMapping("GetAllInventory")
	public ArrayList<Inventory> getAllInventory(){
		return (ArrayList<Inventory>) repo.findAll();
	}

	@DeleteMapping("DeleteInventory/{id}")
	public String doDelete(@PathVariable("id")int id) {
		String Msg="";
		try {
			repo.deleteById(id);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@PutMapping("/UpdateInventory/{id}")
	public String doupdate(@PathVariable int id ,@RequestBody Inventory inventory) {
		String Msg="";
		try {	
			if (repo.existsById(id)) {
				inventory.setId(id);
				repo.save(inventory);
				Msg="Record updated Successfully";
			}
			
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	@GetMapping("GetInventoryById/{id}")
	public Inventory findInventoryById(@PathVariable("id")int id) {
		return repo.findById(id).get();	
	}
	
	@GetMapping("IdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}
}

