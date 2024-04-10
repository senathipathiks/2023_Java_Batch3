package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@RestController
public class MyRestController {

	@Autowired
	EmployeeDAO dao;

//	find all
	
	@GetMapping(path = "/Employees")
	public List<Employee> allEmployees(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		Iterator<Employee> it=dao.findAll().iterator();
		while(it.hasNext())
			list.add(it.next());
		return list;
	} 
	
//	 find by id
	
	@GetMapping(path = "/Employee/{id}")
	public Employee getEmployee(@PathVariable Integer id){
		return dao.findById(id).get();
	} 
	
//	insert
	
	@PostMapping(path ="/CreateEmployee")
//	request body annotation is used to get or to access the input from the http protocol body and binding to the class employee
	public void insertEmployee(@RequestBody Employee employee) {	
		dao.save(employee);
	}
	
//	update
	
	@PutMapping(path ="/UpdateEmployee")
	public void updateEmployee(@RequestBody Employee employee) {	
		dao.save(employee);
	}
	
//	delete
	
	@DeleteMapping(path ="/DeleteEmployee")
//	request body annotation is used to get or to access the input from the http protocol body and binding to the class employee
	public void deleteEmployee( Integer id) {	
		dao.deleteById(id);
	}
}

