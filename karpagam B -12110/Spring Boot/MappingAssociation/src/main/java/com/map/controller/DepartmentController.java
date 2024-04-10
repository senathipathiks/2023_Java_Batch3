package com.map.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.bean.Department;
import com.map.repository.DepartmentRepository;

@RestController
@CrossOrigin("*")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	//to insert the data
	@PostMapping("/deptInsert")
	Department newDepartment(@RequestBody Department newDepartment ) {
		return departmentRepo.save(newDepartment);
	}
	
	//get all department details
	@GetMapping("/getAllDept")
	List<Department> getAllDepartment() {
		return (List<Department>) departmentRepo.findAll();
	}	
	
//	//delete
//	@DeleteMapping("/doDepartmentDelete/{id}")
//	public String DeleteDepartment(@PathVariable("id") int id) {
//		String msg = "";
//		try {
//			departmentRepo.deleteById(id);
//			msg = "Department Data Deleted";
//		} catch (Exception e) {
//			msg = "Department Data not Deleted";
//		}
//		return msg;
//	}
	
	//get by id
	@GetMapping("/GetDeptId/{id}")
	public Optional<Department> doDeptFind(@PathVariable("id") int id) {
	   return departmentRepo.findById(id);
	}

	//update
		@PutMapping("/doDeptUpdate")
		Department updateDepartment(@RequestBody Department dept) {

			return departmentRepo.save(dept);
		}

    //to get all the Id  
    @GetMapping("/getDeptIdList")
		List<Integer> getDeptbylist() {
			List<Integer> idlist = departmentRepo.getAllDeptId();
			return idlist;
			}

	
	
	
	
	
	

}
