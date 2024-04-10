package com.demo1.controller;

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

import com.demo1.model.Mobile;
import com.demo1.model.User;
import com.demo1.repository.UserRepository;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/adduser")
	public User adduser(@RequestBody User user) {
		return userRepo.saveAndFlush(user);
	}
	
	@GetMapping("/findUserById/{userId}")
	public User findUserbyId(@PathVariable int userId) {
		return userRepo.findByUserId(userId);
	}
	
	@GetMapping("/findAlluser")
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/findUserByName/{userName}")
	public List<User> findUserbyName(@PathVariable String userName) {
		return userRepo.findByUserNameContaining(userName);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@DeleteMapping("/deleteUser/{UserId}")
	public String deleteUser(@PathVariable int UserId) {
		 userRepo.deleteById(UserId);
		return UserId+" deleted successfully";
	}
	
}
