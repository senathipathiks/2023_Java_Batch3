package com.employeeApplication.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeApplication.dto.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	
	public List<Employee> findByName(String name);
	
	
	public List<Employee> findByNameContaining(String name);
		

}
