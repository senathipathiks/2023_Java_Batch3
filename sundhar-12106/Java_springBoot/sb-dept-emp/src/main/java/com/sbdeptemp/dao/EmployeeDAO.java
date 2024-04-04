package com.sbdeptemp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbdeptemp.model.Employee;
import com.sbdeptemp.repository.EmployeeRepo;

@Repository
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepo repo;
	
	
	//save employee
	public Employee saveEmployee(Employee employee) {
		return repo.saveAndFlush(employee);
		
	}
	
	//fetch All employee
	public List<Employee> fetchAllEmployee() {
		return repo.findAll();
		
	}
	
	//fetch Employee By ID
	public Employee fetchEmployee(int id) {
		return repo.findById(id).get();
		
	}
	
	//delete by id
	public String deleteById(int id) {
		repo.deleteById(id);
		return "data deleted successfully...!";
	}

}
