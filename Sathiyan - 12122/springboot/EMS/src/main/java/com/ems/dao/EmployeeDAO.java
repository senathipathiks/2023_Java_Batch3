package com.ems.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {
	
	
	//Query method in Spring Data JPA
	@Query("select eid from Employee order by eid")
	public ArrayList<Integer> getIdList();
	
	@Query("select ename from Employee order by ename")
	public ArrayList<String> getNameList();
	
	@Query("from Employee where eid= :eid")
	public Employee getEmployeeDetails(@Param("eid")int eid);

	@Query("from Employee where ename= :ename")
	public Employee getEmployeeDetailsByName(@Param("ename")String ename);
	
	/*
	 * @Modifying
	 * 
	 * @Query("delete from Employee e where e.ename = :ename") void
	 * deleteByName(@Param("ename")String ename);
	 */
	
	//Easy way to delete the Record using the Name
	@Transactional
	public void deleteByEname(String ename);
	
	public ArrayList<Employee> findByEname(String ename);
	
}




