package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.map.bean.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
   
	@Query("select id from Employee")
	public List<Integer> getAllEmpId();
}
