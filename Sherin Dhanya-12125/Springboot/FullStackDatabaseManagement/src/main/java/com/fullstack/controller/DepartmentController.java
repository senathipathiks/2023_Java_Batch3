package com.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.bean.Department;
import com.fullstack.repository.DepartmentRepository;



@RestController
public class DepartmentController {

	@Autowired
	DepartmentRepository repo;
	
	@PostMapping("/CreateDepartment")
	 
	public  String createDepartment(@RequestBody Department department) {
		String msg="";
		try {
			repo.save(department);
			msg="Department object created";
		}
		catch (Exception e) { 
			// TODO: handle exception
			msg="Department object not created";
		}
		return msg;
	}
	
}
