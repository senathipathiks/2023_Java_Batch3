package com.fullstack.Controller;

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

import com.fullstack.exception.UserNotFoundException;
import com.fullstack.model.User;
import com.fullstack.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	// we need to inject the user repository
	@Autowired
	private UserRepository repo;

	@PostMapping("/user")
	public User insertUser(@RequestBody User newUser) {
		return repo.save(newUser);
	}

	@GetMapping("/getUsers") // getting all the records
	public List<User> getAllUsers() {
		return (List<User>) repo.findAll();

	}

	@GetMapping("/users/{id}")
	public User performFind(@PathVariable Long id) {
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User newUser, @PathVariable Long id) {
		return repo.findById(id).map(user -> {
			user.setName(newUser.getName());
			user.setUsername(newUser.getUsername());
			user.setEmail(newUser.getEmail());
			return repo.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/DeleteUser/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		String msg = "";
		try {
			repo.deleteById(id);
			msg = "Employee Details Deleted Successfully";
		} catch (Exception e) {

			msg = "Employee Details Not Found";
		}

		return msg;
	}

	@GetMapping("/Autopop")
	public List<Integer> doAutoPop() {
		return repo.getIdList();

	}

	@GetMapping("/AutopopByName")
	public List<String> doAutoPopByName() {
		return repo.getNameList();
	}

}
