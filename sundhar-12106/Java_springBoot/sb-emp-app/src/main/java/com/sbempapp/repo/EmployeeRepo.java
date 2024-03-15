package com.sbempapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sbempapp.bean.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

//	public List<Employee> findEmployeeByempName(int empId);

	// getting id of all the employees
	@Query("select e.empId from Employee e order by e.empId")
	public List<Integer> findAllempId();

	// getting the names of the employees
	@Query("select e.empName from Employee e")
	public List<String> findAllEmpName();

	// getting the employees using name
//	@Query("select e from Employee e where e.empName=?1")
	public List<Employee> findByEmpName(String name);

	// delete employee by name
	@Transactional
//	@Modifying
//	@Query("delete from Employee e where e.empName=?1")
	public void deleteByEmpName(String name);
	
	
	public List<Employee> findByEmpNameContaining(String name);

}
