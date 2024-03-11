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
	public  ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv=new ModelAndView("Insert");
	return mv;
	}
	
	@RequestMapping("delete")
	public ModelAndView loaddelete() {
		return new ModelAndView("delete").addObject("IdList", dao.getIds());
	}
	
	@RequestMapping("update")
	public ModelAndView loadupdate() {
		return new ModelAndView("update").addObject("IdList", dao.getIds());
	}
	
	@RequestMapping("EditFind")
	public ModelAndView loadEditFind(@ModelAttribute("bean") Employee bean) {
		System.out.println("bean");
		System.out.println(bean);
		dao.updateEmployee(bean);
	}
	@RequestMapping("remove")
		public ModelAndView loadremove(@ModelAttribute("bean") Employee bean) {
			System.out.println("bean");
			System.out.println(bean);
			dao.updateEmployee(bean);
		
		
		
		
	 return new ModelAndView("findall").addObject("IdList", dao.getEmployeeList());
	}
	
	@RequestMapping("find")
	public ModelAndView loadfind() {
		return new ModelAndView("find").addObject("list", dao.getIds());
	}
	
	@RequestMapping("findall")
	public ModelAndView loadfindall() {
		return new ModelAndView("findall").addObject("IdList", dao.getEmployeeList());
	}

	@PostMapping("InsertEmployee")
	public ModelAndView doInsert(@ModelAttribute("bean")Employee emp) {
		int n=dao.InsertEmployee(emp);
		
		if(n==1) {
			return new ModelAndView("Insert").addObject("msg", "Record Inserted Successfully");
		}else
			return new ModelAndView("Insert").addObject("msg", "Insertion Failure");
	}
	
	@PostMapping("deleteEmployee")
	public ModelAndView dodelete(@ModelAttribute("bean")Employee emp) {
		if(dao.deleteEmployee(emp))  
			return new ModelAndView("delete").addObject("IdList", dao.getIds()).addObject("msg","Record Deleted Successfully");
			return new ModelAndView("delete").addObject("IdList", dao.getIds()).addObject("msg","Record Deleted Successfully");
	}
	
	@PostMapping("Fetch")
	public ModelAndView doFetch(@ModelAttribute("bean")Employee emp) {
		return new ModelAndView("update").addObject("IdList",dao.getIds()).addObject("bean", dao.getEmployee(emp));
	}
    
	@PostMapping("updateemployee")
	public ModelAndView doUpdate(@ModelAttribute("bean")Employee emp) {
		if(dao.updateEmployee(emp))
			return new ModelAndView("update").addObject("IdList",dao.getIds()).addObject("msg","Record updated successfully");
		
		    return  new ModelAndView("update").addObject("IdList",dao.getIds()).addObject("msg","Record updated failed");
	}
	
	@PostMapping("findemployee")
	public ModelAndView dofind(@ModelAttribute("bean")Employee e) {
		Employee emp=dao.getEmployee(e);
		
		if(emp!=null)
			
			return new ModelAndView("find").addObject("key",dao.getIds()).addObject("bean",emp);
		
		return new ModelAndView("find").addObject("key",dao.getIds()).addObject("msg","Search Not found");
		
	}
}