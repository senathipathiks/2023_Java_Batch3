package com.tms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.bean.Admin;
import com.tms.bean.User;
import com.tms.controller.AdminController;

@SpringBootTest
class AdminMyTest {

	@Autowired
	AdminController adminController;

	List<User> list = new ArrayList<User>();

	// to insert the admin data
	@Test
	@Disabled
	void doAdminInsert() {
		Admin admin = new Admin();
		admin.setAdminName("admin1");
		admin.setAdminPassword("kavi123");
		admin.setAdminMobile("987654321");
		admin.setAdminEmail("karpagambs26@gmail.com");
		admin.setAdminAddress("Tenkasi");

		Admin result = adminController.insertAdmin(admin);
		assertEquals(admin, result);
	}

	// to get all details of user
	@Test
	@Disabled
	void doGetAdmins() {
		List<Admin> admin = adminController.getAdmins();
		assertNotNull(admin);
		assertEquals(2, admin.size());
	}

	// update the Admin details
	@Disabled
	@Test
	void doUpdateAdmin() {
		Admin admin = new Admin();

		admin.setAdminId(2);
		admin.setAdminName("admin1");
		admin.setAdminPassword("kaviya123");
		admin.setAdminMobile("987654311");
		admin.setAdminEmail("karpagambs26@gmail.com");
		admin.setAdminAddress("Tenkasi");

		Admin result = adminController.updateAdmin(admin);
		assertEquals(admin, result);
	}

	// Get list by Admin Id
	@Test
	@Disabled
	void getListByAdminId() {
		Admin admin = new Admin();
		admin = adminController.appfind(20);
		assertNotNull(admin);

	}

	// check with adminname & password
	@Test
	@Disabled
	void testAdminUser() {

		boolean admin = adminController.loginAdmin("admin1", "kavi123");
		assertEquals(true, admin);
	}

}
