package com.ems.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;
import com.ems.bean.Employee;

//Spring Data JPA
public interface EmployeeDAO extends CrudRepository<Employee,Integer>{
	//query methods in spring data jpa
	@Query("select empId from Employee")
	public List<Integer> getIdList();
	
}
