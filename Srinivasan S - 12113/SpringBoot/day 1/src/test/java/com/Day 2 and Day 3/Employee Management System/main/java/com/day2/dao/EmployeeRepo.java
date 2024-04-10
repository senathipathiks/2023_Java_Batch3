package com.day2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.day2.bean.Employee;

import jakarta.transaction.Transactional;

@Transactional
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

	//query methods in part of spring data jpa
	@Query("select eid from Employee")
	public List<Integer> getIdList();
	
	@Query("select ename from Employee")
	public List<String> getNameList();
	
//	@Modifying
//	@Query("delete from Employee e where e.ename = :ename")
//	public int deleteByName(@Param("ename") String ename);
	
	public void deleteByEname(String ename);
	
	public List<Employee> findByEname(String ename);
}
