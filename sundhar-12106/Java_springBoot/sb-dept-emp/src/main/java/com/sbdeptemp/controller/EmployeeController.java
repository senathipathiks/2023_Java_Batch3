package com.sbdeptemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdeptemp.model.Employee;
import com.sbdeptemp.service.EmployeeService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/employee/")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service;

	
	
	@PostMapping
	public Employee postMethodName(@RequestBody Employee employee) {
		
		System.out.println(employee.getDepartment());
		return service.saveEmployee(employee);
	}
	
	@PutMapping
	public Employee putMethodName(@RequestBody Employee employee) {
		System.out.println("put");
		return service.saveEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		return service.deleteEmployeeById(id);
		
	}
	

	@GetMapping	
	public List<Employee> fetchAllEmployee() {
		return service.fetchAllEmployee();
	}
	
	
	@GetMapping("fetchById/{id}")
	public Employee getMethodName(@PathVariable("id") int id) {
		return service.fetchEmployee(id);
	}
	
	

}
