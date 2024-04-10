package com.ems.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import com.ems.exception.EmployeeNotFoundException;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeRestController {

	
	@Autowired
	EmployeeDAO dao;
	
	
	
	@PostMapping("/CreateEmployee")
	 
	public  String createEmployee(@RequestBody Employee employee) {
		String msg="";
		try {
			dao.save(employee);
			msg="Employee object created";
		}
		catch (Exception e) { 
			// TODO: handle exception
			msg="Employee object not created";
		}
		return msg;
	}
// delete employee	
	
	@DeleteMapping("/DeleteEmployee/{eid}")
	public  String deleteEmployee(@PathVariable("eid") int eid) {
		String msg="";
		try {
			dao.deleteById(eid);
			msg="Employee object deleted";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Employee object not deleted"; 
		}
		return msg;
	} 
	
//	delete by name
	
	@DeleteMapping("/DeleteEmployeeByName/{ename}")
	public  String deleteEmployeeByName(@PathVariable("ename") String ename) {
		String msg="";
		try {
			dao.deleteByEname(ename);
			msg="Employee object deleted by name";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Employee object not deleted by name";
		}
		return msg;
	} 
//	Updating
	
	@PutMapping("/UpdateEmployee")
	public  String updateEmployee(@RequestBody Employee employee) {
		String msg="";
		try {
			dao.save(employee);
			msg="Employee object updated";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="Employee object not updated";
		}
		return msg;
	} 
	
	

//	find by id
	@GetMapping("/GetEmployee/{eid}")
	public Employee performFind(@PathVariable("eid") int eid) {
		return dao.findById(eid).get();
	}
	
//	find by name
	
	@GetMapping("/GetEmployeeByName/{ename}")	
	public List<Employee> allEmployees(@PathVariable("ename") String ename){
		return dao.findByEname("ename");
		
	} 
	
//	find all
	
	@GetMapping("/GetAllEmployee")
	public List<Employee> findAllEmployee() {
		List<Employee> empList= (List<Employee>) dao.findAll();

		return empList;
	} 
	
//	edit or delete
	
	@PostMapping("/EditOrDelete/{btn}")
	public  String editOrDelete(@PathVariable String btn,@RequestBody Employee employee) {
		String msg="";
		if(btn.equals("Edit")) {
			dao.save(employee);
			msg="Employee object edited";
		}
		if(btn.equals("Delete")){
			dao.deleteById(employee.getEid());
			msg="Employee object  deleted";
		}
		return msg;
	} 
	
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		return dao.getIdList();
	}
}
//	----------------------------------------------------------------------------------------------
	

