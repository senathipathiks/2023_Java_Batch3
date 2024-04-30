package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.EmployeeDTO;
import com.demo.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")	
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		String id= employeeService.addEmployee(employeeDTO);
		return id;
		
	}
	

}
