package com.sbdeptemp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbdeptemp.dao.EmployeeDAO;
import com.sbdeptemp.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	
	
	@Autowired
	EmployeeDAO dao;
	
	
	//saving the employee details
	public Employee saveEmployee(Employee employee) {
		
		if(employee != null) {
			return dao.saveEmployee(employee);
		}
		
		return null;
		
	}
	
	//updating the employee details
	public Employee updateEmployee(Employee employee) {
		
		if(employee != null) {
			return dao.saveEmployee(employee);
		}
		
		return null;
	}
	
	//fetch employee using id
	public Employee fetchEmployee(int id) {
		if(id > 0)
			return dao.fetchEmployee(id);
		return null;
	}
	
	//fetching all the employee details
	public List<Employee> fetchAllEmployee() {
		
		return dao.fetchAllEmployee();
	}
	
	
	//delete employee by id
	public String deleteEmployeeById(int id) {
		if(id > 0)
			return dao.deleteById(id);
		return "please enter the valid id";
	}
	
	

}
