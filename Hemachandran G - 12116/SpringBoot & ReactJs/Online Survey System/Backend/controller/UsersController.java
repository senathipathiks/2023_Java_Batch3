package com.oss.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.oss.model.Users;
import com.oss.repository.UsersRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("http://localhost:3000")

public class UsersController {

	@Autowired
	UsersRepository repo;

	@GetMapping("GetAllUsers")
	public List<Users> performAll() {
		List<Users> uList = (List<Users>) repo.findAll();
		return uList;
	}

	@GetMapping("GetUsersById/{usersId}")
	public Optional<Users> byId(@PathVariable int usersId) {
		return repo.findById(usersId);
	}



	@PostMapping("CreateUsers")
	public String doInsert(@RequestBody Users user) {
		String msg;
		try {
			repo.save(user);
			msg = "Data Saved Succesfully";
		} catch (Exception e) {
			msg = " Data Failed to Insert";
		}
		return msg;

	}

	@PutMapping("UpdateUsers/{usersId}")
	public Optional<Object> dooUpdate(@RequestBody Users user, @PathVariable int usersId) {

		return repo.findById(usersId).map(users -> {
			users.setUsersName(user.getUsersName());
			users.setUsersMobNo(user.getUsersMobNo());
			users.setUsersAddress(user.getUsersAddress());

			return repo.save(users);
		});
	}

	@DeleteMapping("DeleteUsers/{usersId}")
	public String doDelte(@PathVariable("usersId") int usersId) {
		String msg;
		try {
			repo.deleteById(usersId);
			msg = "Deleted Successful";
		} catch (Exception e) {
			msg = "Deletion Failed";
		}
		return msg;

	}

}
