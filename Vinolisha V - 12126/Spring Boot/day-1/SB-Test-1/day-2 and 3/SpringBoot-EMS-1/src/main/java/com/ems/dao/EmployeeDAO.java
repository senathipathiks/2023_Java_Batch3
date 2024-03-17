package com.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

//Spring Data JPA(spring IOC container)
@Transactional // use to modify the table eg update
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	// Query MEthods in Spring Data JPA
	@Query("select eid from Employee order by eid")
	public ArrayList<Integer> getIdList();// ioc container will implements this functionality

	// Query Methods in Spring Data JPA
	@Query("select ename from Employee order by ename")
	public ArrayList<String> getNameList();// ioc container will implements this functionality44

//seleting the records using name
//	@Modifying
//	@Query("delete from Employee e where e.ename= :ename")
//	public void deleteByName(@Param("ename") String ename);

	// easy method for deleteing employee details by name
	@Transactional // modifying the records thats the reson we have to come with transactional
	public void deleteByEname(String ename);

	public ArrayList<Employee> findByEname(String ename);

}
