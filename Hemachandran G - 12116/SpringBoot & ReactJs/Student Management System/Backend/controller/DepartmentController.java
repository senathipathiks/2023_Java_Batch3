package com.sms.controller;

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

import com.sms.model.Department;
import com.sms.model.Student;
import com.sms.repository.DepartmentRepository;



@RestController
@CrossOrigin("*")
public class DepartmentController {
	@Autowired
	DepartmentRepository repo;
	
	
	@GetMapping("GetAllDepartment")
	public List<Department> loadFindAllDepartment() {
		
		List<Department> deptList=(List<Department>) repo.findAll();
		return deptList;
		}
	
	@PostMapping("/CreateDepartment")
	public String CreateDepartment(@RequestBody Department department) {
		String msg="";
		try {
			repo.save(department);
			msg="Department Object Saved";
		}catch(Exception e) {
			msg="Department Object Not Saved";
		}
		return msg;
	}
	@DeleteMapping("/DeleteDepartment/{id}")
	public String DeleteDepartment(@PathVariable("id") int id) {
		String msg="";
		try {
			repo.deleteById(id);
			msg="Department Object Deleted";
			}catch(Exception e) {
				msg="Department Object not Deleted";
			}
		return msg;
	}
	
	@PutMapping("/UpdateDepartment")
	public String UpdateDepartment(@RequestBody Department department) {
		String msg="";
		try {
			repo.save(department);
			msg="Department Object Updated";
		}catch(Exception e) {
			msg="Department Object not Updated";
		}
		return msg;
	}
	@GetMapping("/GetDepartment/{id}")
	public Department performFind(@PathVariable("id") int id) {
		return repo.findById(id).get();
	} 
	@GetMapping("/GetDepartmentIds")
	public List<Integer> getDeptIds(){
		return repo.fetchDeptIds();
	}
	
	

}
