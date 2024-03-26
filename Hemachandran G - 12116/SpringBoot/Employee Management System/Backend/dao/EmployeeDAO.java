package com.ems.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ems.bean.Employee;




//Spring Data JPA
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {
	
	
	//Query Methods in Spring Data JPA
	@Query("select empId from Employee order by empId")
	public List<Integer> getIdList();
	
	
	@Query("select empName from Employee order by empName")
	public List<String> getNameList();
	
	 
	
	@Transactional
	public void removeByEmpName(String empName);
	
	@Transactional
	public List<Employee> findByEmpName(String empName);
	

}

