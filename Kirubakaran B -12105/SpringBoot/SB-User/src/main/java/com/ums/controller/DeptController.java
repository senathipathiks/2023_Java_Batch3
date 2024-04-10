package com.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ums.model.Dept;
import com.ums.model.User;
import com.ums.repository.DeptRepo;
import com.ums.repository.UserRepo;

@RestController
public class DeptController {

	
	@Autowired
	DeptRepo repo;
	
	@PostMapping("/Deptins")
	public String getInsert(@RequestBody Dept dept) {
		
		String msg="";
		try {
			repo.save(dept);
			msg="Object inserted";
		} catch (Exception e) {
			msg="not inserted";
		}
		
		return msg;
	}
		
	
}
