package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

@Transactional
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

	//QUery Method in Spring Data JPA
	@Query("select empId from Employee order by empId")
	public List<Integer> getIdList();
	
	@Query("select distinct(empName) from Employee order by empName")
	public List<String> getNameList();
	
	@Query("select distinct(empSalary) from Employee order by empSalary")
	public List<Float> getSalaryList();
	
//	@Modifying
//	@Query("delete from Employee where empName = :name")
//	public Integer deleteByName(@Param("name")String name);
	
	public void deleteByEmpName(String empName);
	
//	@Modifying
//	@Query("delete from Employee where empSalary = :salary")
//	public Integer deleteBySalary(@Param("salary")float salary);
	
	public void deleteByEmpSalary(float empSalary);
	
	
	@Query("from Employee where empId = :id")
	public Employee getEmployeeById(@Param("id")int id);
	
	
	@Query("from Employee where empName = :name")
	public List<Employee> getEmployeeByName(@Param("name")String name);
	
	
	@Query("from Employee where empSalary = :salary")
	public List<Employee> getEmployeeBySalary(@Param("salary")float salary);
	
}
	
