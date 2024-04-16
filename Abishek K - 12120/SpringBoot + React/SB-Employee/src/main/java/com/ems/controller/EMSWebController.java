package com.ems.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EMSWebController {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/Start")
	public ModelAndView startApplication() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	
	@RequestMapping("/Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Banner");
		return mv;
	}
	
	@RequestMapping("/Mainpage")
	public ModelAndView loadMainpage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Mainpage");
		return mv;
	}
	
	@RequestMapping("/Navbar")
	public ModelAndView loadNavbar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Navbar");
		return mv;
	}
	
	@RequestMapping("/Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		
		return mv;
	}
	
	@PostMapping("PerformInsert")
	public ModelAndView performInsert(Employee emp ) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		try {
		dao.save(emp);
		mv.addObject("msg","Insertion is Successfully Done");
		}
		catch(Exception e) {
			mv.addObject("msg","Insertion is Failure");
		}
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		List<Integer> idList =  dao.getIdList();
		mv.addObject("idList",idList);
		return mv;
	}
	
	@PostMapping("PerformDelete")
	public ModelAndView performDelete(@RequestParam("empId")int empId) {  //It is the fastest way to set the value for the particular attribute.
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
		dao.deleteById(empId);
		mv.addObject("msg","Record is Deleted");
		List<Integer> idList =  dao.getIdList();
		mv.addObject("idList",idList);
		}
		catch(Exception e) {
			mv.addObject("msg","Record is Not Deleted");
		}
		return mv;
	}
	
	@RequestMapping("DeleteName")
	public ModelAndView loadDeleteName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteName");
		List<String> nameList = dao.getNameList();
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	@PostMapping("PerformDeleteName")
	public ModelAndView doDeleteName(@RequestParam("empName")String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteName");
		try {
			dao.deleteByEmpName(empName);
			mv.addObject("msg","Deletion is Successfull");
			List<String> nameList = dao.getNameList();
			mv.addObject("nameList",nameList);
		}
		catch(Exception e){
			System.out.println(e);
			mv.addObject("msg","Deletion Failure");
		}
		return mv;
		
		
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		ModelAndView mv = new ModelAndView();
		List<Integer> idList =  dao.getIdList();
		mv.addObject("idList",idList);
		mv.setViewName("Find");
		return mv;
	}
	
	@PostMapping("PerformFind")
	public ModelAndView doFind(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		try {
			Employee emp = dao.findById(empId).get();
			if(emp==null) {
				mv.addObject("msg","Record Not Found");
			}
			else {
				mv.addObject("emp",emp);
				List<Integer> idList =  dao.getIdList();
				mv.addObject("idList",idList);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mv;
	}
	
	@RequestMapping("FindName")
	public ModelAndView loadFindName() {
		ModelAndView mv = new ModelAndView();
		List<String> nameList = dao.getNameList();
		mv.setViewName("FindName");
		mv.addObject("nameList",nameList);
		return mv ;
	}
	
	@PostMapping("PerformFindName")
	public ModelAndView performFind(@RequestParam("empName")String empName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindName");
		try {
	    List<Employee> empList =  dao.findByEmpName(empName);
	    
	    if(empList==null) {
	    	mv.addObject("msg","Record Not Found");
	    }
	    else {
	    	mv.addObject("empList",empList);
	    	List<String> nameList = dao.getNameList();
	    	mv.addObject("nameList",nameList);
	    }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	
	@PostMapping("FetchEmployee")
	public ModelAndView loadFetch(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		Employee emp = dao.findById(empId).get();
		mv.addObject("Emp", emp);
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv ;
	}
	
	@PostMapping("PerformUpdate")
	public ModelAndView doUpdate(Employee emp){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		try {
		dao.save(emp);
		mv.addObject("msg", "Updation is Successfull");
		}
		catch(Exception e) {
			System.out.println(e);
			mv.addObject("msg", "Updation is Failure");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
		
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		mv.addObject("msg", "FindAll");
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
	}
	
	@PostMapping("Remove")
	public ModelAndView doRemove(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		dao.deleteById(empId);
		mv.addObject("msg", "FindAll");
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
	}
	
	@PostMapping("Edit")
	public ModelAndView doEdit(@RequestParam("empId")int empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		int id = empId;
		mv.addObject("msg", "Edit");
		mv.addObject("id", id);
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
		
	}
	
	@PostMapping("Save")
	public ModelAndView doSave(Employee emp) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		dao.save(emp);
		mv.addObject("msg", "FindAll");
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
		
		
	}
	
	@PostMapping("AddEmployee")
	public ModelAndView doAdd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		mv.addObject("msg", "Insert");
		List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
		
	}
	
	@PostMapping("InsertValue")
	public ModelAndView doInsert(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
	    dao.save(emp);
	    mv.addObject("msg", "FindAll");
	    List<Employee> empList = (List<Employee>) dao.findAll();
		mv.addObject("EmpList", empList);
		return mv;
	}

}
