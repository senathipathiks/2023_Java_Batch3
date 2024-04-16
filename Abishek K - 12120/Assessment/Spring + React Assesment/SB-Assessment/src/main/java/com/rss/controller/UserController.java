package com.rss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rss.bean.Train;
import com.rss.bean.User;
import com.rss.repo.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@PostMapping("/insertUser")
	public String doInsert(@RequestBody User usr) {
		String msg="";
		try {
			repo.save(usr);
			msg="Insertion Successfull";
		}catch(Exception e) {
			msg="Inserion Failure";
		}
		return msg;
	}
	
	@PutMapping("/updateUser")
	public String doUpdate(@RequestBody User usr) {
		String msg="";
		try {
			repo.save(usr);
			msg="Updation successfull";
		}catch(Exception e) {
			msg="Updation Failure";
		}
		return msg;
	}
	
	@GetMapping("/findUserId/{usId}")
	public User doFindId(@PathVariable("usId")int usId) {
		User usr = repo.findById(usId).get();
		return usr;
	}
	
	@GetMapping("/findUserName/{usName}")
	public List<User> doFindId(@PathVariable("usName")String usName) {
		List<User> usList = repo.findByUsName(usName);
		return usList;
	}
	
	@DeleteMapping("/deleteUserId/{usId}")
	public String doDeleteId(@PathVariable("usId")int usId) {
		String msg="";
		try {
			repo.deleteById(usId);
			msg="Deletion successfull";
		}catch(Exception e) {
			msg="Deletion Failure";
		}
		return msg;
	}
	
	@DeleteMapping("/deleteuserName/{usName}")
	public String doDeleteId(@PathVariable("usName")String usName) {
		String msg="";
		try {
			repo.deleteByUsName(usName);
			msg="Deletion successfull";
		}catch(Exception e) {
			msg="Deletion Failure";
		}
		return msg;
	}
	
	@GetMapping("/findallUser")
	public List<User> doFindAll(){
		List<User> usList = (List<User>) repo.findAll();
		return usList;
	}

}
