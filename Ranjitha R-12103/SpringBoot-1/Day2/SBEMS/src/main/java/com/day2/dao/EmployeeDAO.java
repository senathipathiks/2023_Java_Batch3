package com.day2.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.day2.bean.Employee;

//Spring Data JPA-its gets  implementation automatically

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	// Query method in Spring Data JPA
	@Query("select eid from Employee")
	public List<Integer> getIdList();
	
	@Query("select ename from Employee")
	public List<String> getNameList();
	
	

}
