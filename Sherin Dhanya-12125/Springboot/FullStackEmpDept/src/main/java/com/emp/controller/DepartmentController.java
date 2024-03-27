package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.bean.Department;
import com.emp.dao.DepartmentDAO;
 

 
@RestController
@CrossOrigin("*") 
public class DepartmentController {
	@Autowired
	private DepartmentDAO deptDAO;

	@PostMapping("/insertdept")
	public Department insertDept(@RequestBody Department newdep) {
		return deptDAO.save(newdep);
	}
	@GetMapping("/getDept")
	public List<Department> getAllDept(){
		return (List<Department>) deptDAO.findAll();
	}
	@GetMapping("/findDept/{id}")
	public Department performFind(@PathVariable Integer id) {
		return deptDAO.findById(id).get();
	}
	@PutMapping("/updateDept")
	public Department updateDept(@RequestBody Department newdept) {
		return deptDAO.save(newdept);
	}
	@DeleteMapping("/deleteDept/{id}")
	public String deleteDept(@PathVariable Integer id) {
		String msg=" ";
		try {
			deptDAO.deleteById(id);
			msg="Department Details Deleted Successfully";
		}catch(Exception e) {
			msg="Department Details not found";
		}
		return msg;

	}
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		return deptDAO.getIdList();
	}
//	@GetMapping("/AutoPopByName")
//	public List<String> doAutoPopByNAme(){
//		return deptDAO.getNameList();
//	}

 
	
 
	
}