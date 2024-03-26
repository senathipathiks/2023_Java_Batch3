package com.ems.controller;

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
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class EMSController {
	
	@Autowired
	EmployeeRepo repo;
	

//<--------------------------------------View Employeess ---------------------------------------------->
	@GetMapping("GetAllEmployee")
	public ArrayList<Employee> showFindAllPage() {	
		return (ArrayList<Employee>) repo.findAll();
	}
	
	//View in Browser itself
	@GetMapping("GetEmployee/{eid}")
	public Employee dofindById(@PathVariable("eid")int eid) {
		return repo.findById(eid).get();	
	}
	
	
	@GetMapping("FindEmployeeByName/{ename}")
	public ArrayList<Employee> dofindByName(@PathVariable("ename")String ename) {			
		return repo.findByEname(ename);	
	}
	
	
//<--------------------------------Insertion------------------------------------------>
	@PostMapping("CreateEmployee")
	public String doInsertOperation(@RequestBody Employee employee) {
		String Msg="";
		try {		
			repo.save(employee);
			Msg="Employee Record Saved";
			
		} catch (Exception e) {
			Msg="Employee Record Not Saved";
		}
		return Msg;
	}
	
	//<--------------------------------Deletion------------------------------------------>
	
	
	@DeleteMapping("DeleteEmployee/{eid}")
	public String doDelete(@PathVariable("eid")int eid) {
		String Msg="";
		try {
			repo.deleteById(eid);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@RequestMapping("DeletionByName/{ename}")
	public String doDeleteByName(@PathVariable("ename")String ename) {
		String Msg="";
		try {
			repo.deleteByEname(ename);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;
	}
	
	
	//<--------------------------------Deletion------------------------------------------>
	
	@PutMapping("/UpdateEmployee")
	public String doupdate(@RequestBody Employee employee) {
		String Msg="";
		try {		
			repo.save(employee);
			Msg="Record updated Successfully";
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	//<------------------------------------Edit or Delete -------------------------------------------->
	@PostMapping("EditOrDelete/{btn}")
	public String editOrDelete(@PathVariable String btn,@RequestBody Employee employee) {
		
		String Msg="";
		if (btn.equals("Edit")) {
			repo.save(employee);
			Msg="Record Updated";
		}else if (btn.equals("Delete")) {
			repo.deleteById(employee.getEid());
			Msg="Record Deleted";
		}
		
		return Msg;
	}
	
	@RequestMapping("InsertionInFindAll")
	public ModelAndView doInsertInFindAll(Employee employee) {
		ModelAndView mv=new ModelAndView("FindAll");
		try {		
			repo.save(employee);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ArrayList<Employee> list=(ArrayList<Employee>) repo.findAll();
		mv.addObject("idList",list);
		return mv;
	}
	
	
	

}
