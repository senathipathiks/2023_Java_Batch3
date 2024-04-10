package com.ems.controller;

import java.util.Iterator;
import java.util.List;

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

import com.ems.dao.EmployeeRepo;

import jakarta.websocket.server.PathParam;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class EMSController {

	@Autowired
	EmployeeRepo repo;

	@PostMapping("/CreateEmployee")
	public String createEmployee(@RequestBody Employee emp) { // sending form-data @requestBody not required.
		String msg;
		try {
			repo.save(emp);
			msg = "Insertion is Successfully Done";
		} catch (Exception e) {
			msg = "Insertion is Failure";
		}
		return msg;
	}

	@DeleteMapping("/DeleteEmployee/{empId}")
	public String DeleteEmployee(@PathVariable("empId") int empId) { // It is the fastest way to set the value for the
																		// particular attribute.
		String msg;
		try {
			repo.deleteById(empId);
			msg = "Record is Deleted";

		} catch (Exception e) {
			msg = "Record is Not Deleted";
		}
		return msg;
	}

	@DeleteMapping("/DeleteEmployeeName/{empName}")
	public String doDeleteName(@PathVariable("empName") String empName) {
		String msg;
		try {
			repo.deleteByEmpName(empName);
			msg = "Deletion is Successfull";

		} catch (Exception e) {

			msg = "Deletion Failure";
		}
		return msg;

	}

	@GetMapping("/GetEmployee/{empId}")
	public List<Employee> doFind(@PathVariable("empId") int empId) {
		 List<Employee> eList =  (List<Employee>) repo.findByEmpId(empId);
		 return eList;
	}

	@GetMapping("/GetEmployeeName/{empName}")
	public List<Employee> performFind(@PathVariable("empName") String empName) {
		return repo.findByEmpName(empName);
	}

	@PutMapping("/UpdateEmployee")
	public String UpdateEmployee(@RequestBody Employee emp) {
		String msg;
		try {
			repo.save(emp);
			msg = "Updation is Successfull";
		} catch (Exception e) {
			System.out.println(e);
			msg = "Updation is Failure";
		}

		return msg;

	}

	@GetMapping("/GetAllEmployee")
	public List<Employee> loadFindAll() {

		List<Employee> empList = (List<Employee>) repo.findAll();

		return empList;
	}

}
