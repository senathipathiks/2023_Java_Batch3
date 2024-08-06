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

import com.tms.bean.Admin;
import com.tms.repository.AdminDao;
import com.tms.repository.AdminDaoImpl;

@RestController
@CrossOrigin("*")
public class AdminController extends AdminDaoImpl {

	@Autowired
	AdminDao admindao;

	// to insert the data
	@PostMapping("/doadminInsert")
	public Admin insertAdmin(@RequestBody Admin newAdmin) {
		return admindao.newAdmin(newAdmin);

	}

	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {

		return admindao.updateAdmin(admin);
	}

	// to get all the data from the database
	@GetMapping("/getAllAdminList")
	public List<Admin> getAdmins() {
		return admindao.getAdmins();
	}

	// get by id
	@GetMapping("/GetAdminId/{adminId}")
	public Admin appfind(@PathVariable("adminId") int adminId) {
		return admindao.adminfind(adminId);
	}

	// to get all the Id
	@GetMapping("/getAdminIdList")
	public List<Integer> getAdminId() {
		return admindao.getAdminIdList();
	}
	@GetMapping("/loginAdmin/{adminName}/{adminPassword}")
	public boolean loginAdmin(@PathVariable("adminName") String adminName,
			@PathVariable("adminPassword") String adminPassword) {
		try {
			admindao.adminLogin(adminName, adminPassword);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
