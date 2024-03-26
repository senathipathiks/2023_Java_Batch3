package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sms.entity.Department;


public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	@Query("from Department order by deptName ")
	public List<Department> getAllStudent();
}
