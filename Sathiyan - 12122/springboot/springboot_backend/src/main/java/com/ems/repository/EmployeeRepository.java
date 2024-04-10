package com.ems.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
	
	@Query("select id from Employee")
	public List<Integer> getEmployeeID();
	
	
}



