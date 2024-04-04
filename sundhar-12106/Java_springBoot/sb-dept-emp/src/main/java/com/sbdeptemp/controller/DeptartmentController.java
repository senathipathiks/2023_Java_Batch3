package com.sbdeptemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdeptemp.model.Department;
import com.sbdeptemp.service.DepartmentService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/department/")
@CrossOrigin("http://localhost:3000/")
public class DeptartmentController {
	
	@Autowired
	DepartmentService service;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department department) {
		
		return service.saveDepartment(department);
	}
	
	@GetMapping
	public List<Department> getAllDepartment() {
		return service.fetchDepartment();
	}
	
	@GetMapping("idList")
	public List<Integer> getIdList(){
		return service.getAllIdList();
	}
	
	
	@DeleteMapping
	public String deleteEmployee(@RequestParam int id) {	
		return service.deleteById(id);
		
	}
	
	@GetMapping("fetchById")
	public Department fetchByid(@RequestParam int id) {
		return service.fetchDepartmentById(id);
	}
	
	

}
