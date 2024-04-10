package com.springboot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;
 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
	
	@Query("select id from Employee order by id")
	public ArrayList<Integer> getId();
}
 
