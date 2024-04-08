package com.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.map.bean.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	@Query("select id from Department")
	public List<Integer> getAllDeptId();

}
