package com.crimemgt.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.crimemgt.dto.UserDTO;
import com.crimemgt.entity.User;
import com.crimemgt.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/addUser")
	public User regUser(@RequestParam("userName") String userName, @RequestParam("userAddress") String userAddress,
			@RequestParam("userPhn") long userPhn, @RequestParam("userAge") int userAge,
			@RequestParam("email") String email, @RequestParam("userPassword") String userPassword,
			@RequestParam("userconfirmPassword") String userconfirmPassword,
			@RequestParam("userProof") String userProof, @RequestParam("proofImg") MultipartFile image)
			throws IOException {

		User userentity = new User();
		userentity.setUserName(userName);
		userentity.setUserAddress(userAddress);
		userentity.setUserAge(userAge);
		userentity.setEmail(email);
		userentity.setUserPhn(userPhn);
		userentity.setUserPassword(userPassword);

		userentity.setUserconfirmPassword(userconfirmPassword);
		userentity.setUserProof(userProof);
		userentity.setProofImg(image.getBytes());

		return userservice.regUser(userentity, image);

	}

	@GetMapping("/getAllUsers")
	public List<UserDTO> getAllusers() {
		return userservice.getUsers();

	}

	@GetMapping("/getUser/{userName}")
	public User getuserByname(@PathVariable("userName") String userName) {
		return userservice.getUserByName(userName);

	}

	@GetMapping("/loginUser/{userName}/{userPassword}")
	public User validateLogin(@PathVariable("userName") String userName,
			@PathVariable("userPassword") String userPassword) {

		return userservice.validateLogin(userName, userPassword);

	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestParam("userId") int userId, @RequestParam("userName") String userName,
			@RequestParam("userAddress") String userAddress, @RequestParam("userPhn") long userPhn,
			@RequestParam("userAge") int userAge, @RequestParam("userPassword") String userPassword,
			@RequestParam("userconfirmPassword") String userconfirmPassword,
			@RequestParam("userProof") String userProof, @RequestParam("proofImg") MultipartFile image)
			throws IOException {

		User userentity = new User();

		userentity.setUserId(userId);
		userentity.setUserName(userName);
		userentity.setUserAddress(userAddress);
		userentity.setUserAge(userAge);
		userentity.setUserPhn(userPhn);
		userentity.setUserPassword(userPassword);

		userentity.setUserconfirmPassword(userconfirmPassword);
		userentity.setUserProof(userProof);
		userentity.setProofImg(image.getBytes());

		return userservice.updateUser(userentity, image);

	}

	@DeleteMapping("/deleteUser/{userId}")
	public boolean deleteUser(@PathVariable("userId") String userId) {
		int id = Integer.parseInt(userId);
		return userservice.deleteUser(id);
	}
	
}
