package com.employeeApplication.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.employeeApplication.dto.Employee;
import com.employeeApplication.repo.EmployeeRepo;

@Repository
public class EmployeeDAO {

	private EmployeeRepo repo;

	public EmployeeDAO(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	// save
	public Employee save(Employee employee) {

		return repo.save(employee);
	}

	// fetch by ID
	public Employee fetch(int id) {

		Optional<Employee> op = repo.findById(id);

		if (op.isPresent())
			return op.get();
		else
			return null;

	}

	// fetch All
	public List<Employee> fetchAll() {

		return repo.findAll();
	}

	// update employee
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	// delete Employee
	public String deleteById(int id) {
		repo.deleteById(id);
		return "data deleted successfully";
	}

	// fetch By Employee name
	public List<Employee> fetchByName(String name) {
		return repo.findByName(name);
	}

	// fetch the employee for search operation like operation
	public List<Employee> fetchLikeEmployees(String name) {
		return repo.findByNameContaining(name);
	}

	// fetch all employee List
	public List<Integer> fetchAllEmployeeID() {
		return repo.fetchAllEmployeeId();

	}

	// fetch all name in db
	public List<String> getNames() {
		return repo.findAllNames();

	}

	// delete Employee By using name
	public String deleteByName(String name) {
		repo.deleteByName(name);
		return "data deleted successfully";
	}

}
