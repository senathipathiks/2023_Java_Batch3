package com.sb.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.usermanagement.dto.UserDTO;
import com.sb.usermanagement.service.UserManagementService;

@RestController
public class UserController {

	private UserManagementService service;

	public UserController() {

	}

	@Autowired
	public UserController(UserManagementService service) {
		super();
		this.service = service;
	}

	@PostMapping("/auth/register")
	public ResponseEntity<UserDTO> regeister(@RequestBody UserDTO reg) {
		return ResponseEntity.ok(service.register(reg));
	}

	@PostMapping("/auth/login")
	public ResponseEntity<UserDTO> login(@RequestBody UserDTO req) {

		return ResponseEntity.ok(service.login(req));
	}

	@PostMapping("/auth/refresh")
	public ResponseEntity<UserDTO> refreshToken(@RequestBody UserDTO req) {
		System.out.println(req);
		return ResponseEntity.ok(service.refreshToken(req));
	}

	@GetMapping("/admin/get-all-users")
	public ResponseEntity<UserDTO> getAllUsers() {
		System.out.println("hello");
		return ResponseEntity.ok(service.getAllUsers());

	}

	@GetMapping("/admin/get-users/{userId}")
	public ResponseEntity<UserDTO> getUSerByID(@PathVariable Integer userId) {
		return ResponseEntity.ok(service.getUsersById(userId));

	}

	@PutMapping("/admin/update/{userId}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable Integer userId, @RequestBody UserDTO dto) {
		return ResponseEntity.ok(service.updateUser(userId, dto));
	}

	@GetMapping("/adminuser/get-profile")
	public ResponseEntity<UserDTO> getMyProfile() {
		System.out.println("hello from get my profile");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String email = authentication.getName();
		UserDTO response = service.getMyInfo(email);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@DeleteMapping("/admin/delete/{userId}")
	public ResponseEntity<UserDTO> deleteUSer(@PathVariable Integer userId) {
		return ResponseEntity.ok(service.deleteUser(userId));
	}

}
