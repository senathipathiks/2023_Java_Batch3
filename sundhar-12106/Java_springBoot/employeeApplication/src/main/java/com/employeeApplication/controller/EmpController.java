package com.employeeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApplication.dto.Employee;
import com.employeeApplication.service.EmployeeService;
import com.employeeApplication.util.ResponseStructure;



@RestController
@CrossOrigin("http://localhost:3000/")
//@CrossOrigin("http://localhost:3000/add-employees/")
public class EmpController {
	
	@Autowired
	EmployeeService service;
	
	 
	@PostMapping("save")
	public ResponseStructure<Employee> save(@RequestBody Employee employee) {
		System.out.println(employee);
		return service.saveEmployee(employee);
	}
	
	@GetMapping("Test")
	public String test() {
		return "Test";
	}
	
	@GetMapping("getEmp")
	public ResponseStructure<Employee> getEmployee(@RequestParam int id) {
		return service.fetchEmployee(id);
	}
	
	@GetMapping("getAll")
	public ResponseStructure<List<Employee>> getAll() {
		return service.fetchAllEmployee();
	}
	
	
	@PutMapping("update")
	public ResponseStructure<Employee> updateEmployee(@RequestBody Employee employee){
		return service.updateEmployee(employee);
	}
	
	

}
