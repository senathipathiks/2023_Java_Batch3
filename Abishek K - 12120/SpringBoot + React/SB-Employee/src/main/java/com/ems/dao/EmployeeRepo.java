package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

import jakarta.transaction.Transactional;

//Spring Data JPA - all the crud operation automatically done.
//when this part run there is an implementing class with the dao interface.So there is class to create an implementing object in the IOC spring container.Here all crud method are available in the spring container.So it will be injected from the conatiner to the controller through autowired.
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	//Query Method in Spring Data JPA
	@Query("select empId from Employee order by empId")
	public List<Integer> getIdList();        //this method is automatically implement in the IOC container.
	
	@Query("select empName from Employee order by empName")
	public List<String> getNameList();
	
	@Transactional
	public void deleteByEmpName(String empName);
	
	@Transactional
	public List<Employee> findByEmpName(String empName);
	
	@Transactional
	public List<Employee> findByEmpId(int empId);
	
	

}
