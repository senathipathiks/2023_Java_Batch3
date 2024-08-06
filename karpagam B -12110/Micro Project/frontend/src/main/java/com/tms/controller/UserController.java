package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.bean.User;
import com.tms.repository.UserDao;
import com.tms.repository.UserDaoImpl;

@RestController
@CrossOrigin("*")
public class UserController extends UserDaoImpl {

	@Autowired
	UserDao userdao;

	// to insert the data
	@PostMapping("/doUserInsert")
	public User insertUser(@RequestBody User newUser) {
		return userdao.insertUser(newUser);

	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {

		return userdao.updateUser(user);
	}

	// to get all the data from the database
	@GetMapping("/getAllUserList")
	public List<User> getUsers() {
		return userdao.getUsers();
	}

	// get by id
	@GetMapping("/GetId/{userId}")
	public User find(@PathVariable("userId") int userId) {
		return userdao.userfind(userId);
	}

	// to get all the Id
	@GetMapping("/getUserIdList")
	public List<Integer> getUserIdlist() {
		return userdao.getUserIdlist();
	}

	@GetMapping("/get/{userName}")
	public List<User> getByusername(@PathVariable("userName") String userName) {
		return userdao.searchUser(userName);
	}

	@GetMapping("/loginUser/{userName}/{userPassword}")
	public boolean loginUser(@PathVariable("userName") String userName,
			@PathVariable("userPassword") String userPassword) {
		try {
			userdao.userLogin(userName, userPassword);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
	
	


