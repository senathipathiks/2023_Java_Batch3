package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

// Spring data JPA
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	
//	Query methods in spring data JPA
	@Query("select eid from Employee")
	public List<Integer> getIdList();
//	
	@Query("select ename from Employee order by ename")
	public List<String> getNameList();
	
//	transactional is used to update the table (delete the string in the table)
	@Transactional						
	public void deleteByEname(String ename);
	
	public List<Employee>  findByEname(String ename);
//	public Object updateById(Integer eid);
}

