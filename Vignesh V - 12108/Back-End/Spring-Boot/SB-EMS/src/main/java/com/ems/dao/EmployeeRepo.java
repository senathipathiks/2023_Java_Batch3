package com.ems.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

//Spring Data JPA
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
	
	
	//Query Method in spring Data JPA
	@Query("select empId from Employee order by empId")
	public List<Integer>getIdList();

	@Query("select empName from Employee order by empName")
	public List<String>getNameList();
	
	@Transactional
	public void deleteByEmpName(String EmpName);
	
	@Query("select empName from Employee order by empName")
	public List<String> getEmpName();
	
	
	public List<Employee> findByEmpName(String empName);
	
	
	
}
