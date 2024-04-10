package com.emp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emp.bean.Department;

import jakarta.transaction.Transactional;
 
@Transactional
public interface DepartmentDAO extends JpaRepository<Department, Integer> {
 
	@Query("select id from Department")
	public List<Integer> getIdList();
	@Query("select name from Department")
	public List<String> getNameList();

}
