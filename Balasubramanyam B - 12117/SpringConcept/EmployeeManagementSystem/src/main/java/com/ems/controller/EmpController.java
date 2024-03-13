package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@Controller
public class EmpController {
	
	@Autowired
	EmployeeDAO dao;
	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		return new ModelAndView("Banner");
	}
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
	
	@RequestMapping("find")
	public ModelAndView loadFind() {
		return new ModelAndView("Find").addObject("key",dao.getIds());
	}
	
	@RequestMapping("findall")
	public ModelAndView loadFindAll() {
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
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
	
	@PostMapping("findemployee")
	public ModelAndView doFind(@ModelAttribute("bean")Employee e) {
		Employee emp = dao.getEmployee(e);
		if( emp != null)
			return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("bean",emp);
		
		return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("msg","Search Not Found");
	}
	
	@RequestMapping("action")
	public ModelAndView doAction(@RequestParam("empId")Integer id) {
		Employee emp = new Employee();
		emp.setEmpId(id);
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList()).addObject("bean",dao.getEmployee(emp));
	}
	
	@PostMapping("doEdit")
	public ModelAndView doFindAll(@ModelAttribute("bean1")Employee emp) {
		
		if(dao.updateEmployee(emp))
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
		
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
		
	}
	
	@RequestMapping("back")
	public ModelAndView goBack() {
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
	}
	
	@RequestMapping("deletenow")
	public ModelAndView doDeleteNow(@RequestParam("empId")Integer id) {
		Employee emp = new Employee();
		emp.setEmpId(id);
		dao.deleteEmployee(emp);
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
	}
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(@ModelAttribute("bean1")Employee emp) {
		dao.insertEmployee(emp);
		return new ModelAndView("FindAll").addObject("list",dao.getEmployeeList());
	}
}
