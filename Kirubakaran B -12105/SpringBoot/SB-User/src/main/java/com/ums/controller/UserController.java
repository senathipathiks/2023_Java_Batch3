package com.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ums.model.User;
import com.ums.repository.UserRepo;

@RestController
public class UserController {

	@Autowired
	UserRepo repo;
	
	@PostMapping("/Userins")
	public String getInsert(@RequestBody User user) {
		
		String msg="";
		try {
			repo.save(user);
			msg="Object inserted";
		} catch (Exception e) {
			msg="not inserted";
		}
		
		return msg;
		
	}
	
	@GetMapping("/Usergetall")
	public List<User> getAll() {
		return repo.findAll();
	}
	
	
	@PutMapping("/Userupd")
	public String getUpdate(@RequestBody User user) {
		
		String msg="";
		try {
			repo.save(user);
			msg="Object inserted";
		} catch (Exception e) {
			msg="not inserted";
		}
		
		return msg;
		
	}
	
	@DeleteMapping("/Userdel/{userId}")
	public String getDelete(@PathVariable int userId) {
		
		String msg="";
		try {
			repo.deleteById(userId);
			msg="Object deleted";
		} catch (Exception e) {
			msg="not deleted";
		}
		
		return msg;
		
	}
}
