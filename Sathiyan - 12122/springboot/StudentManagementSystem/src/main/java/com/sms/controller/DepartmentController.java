package com.sms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bean.Department;
import com.sms.repo.DeptRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("sms/db/api")
public class DepartmentController {
	
	@Autowired
	DeptRepo repo;
	
	@PostMapping("CreateDepartment")
	public String doInsertOperation(@RequestBody Department department) {
		String Msg="";
		try {		
			repo.save(department);
			Msg="Department Record Saved";
			
		} catch (Exception e) {
			Msg="Department Record Not Saved";
		}
		return Msg;
	}
	
	@GetMapping("GetAllDepartment")
	public ArrayList<Department> getAllEmployee(){
		return (ArrayList<Department>) repo.findAll();
	}
	
	@DeleteMapping("DeleteDepartment/{did}")
	public String doDelete(@PathVariable("did")int did) {
		String Msg="";
		try {
			repo.deleteById(did);
			Msg="Department Deleted";
		} catch (Exception e) {
			Msg="Department Not Deleted";
		}
		return Msg;	
	}
	
	@PutMapping("/UpdateDepartment/{did}")
	public String doupdate(@PathVariable int did ,@RequestBody Department department) {
		String Msg="";
		try {	
			if (repo.existsById(did)) {
				department.setDid(did);
				repo.save(department);
				Msg="Department updated Successfully";
			}
			
		} catch (Exception e) {
			System.out.println(e);
			Msg="Department updation Failed";
		}
		
		return Msg;
	}
	
	@GetMapping("GetDepartmentById/{did}")
	public Department findDepartmentById(@PathVariable("did")int did) {
		return repo.findById(did).get();	
	}
	
	@GetMapping("IdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}
	
	

}
