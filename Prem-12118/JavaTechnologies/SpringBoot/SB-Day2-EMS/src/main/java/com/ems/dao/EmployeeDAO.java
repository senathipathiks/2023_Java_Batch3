package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

//Spring Data JPA (Automatically the crud operations by injecting it)
//inside the Springframe work IOC extends 

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	// Query Method to create operations
	@Query("select eid from Employee order by eid asc")
	public List<Integer> getIdList();

	@Query("select ename from Employee order by ename asc")
	public List<String> getNameList();
	
	@Transactional
	public void deleteByEname(String ename);
	
 
	public List<Employee> findByEname(String ename);


}