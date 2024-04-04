package com.sbdeptemp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sbdeptemp.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	
	@Query("select d.deptId from Department d")
	public List<Integer> fetchDeptIdList() ;

}
