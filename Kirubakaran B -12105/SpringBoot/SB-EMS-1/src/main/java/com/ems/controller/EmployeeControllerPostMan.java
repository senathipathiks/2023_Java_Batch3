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
import org.springframework.web.bind.annotation.RestController;


import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeControllerPostMan {

	@Autowired
	EmployeeDAO dao;
	
	
	
	@PostMapping("/Insertemp")
	public String insertEmp(@RequestBody Employee emp) {
		
		String msg="";
		try {
	      dao.save(emp);
	     msg="Object saved";
		}catch (Exception e) {
		  msg="object not saved";
		}
		return msg;
	}
	
	@DeleteMapping("/DeleteEmp/{eid}")
	public String deleteEmp(@PathVariable("eid") int eid) {
		
		String msg="";
		try {
		 dao.deleteById(eid);
		 msg="Object  deleted";
		}catch(Exception e) {
			msg="Object not deleted";
		}
		return msg;
	}
	
	
	@DeleteMapping("/DeleteByName/{ename}")
	public String deletePage1(@PathVariable("ename") String ename) {
		String msg="";
		try {
		 dao.deleteByEname(ename);
		 msg="Object  deleted";
		}catch(Exception e) {
			msg="Object not deleted";
		}
		return msg;
	}
	
	@GetMapping("/FindEmp/{eid}")
	public Employee findEmp(@PathVariable int eid) {
	return dao.findById(eid).get();
	

	}
	
	@GetMapping("/FindAll")
	public List<Employee> findAllPage() {
		List<Employee> list2=dao.findAll();
	
		return list2;
	}
	
	@GetMapping("/FindByName/{ename}")
	public List<Employee> findbyname2(@PathVariable String ename) {
		
	return dao.findByEname(ename);
		
		
	}
		
	@PutMapping("/UpdateEmp")
	public String updateEmp(@RequestBody Employee emp) {
        System.out.println("Update emp");
		String msg="";
		try {
	      dao.save(emp);
	     msg="Object updated";
		}catch (Exception e) {
		  msg="object not updated";
		}
		return msg;

	}
	
	@PostMapping("/RemoveEmp/{btn}")
		public String doFindAllOperations(@PathVariable String btn , @RequestBody Employee emp) {
			String msg="";
			
			if(btn.equals("Edit")) {
				dao.save(emp);
				msg="object edited";
			}
			else if(btn.equals("Remove")) {
				dao.deleteById(emp.getEid());
				msg="object deleted";
			}	
			return msg;
			
		}
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		
		return dao.getIdList();	}
		
	
}
