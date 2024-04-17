package com.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.bean.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {
	
	@Query("select name from Employees order by name")
	public List<String> getName();
	
	public List<Employees> findByName(String name);
	
	@Query("select id from Employees order by id")
	public List<Integer> getEmpId();
}
