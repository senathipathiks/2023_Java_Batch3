package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

// spring Data JPA (we no need to create basic crud operation method)
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	// query Method in spring data jpa
	@Query("select eid from Employee order by eid")
	public List<Integer> getIdList();

	@Query("select ename from Employee order by ename")
	public List<String> getNameList();
	

	@Transactional
	public void deleteByEname(String ename);
	
	
	public List<Employee> findByEname(String ename);

	
	
	
	
}
