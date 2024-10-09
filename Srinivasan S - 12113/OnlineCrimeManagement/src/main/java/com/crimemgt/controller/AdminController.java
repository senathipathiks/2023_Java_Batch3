package com.crimemgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crimemgt.dto.AdminDTO;
import com.crimemgt.entity.Admin;
import com.crimemgt.service.AdminService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class AdminController {	

	@Autowired
	private AdminService adminService;
	
	@GetMapping("getAllAdmins")
	public List<AdminDTO> getAllAdmins(){
		return adminService.getAdmins();
	}
	
	@GetMapping("/adminlogin/{adminName}/{adminPassword}")
	public Admin adminLoginn(@PathVariable("adminName")String adminName, @PathVariable("adminPassword")String adminPassword) {
		return adminService.adminLogin(adminName, adminPassword);
	}
}
