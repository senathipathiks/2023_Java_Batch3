package com.tms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.bean.User;
import com.tms.controller.UserController;

@SpringBootTest
class UserMyTest {

	@Autowired
	UserController usercontroller;

	List<User> list = new ArrayList<User>();

	// to insert the user data
	@Test
	@Disabled
	void doUserInsert() {
		User user = new User();
		user.setUserId(6);
		user.setUserName("Revathi");
		user.setUserPassword("kavi123");
		user.setUserMobile("987654321");
		user.setUserEmail("karpagambs26@gmail.com");
		user.setUserAddress("Tenkasi");

		User result = usercontroller.insertUser(user);
		assertEquals(user, result);
	}

	// to get all details of user
	@Test
	@Disabled
	void doGetUsers() {
		List<User> users = usercontroller.getUsers();
		assertNotNull(users);
		assertEquals(4, users.size());
	}

	// update the user details
	@Test
	@Disabled
	void doUpdateUser() {
		User user = new User();

		user.setUserId(49);
		user.setUserName("Reva");
		user.setUserPassword("kavi123");
		user.setUserMobile("987654321");
		user.setUserEmail("karpagambs26@gmail.com");
		user.setUserAddress("Tenkasii");

		User result = usercontroller.updateUser(user);
		assertEquals(user, result);
	}

	// Get list by user Id
	@Test
	@Disabled
	void getListByUserId() {
		User user = new User();
		user = usercontroller.find(3);
		System.out.println(user);
		assertNotNull(user);

	}

	// check with username & password
	@Test
	@Disabled
	void testLoginUser() {
		User user = new User();
		user = usercontroller.loginUser("kaviya", "Kaviya@123");
		assertNotNull(user);
	}

}
