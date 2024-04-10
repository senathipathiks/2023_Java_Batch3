package com.sbdeptemp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbdeptemp.model.Department;
import com.sbdeptemp.repository.DepartmentRepo;

@Repository
public class DepartmentDAO {
	
	@Autowired
	DepartmentRepo repo;
	
	
	//save department
	public Department saveDepartment(Department department) {
		return repo.saveAndFlush(department);
		
	}
	
	//fetch All ID list
	public List<Integer> fetchIdlist() {
		return repo.fetchDeptIdList();
		
	}
	
	
	//fetch all the department
	public List<Department> fetchAllDepartment() {
		return repo.findAll();
	}
	
	//fetch by id
	public Department fetchById(int id) {
		return repo.findById(id).get();
		
	}
	
	//delete the department record using id
	public String deleteDepartmentById(int id) {
		repo.deleteById(id);
		return "data deleted successfully...!";
		
	}
	

}
