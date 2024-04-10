package com.emp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emp.bean.Department;
import com.emp.bean.Employee;

import jakarta.transaction.Transactional;
 
@Transactional
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
 
	@Query("select eid from Employee")
	public List<Integer> getIdList();
	@Query("select ename from Employee")
	public List<String> getNameList();

}