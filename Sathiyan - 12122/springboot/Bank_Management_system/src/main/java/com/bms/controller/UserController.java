package com.bms.controller;

import java.util.ArrayList;

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

import com.bms.bean.Transaction;
import com.bms.bean.User;
import com.bms.repository.TransactionRepository;
import com.bms.repository.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("bms/uc/api")
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	@PostMapping("CreateUser")
	public String createUser(@RequestBody User user){
		String Msg="";
		try {
			repo.save(user);
			Msg="Created Successfully";
		} catch (Exception e) {
			Msg="Creation Failed";
		}
		return Msg;
	}
	
	@PutMapping("UpdateUser/{accountNumber}")
	public String updateUser(@RequestBody User user, @PathVariable int accountNumber) {
		String Msg="";
		try {	
			if (repo.existsById(accountNumber)) {
				user.setAccountNumber(accountNumber);
				repo.save(user);
				Msg="Record updated Successfully";
			}
			
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	@DeleteMapping("DeleteUser/{accountNumber}")
	public String deleteTransaction(@PathVariable("accountNumber")int accountNumber) {
		String Msg="";
		try {
			repo.deleteById(accountNumber);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@GetMapping("GetAllUser")
	public ArrayList<User> getAllUser(){
		return (ArrayList<User>) repo.findAll();
	}
	
	@GetMapping("GetUserById/{accountNumber}")
	public User findUserById(@PathVariable("accountNumber")int accountNumber) {
		return repo.findById(accountNumber).get();	
	}
	
	@GetMapping("IdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}

}
