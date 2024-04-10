package com.lbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.lbs.model.User;
import com.lbs.repository.LibraryRepo;
import com.lbs.repository.UserRepo;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {

	@Autowired
	UserRepo repo;
	
	@Autowired
	LibraryRepo lrepo;
	
	@PostMapping("/Userins")
	public String getIns(@RequestBody User use) {
		
		String msg="";
		try {
			repo.save(use);
			msg="Object inserted";
		}catch(Exception e) {
			msg="Object not inserted";
		}
		return msg;
	}
	
	@GetMapping("/Userfindall")
	public List<User> getAll() {
		List<User> list=repo.findAll();
		return list;
	}
	
	
	@DeleteMapping("/Userdel/{uid}")
   public String getDel(@PathVariable int uid) {
		
		String msg="";
		try {
			repo.deleteById(uid);
			msg="Object deleted";
		}catch(Exception e) {
			msg="Object not deleted";
		}
		return msg;
	}
	
	@PutMapping("/Userupd")
	public String getUpd(@RequestBody User use) {
		
		String msg="";
		try {
			repo.save(use);
			msg="Object updated";
		}catch(Exception e) {
			msg="Object not updated";
		}
		return msg;
	}
	
	@GetMapping("/Userfind/{uid}")
	public User getFind(@PathVariable int uid) {
		return repo.findById(uid).get();
	}
	
	@GetMapping("/Autopoplid")
	public List<Integer> getId() {
		return lrepo.getIdList();
	}
}
