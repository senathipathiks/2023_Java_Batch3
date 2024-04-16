package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Department;
import com.example.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepository repo;
	
	
	@PostMapping("/CreateDepartment")
	public String createStudent(@RequestBody Department department) {

		String msg = " ";
		try {
			repo.save(department);
			msg = "department Object Saved";
		} catch (Exception e) {
			msg = "department Object Not Saved";
		}
		return msg;
	}
	
	@GetMapping("/GetDepartmentById/{deptid}")
	public Department getDepartmenttById(@PathVariable("deptid")int deptid) {
           		   Department dt = repo.findById(deptid).get();	
		
		return dt;
	}
	
	
	@GetMapping("getDepartmentIdList")
	List<Integer> getIdListtt(){
		List<Integer> list=repo.getIdList();
		return list;
		
	}
	
	@GetMapping("getAllDetails")
	List<Department> getAllStudent() {		
		List<Department>  st=repo.findAll();		
		return st;
	}
}
