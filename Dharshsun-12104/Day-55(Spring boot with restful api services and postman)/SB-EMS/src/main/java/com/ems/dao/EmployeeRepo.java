package com.ems.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import com.ems.bean.Employee;

//Spring Data JPA
public interface EmployeeRepo extends CrudRepository<Employee,Integer>{
	//query methods in spring data jpa
	@Query("select empId from Employee order by empId asc")
	public List<Integer> getIdList();
	
	@Query("select empName from Employee order by empName asc")
	public List<String> getNameList() ;
	
	@Transactional
	public void deleteByEmpName(String empName); 
	/* public void findEmployeeByName(String empName); */
//	@Query("select e.empName from Employee e order by e.empName asc")
	public List<Employee> findByEmpName(String empName);

	

	
 
	
}
