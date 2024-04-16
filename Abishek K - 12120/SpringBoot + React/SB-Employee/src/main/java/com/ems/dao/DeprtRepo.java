package com.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.bean.Department;

import jakarta.transaction.Transactional;

public interface DeprtRepo extends JpaRepository<Department,Integer > {
	
	@Transactional
	public Department findByDptName(String dptName);
	
	@Transactional
	public void deleteByDptName(String dptName);
		
	

}
