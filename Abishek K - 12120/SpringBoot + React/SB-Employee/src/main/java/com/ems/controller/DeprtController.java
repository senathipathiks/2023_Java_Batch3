package com.ems.controller;

import java.util.List;

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

import com.ems.bean.Department;
import com.ems.dao.DeprtRepo;

@RestController
@RequestMapping("/dpt")
@CrossOrigin("http://localhost:3000/")
public class DeprtController {
	
	@Autowired
	DeprtRepo dRepo;
	
	
	@PostMapping("/insertDept")
	public String insertDeprt(@RequestBody Department dpt) {
		String msg;
		try {
		dRepo.save(dpt);
		msg = "Insertion Successfully Done";
		}catch(Exception e) {
			msg = "Insertion Failure";
		}
		return msg;
		
	}
	
	@PutMapping("/updateDept")
	public String  upadteDepart(@RequestBody Department dpt) {
		String msg;
		try {
			dRepo.save(dpt);
			msg="Updation Successfully Done";
		}catch(Exception e) {
			msg="Updation Failure";
		}
		
		return msg;
	}
	
	@GetMapping("/findDptId/{Id}")
	public Department findDptId(@PathVariable("Id")int dptId) {
		 
		Department dpt = dRepo.findById(dptId).get();
		return dpt;
	}
	
	@GetMapping("/findDptName/{Name}")
	public Department findDptName(@PathVariable("Name")String dptName) {
		
		Department dpt = dRepo.findByDptName(dptName);
		return dpt;
	}
	
	@DeleteMapping("/delDptId/{Id}")
	public String deleteId(@PathVariable("Id")int dptId) {
		String msg;
		try {
			dRepo.deleteById(dptId);
			msg="Deletion Successfull";
		}catch(Exception e) {
			msg="Deletion Failure";
		}
		return msg;
	}
	
	@DeleteMapping("/delDptName/{Name}")
	public String deleteName(@PathVariable("Name")String dptName) {
		
		String msg;
		try {
			dRepo.deleteByDptName(dptName);
			msg = "Deletion Successfull";
		}
		catch(Exception e) {
			msg="Deletion Failure";
			
		}
		return msg;
	}
	
	@GetMapping("/getDept")
	public List<Department> getAll(){
	  List<Department> dList = dRepo.findAll();
	  return dList;
	}
	
	
	

}
