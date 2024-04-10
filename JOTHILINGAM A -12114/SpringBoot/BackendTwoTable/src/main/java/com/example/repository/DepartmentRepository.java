package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Department;
import com.example.model.Student;
import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	
	@Query("select deptid from Department order by deptid")
	public List<Integer> getIdList();

	
	
	
	

}
