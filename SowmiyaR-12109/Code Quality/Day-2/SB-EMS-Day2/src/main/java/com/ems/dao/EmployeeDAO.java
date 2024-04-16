package com.ems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

//spring data JPA
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {
      
	//Query methods in spring Data JPA
	
	@Query("select eid from Employee order by eid")
	public List<Integer> getIdList();
	
	@Query("select ename from Employee order by ename")
	public List<String> getNameList();
	
//	@Modifying
//	@Query("delete from Employee e where e.ename=:ename")
//	void deleteByName(@Param("ename")String ename);
//	Another way to delete ename
	@Transactional
	public void deleteByEname(String ename);
	
	@Query("select esalary from Employee")
	public List<Integer> getSalaryList();
	
	public void deleteByEsalary(Integer esalary);

	public List<Employee> findByEname(String ename);
	
	
	
	
}
