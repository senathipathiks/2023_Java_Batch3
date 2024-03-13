package com.employeeApplication.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeeApplication.dto.Employee;
import com.employeeApplication.repo.EmployeeRepo;

@Repository
public class EmployeeDAO {

	@Autowired
	EmployeeRepo repo;

	// save
	public Employee save(Employee employee) {

		return repo.save(employee);
	}

	// fetch by ID
	public Employee fetch(int id) {

		Optional<Employee> op = repo.findById(id);

		return op.get();
	}

	// fetch All
	public List<Employee> fetchAll() {
		List<Employee> ls = repo.findAll();
		System.out.println(ls);
		return ls;
	}

	// update employee
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	//delete Employee
	public String deleteById(int id) {
		System.out.println(id +"from dao");
		repo.deleteById(id);
		return "data deleted successfully";
	}
	
	//fetch By Employee name
	public List<Employee> fetchByName(String name) {
		return repo.findByName(name);
	}

}
