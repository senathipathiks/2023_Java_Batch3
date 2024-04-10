package com.ems.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

import jakarta.ws.rs.PathParam;



@RestController

@CrossOrigin("http://localhost:3000")
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	@GetMapping("GetAll")
	public List<Employee> loadAll() {
		List<Employee> elist = (List<Employee>) dao.findAll();
		return elist;
	}



	@GetMapping("/GetEmployee/{empId}")
	public Employee performFind(@PathVariable("empId") int empId) {
		return dao.findById(empId).get();
	}

	@GetMapping("/GetEmployeeByName/{empName}")
	public List<Employee> performFind(@PathVariable("empName") String empName) {
		 List<Employee> empList =  dao.findByEmpName(empName); 
		return empList;
	}
	
	@PostMapping("/CreateEmployee")
	public String performInsert(@RequestBody Employee emp) {
		//public String performInsert( " @RequestBody " Employee emp) -- to insert the data in the 
		            // form of body means i have to use this annotation
		String msg;
		try {
			dao.save(emp);
			msg = "Employee Data Saved Successfully";
		} catch (Exception e) {
			msg = "Employee Data Failed to Save";
		}
		
		return msg;
	}
	
	@DeleteMapping("DeleteEmployee/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId) {
		String msg;
		try {
			dao.deleteById(empId);;
			msg = "Employee Data Deleted Successfully";
		} catch (Exception e) {
			msg = "Employee Data Failed to Delete";
		}
		
		return msg;
	}
	
	@DeleteMapping("DeleteEmployeeByName/{empName}")
	public String deleteEmployeeByName(@PathVariable("empName") String empName) {
		String msg;
		try {
			dao.removeByEmpName(empName);;
			msg = "Employee Data Deleted Successfully";
		} catch (Exception e) {
			msg = "Employee Data Failed to Delete";
		}
		
		return msg;
	}
	
	@PutMapping("UpdateEmployee/{empId}")
	public Optional<Object> updateEmployee(@RequestBody Employee emp, @PathVariable int empId) {
		return dao.findById(empId)
				.map(employee ->{
			employee.setEmpName(emp.getEmpName());
			employee.setSalary(emp.getSalary());
			return dao.save(employee);
		});
	}
	
	@PostMapping("EditOrDelete/{btn}")
	public String editOrDelete(@PathVariable String btn, @RequestBody Employee emp) {
		String msg = null;
		if(btn==("Edit")){
			dao.save(emp);
			msg = "Updated Successfully";
		}
		
		if(btn.equals("Delete")) {
			dao.deleteById(emp.getEmpId());
			msg = "Deleted Successfully";
		}
		
		return msg;
		
	}



}
