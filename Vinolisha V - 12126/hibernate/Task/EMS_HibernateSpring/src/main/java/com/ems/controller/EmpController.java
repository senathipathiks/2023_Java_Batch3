package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@Controller
public class EmpController {

	@Autowired
	EmployeeDAO dao;

	@RequestMapping("links") // //landing page name
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("links");// views folder name
		return mv;
	}
	
	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv= new ModelAndView("home");
		return mv;
	}

	@RequestMapping("insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("insert");
		return mv;

	}

	@RequestMapping("delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("delete").addObject("key", dao.getId());
	}
	
	@RequestMapping("update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("update").addObject("key",dao.getId());
		
	}
	
	//method for viewing the page
	
		@RequestMapping("find")
		public ModelAndView loadFind() {
			return new ModelAndView("find").addObject("key",dao.getId());
		}
		
	//method for viewing all details page
		
		@RequestMapping("findAll")
		public ModelAndView loadFindAll() {
		return new ModelAndView("findAll").addObject("list",dao.getEmployeeList());
		}


	// insert
	@RequestMapping("insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Employee emp) {
		int n = dao.insertEmployee(emp);
//		ModelAndView mv=new ModelAndView("insert");
//		mv.addObject("msg","success");
//		return mv;
		if (n == 1)
			return new ModelAndView("insert").addObject("msg", "Record Inserted Successfully");
		else
		return new ModelAndView("insert").addObject("msg", "Insertion Failure");
	}

//	//delete
	
	@PostMapping("deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Employee emp) {
		if(dao.deleteEmployee(emp))
			return new ModelAndView("delete").addObject("key",dao.getId()).addObject("msg","Record deleted Successfully");
		
		return new ModelAndView("delete").addObject("key",dao.getId()).addObject("msg","Record deleted Failed");
		    
		
	}
	
	//for fetch writing methods
	@PostMapping("fetch")
	public ModelAndView doFetch(@ModelAttribute("bean")Employee emp) {
		return new ModelAndView("update").addObject("bean",dao.getEmployee(emp)).addObject("key",dao.getId());
		
	}
	
	@PostMapping("updateemployee")
	public ModelAndView doUpdate(@ModelAttribute("bean")Employee emp) {
		if(dao.updateEmployee(emp))
		return new ModelAndView("update").addObject("key",dao.getId()).addObject("msg","Record updated Successfully");
		else
		return new ModelAndView("update").addObject("key",dao.getId()).addObject("msg","Record Updated Failed");
		
	}
	
	//find
	@PostMapping("findemployee") //form action name
	public ModelAndView doFind(@ModelAttribute("bean")Employee e) {
		Employee emp=dao.getEmployee(e);
		if(emp!=null)
			return new ModelAndView("find").addObject("key",dao.getId()).addObject("bean",emp);
		return new ModelAndView("find").addObject("key",dao.getId()).addObject("msg","search Nothing");
	}

	//find all
	@RequestMapping("doEdit")
	public ModelAndView doFindAll(@ModelAttribute("bean")Employee emp) {
		
		dao.updateEmployee(emp);
		return new ModelAndView("findAll").addObject("list",dao.getEmployeeList());		
	}
	
	@RequestMapping("deletenow")
	public ModelAndView doDeleteNow(@RequestParam("bean") Integer id) {
		Employee emp=new Employee();
		emp.setEmpid(id);
		dao.deleteEmployee(emp);
		return new ModelAndView("findAll").addObject("list",dao.getEmployeeList());
	}
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(@ModelAttribute("bean") Employee emp) {
		dao.insertEmployee(emp);
		return new ModelAndView("findAll").addObject("list",dao.getEmployeeList());
	}
	
	}
