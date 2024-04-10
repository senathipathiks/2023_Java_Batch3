package com.ems.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import com.ems.bean.Employee;


public interface EmployeeDAO extends JpaRepository<Employee, Integer>
{

	@Query("select eid from Employee")//Query methods in spring data JPA
	public List<Integer> getIdList();
	
	@Query("select ename from Employee order by ename")//Query methods in spring data JPA
	public ArrayList<String> getNameList();
     
	@Transactional
	public void deleteByEname(String ename);
	
	
	public List<Employee> findByEname(String ename);
	

	
//	@Modifying
//	@Query("delete from Employee e where e.ename=:name")
//	public  void deleteName(String name);
}


