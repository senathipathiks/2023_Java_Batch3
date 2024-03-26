package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Department;
import com.sms.repository.DepartmentRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class DepartmentController {
	
	@Autowired
	DepartmentRepo deptRepo;
	
	@PostMapping("/createDepartment")
	public String createDepartment(@RequestBody Department d) {
		String msg = "";
		
		try {
			deptRepo.saveAndFlush(d);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}
		
		
		return msg;
	}
	
	@GetMapping("/readAllDepartment")
	public List<Department> readAllDepartment(){
		return deptRepo.getAllStudent();
	}
	
	@GetMapping("/readDepartment")
	public Department readDepartment(@RequestParam("deptId")int id) {
		return deptRepo.findById(id).get();
	}
	
	@DeleteMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam("deptId")int id) {
		String msg = "";
		
		try {
			deptRepo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}
		
		return msg;
	}
	
	@PutMapping("/updateDepartment")
	public String updateDepartment(@RequestBody Department d) {
		String msg ="";
		
		try {
			deptRepo.saveAndFlush(d);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}
		return msg;
	}
	

}
