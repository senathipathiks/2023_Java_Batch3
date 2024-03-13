package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;
@Transactional
//spring data JPA
public interface EmployeeDAO extends CrudRepository<Employee, Object> {
      
	//Query methods in spring Data JPA
	@Query("select eid from Employee")
	public List<Integer> getIdList();
	
	@Query("select ename from Employee")
	public List<String> getNameList();
	
	@Modifying
	@Query("delete from Employee e where e.ename=:ename")
	void deleteByName(@Param("ename")String ename);
	
	@Query("select esalary from Employee")
	public List<Integer> getSalaryList();
	
	@Modifying
	@Query("delete from Employee e where e.esalary=:esalary")
	void deleteBySalary(@Param("esalary")Integer esalary);
	
}
