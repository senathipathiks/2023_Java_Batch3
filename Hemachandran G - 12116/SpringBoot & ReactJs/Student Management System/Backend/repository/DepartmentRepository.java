package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sms.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
		
		@Query("select id from Department order by id asc")
		public List<Integer> fetchDeptIds();

	}

