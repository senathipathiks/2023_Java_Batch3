package com.employeeApplication.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employeeApplication.dto.Employee;

import jakarta.transaction.Transactional;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	
	public List<Employee> findByName(String name);
	
	@Query("select e.id from Employee e")
	public List<Integer> fetchAllEmployeeId();
	
	
	@Query("select distinct e.name from Employee e")
	public List<String> findAllNames();
	
	public List<Employee> findByNameContaining(String name);
	
	@Transactional
	public void deleteByName(String name);
		

}
