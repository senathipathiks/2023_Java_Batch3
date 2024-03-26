package com.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Shop;
import com.springboot.repo.ShopRepo;



@RestController
@CrossOrigin("*")
public class ShopController {

	
	@Autowired
	ShopRepo repo;

		@PostMapping("CreateShop")
		public String createShop(@RequestBody Shop shop) {
			String msg="";
			try {
				repo.save(shop);
				msg="Inserted Successfully";
			} catch (Exception e) {
				msg="Failed to Insert";
			}
			return msg;
		}
		
		
		@GetMapping("GetAllShop")
		public ArrayList<Shop> getAllShop(){
			return (ArrayList<Shop>) repo.findAll();
		}

		@DeleteMapping("DeleteShop/{id}")
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
		
		@PutMapping("/UpdateShop/{id}")
		public String doupdate(@PathVariable int id ,@RequestBody Shop shop) {
			String Msg="";
			try {	
				if (repo.existsById(id)) {
					shop.setId(id);
					repo.save(shop);
					Msg="Record updated Successfully";
				}
				
			} catch (Exception e) {
				Msg="Record updation Failed";
			}
			
			return Msg;
		}
		
		@GetMapping("GetShopById/{id}")
		public Shop findShopById(@PathVariable("id")int id) {
			return repo.findById(id).get();	
		}
		
		@GetMapping("IdList")
		public ArrayList<Integer> getIdList(){
			return repo.getId();
		}
	}



