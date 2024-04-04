package com.sbdeptemp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbdeptemp.dao.DepartmentDAO;
import com.sbdeptemp.model.Department;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {

	@Autowired
	DepartmentDAO dao;

	// save the department details
	public Department saveDepartment(Department department) {

		if (department != null) {
			dao.saveDepartment(department);
		}

		return null;
	}

	// update the employee details
	public Department updateDepartment(Department department) {
		if (department != null) {
			dao.saveDepartment(department);
		}

		return null;

	}
	
	//fetch all ID list
	public List<Integer> getAllIdList() {
		
		return dao.fetchIdlist();
		
	}

	// fetching all the department details
	public List<Department> fetchDepartment() {
		return dao.fetchAllDepartment();

	}
	
	//fetching the department details using id
	public Department fetchDepartmentById(int id) {
		
		if(id > 0)
			return dao.fetchById(id);
		return null;
		
	}

	// delete the department details using id
	public String deleteById(int id) {
		if (id > 0) 
			return dao.deleteDepartmentById(id);

		return "please enter valid employee details";

	}

}
