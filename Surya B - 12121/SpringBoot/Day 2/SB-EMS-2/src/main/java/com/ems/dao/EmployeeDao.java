package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ems.bean.Employee;

//Spring Data JPA
public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	
	@Query("select eid from Employee order by eid")
	List<Integer> getIdList();
	
	@Query("select ename from Employee")
	List<String> getNameList();
	
//	@Transactional
//	@Query("DELETE FROM Employee emp WHERE emp.ename = :ename")
//	  void deleteByName(@Param("ename") String ename);
	
	@Transactional
	void removeByEname(String ename);
	
	List<Employee> findByEname(String ename);
	
}


