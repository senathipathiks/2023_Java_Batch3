package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.bean.Employee;
import com.emp.dao.DepartmentDAO;
import com.emp.dao.EmployeeDAO;

 
@RestController
@CrossOrigin("*")
public class EmployeeController {
 
	@Autowired
	private EmployeeDAO empDAO;
	
	@Autowired
	private DepartmentDAO deptDAO;
 
	@PostMapping("/insertEmp")
	public Employee insertDept(@RequestBody Employee newempy) {
		return empDAO.save(newempy);
	}
 
	@GetMapping("/findAllEmp")
	public List<Employee> getAllEmployee() {
		return (List<Employee>) empDAO.findAll();
 
	}
 
	@GetMapping("/findEmp/{id}")
	public Employee performFind(@PathVariable Integer id) {
		return empDAO.findById(id).get();
 
	}
 
	@PutMapping("/updateEmp")
	public Employee updateEmply(@RequestBody Employee newEmployee) {
		return empDAO.save(newEmployee);
 
	}
 
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		String msg = "";
		try {
			empDAO.deleteById(id);
			msg = "Employee Details Deleted Successfully";
 
		} catch (Exception e) {
			msg = "Employee Details Not Found";
		}
		return msg;
 
	}
	
	@GetMapping("/EmpAutopop")
	public List<Integer> doAutoPop(){
		return empDAO.getIdList();
	}
//	
//	@GetMapping("/AutoPopByName")
//	public List<String> doAutoPopByNAme(){
//		return empDAO.getNameList();
//	}
	
 
}