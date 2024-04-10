package com.fullstack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fullstack.bean.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	@Query("select id from Department")
	public List<Integer> getIdList();
}
