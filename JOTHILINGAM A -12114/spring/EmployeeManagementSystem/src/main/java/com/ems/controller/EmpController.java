package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@Controller
public class EmpController {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		return new ModelAndView("Links");
	}
	
	@RequestMapping("insert")
	public ModelAndView loadInsert() {
		return new ModelAndView("Insert");
	}
	
	@RequestMapping("delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("Delete").addObject("key",dao.getIds());
	}
	
	@RequestMapping("update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("Update").addObject("key",dao.getIds());
	}
	
	@PostMapping("insertemployee")
	public ModelAndView doInsert(@ModelAttribute("bean")Employee emp) {
		int n= dao.insertEmployee(emp);
		
		if(n==1) 
			return new ModelAndView("Insert").addObject("msg","Record Inserted Successfully");
		
		
		return new ModelAndView("Insert").addObject("msg","Insertion Failure");
		
	}
	
	@PostMapping("deleteemployee")
	public ModelAndView doDelete(@ModelAttribute("bean")Employee emp) {
		
		if(dao.deleteEmployee(emp))
			return new ModelAndView("Delete").addObject("key",dao.getIds()).addObject("msg","Record Deleted Successfully");
		
		return new ModelAndView("Delete").addObject("key",dao.getIds()).addObject("msg","Deletion Failure");

	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@ModelAttribute("bean")Employee emp) {
		return new ModelAndView("Update").addObject("key",dao.getIds()).addObject("bean",dao.getEmployee(emp));
	}
	
	@PostMapping("updateemployee")
	public ModelAndView doUpdate(@ModelAttribute("bean")Employee emp) {
		
		if(dao.updateEmployee(emp))
			return new ModelAndView("Update").addObject("key",dao.getIds()).addObject("msg","Record Updated Successfully");
		
		return new ModelAndView("Update").addObject("key",dao.getIds()).addObject("msg","Updation Failure");
	}
}
