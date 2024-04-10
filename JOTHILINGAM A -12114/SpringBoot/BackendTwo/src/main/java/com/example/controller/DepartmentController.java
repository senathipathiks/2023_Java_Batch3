package com.example.controller;

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

import com.example.model.Department;
import com.example.model.Student;
import com.example.repository.DepartmentRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
public class DepartmentController {
	
	@Autowired
	DepartmentRepository repo;
	
	
	@PostMapping("/CreateDepartment")
	public String createStudent(@RequestBody Department department) {

		String msg = " ";
		try {
			repo.save(department);
			msg = "department Object Saved";
		} catch (Exception e) {
			msg = "department Object Not Saved";
		}
		return msg;
	}
	
	@GetMapping("/GetDepartmentById/{deptid}")
	public Department getDepartmenttById(@PathVariable("deptid")int deptid) {
           		   Department dt = repo.findById(deptid).get();	
		
		return dt;
	}
	
	
	@GetMapping("getDepartmentIdList")
	List<Integer> getIdListtt(){
		List<Integer> list=repo.getIdList();
		return list;
		
	}
	
	@GetMapping("getAllDepartmentDetails")
	List<Department> getAllDepartment() {		
		List<Department>  st=repo.findAll();		
		return st;
	}
	
	
	@GetMapping("GetAllDepartmentNames")
	List<String> getAllDepartmentNames() {		
		List<String>  st=repo.getNameList();		
		return st;
	}
	
	
	
	
	
	@DeleteMapping("deleteDepartmentById/{deptid}")
	public String deleteDepartment(@PathVariable("deptid")int deptid) {		
		String msg = " ";
		try {
			repo.deleteById(deptid);		   
			msg = "delete!!!!";
		} catch (Exception e) {
			msg = "delete Fail!!!!";
		}
		return msg;		
	}
	
	
	@PutMapping("/UpdateDepartment")
	public String updateDepartment(@RequestBody Department department) {

		String msg = " ";
		try {
			repo.save(department);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			msg = "Employee Object Not Saved";
		}
		return msg;

	}
}
