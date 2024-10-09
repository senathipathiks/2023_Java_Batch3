package com.crimemgt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crimemgt.controller.UserController;
import com.crimemgt.dto.UserDTO;
import com.crimemgt.entity.User;

@SpringBootTest
class JunitForUser {

	@Autowired
	UserController user;

	// get user by name
	@Test
	void testGetUserByname() {
		User userentity1 = new User();
		userentity1 = user.getuserByname("Srinivasan");
		assertNotNull(userentity1);
	}

	// get all users
	@Test
	void testGetallUsers() {
		List<UserDTO> userList = user.getAllusers();
		assertNotNull(userList);

	}
	
	//check login
	 @Test
	     void testLoginUser() {
	        @SuppressWarnings("unused")
			User userentity = new User();
	        userentity = user.validateLogin("Srinivasan", "Srini123");
	        assertNotNull(user);
	    }
	
	 

}
