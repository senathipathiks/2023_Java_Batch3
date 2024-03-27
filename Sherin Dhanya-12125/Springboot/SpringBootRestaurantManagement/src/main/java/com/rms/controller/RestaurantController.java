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
import com.rms.dao.RestaurantDAO;

@RestController
@CrossOrigin("*")
public class RestaurantController {
 
	@Autowired
	RestaurantDAO dao; 
	  
	@GetMapping("/GetAllDetails")
	public List<Restaurant> findAllRestaurant() {
		List<Restaurant> empList= (List<Restaurant>) dao.findAll();

		return empList;
	} 
	
//	adding the value
	
	@PostMapping("/CreateDetails")
	 
	public  String createDetails(@RequestBody Restaurant restaurant) {
		String msg="";
		try {
			dao.save(restaurant);
			msg="Restaurant details addedd successfully";
		}
		catch (Exception e) { 
			// TODO: handle exception
			msg="Details insertion failed";
		}
		return msg;
	}
//	delete value
	@DeleteMapping("/deleteDetails/{id}")
	public  String deleteRestaurant(@PathVariable("id") int id) {
		String msg="";
		try {
			dao.deleteById(id);
			msg="Restaurant details deleted successfully by Id";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Details deletion failed"; 
		}
		return msg;
	} 
	
	
	@DeleteMapping("/DeleteByName/{name}")
	public  String deleteByName(@PathVariable("name") String name) {
		String msg="";
		try {
			dao.deleteByName(name);
			msg="Restaurant details deleted successfully by Name";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Details deletion failed";
		}
		return msg;
	} 
	
//	update value
	

	@PutMapping("/UpdateDetails/{id}")
	public  String updateDetails(@RequestBody Restaurant restaurant) {
		String msg="";
		try {
			dao.save(restaurant);
			msg="Restaurant details updated successfully";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Details updation failed";
		}
		return msg;
	} 
	
//	find by id
	@GetMapping("/FindDetails/{id}")
	public Restaurant performFind(@PathVariable("id") int id) {
		return dao.findById(id).get();
	}
	
//	find by name
	
	@GetMapping("/FindDetailsByName/{name}")	
	public List<Restaurant> findByName(@PathVariable("name") String name){
		return dao.findByName("name");
		
	}
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		return dao.getIdList();
	}
}
