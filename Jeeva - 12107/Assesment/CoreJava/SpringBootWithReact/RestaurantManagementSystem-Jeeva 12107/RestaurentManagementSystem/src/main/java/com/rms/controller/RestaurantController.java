package com.rms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rms.bean.Restaurant;
import com.rms.repositary.RestaurantRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class RestaurantController {

	
	@Autowired
	private RestaurantRepo resrepo;	
	
	
	@PostMapping("/insetRestaurant")
	public String insetRestaurant(@RequestBody Restaurant res) {
		
		try {
			
			resrepo.save(res);
		return "Inserted Successfully";
		}catch(Exception e) {
			return "Failed To  Insert";	
		}	
		
	}
	
	
	@PutMapping("/updateResDetails")
	 public String updateResDetails(@RequestBody Restaurant rid) {
		 String Msg="";
			try {
				resrepo.save(rid);
				Msg= "Restaurant Record Updated";
			}catch(Exception e) {
				System.out.println(e);
				Msg= "Failed To Update";
			}
			return Msg;
		}
	
	
	
	@GetMapping("/getAllRestaurants")
	public List<Restaurant> getAll() {
		
		return resrepo.findAll();
	}
	
	@GetMapping("/findResById/{rid}")
	public Restaurant findResById(@PathVariable int rid) {
		
		return resrepo.findById(rid).get();
	}
	
	
	@DeleteMapping("/deleteResId/{rid}")
	public String deleteResId(@PathVariable int rid) {
		
		try {			
			resrepo.deleteById(rid);
			return "Deletion Success";			
		}catch(Exception e) {			
			return "Deletion Failed";
			
		}
	}
	
	
	@GetMapping("/getAllResId")
	public List<Integer> getAllResId() {
	List<Integer> listAllId=(List<Integer>) resrepo.getAllDepId();	
	return listAllId;
		
	}
	
	
	
	
	
	
}
