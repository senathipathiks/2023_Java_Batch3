package com.ems.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@Controller
public class EMSController {

	@Autowired
	EmployeeDAO dao;

	@RequestMapping("/start")
	public ModelAndView startApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	
	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Banner");
		return mv;
	}


	@RequestMapping("Links")
	public ModelAndView loadLink() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("links");
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");

		return mv;
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFind() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);

		return mv;
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		 ArrayList<Employee> empList= (ArrayList<Employee>) dao.findAll();
		 mv.addObject("empList", empList);
		return mv;
	}
	
	
	  @RequestMapping("Update") 
	  public ModelAndView loadUpadte() {
	  ModelAndView mv = new ModelAndView(); mv.setViewName("Update"); List<Integer>
	  idList = dao.getIdList(); mv.addObject("idList", idList);
	  
	  return mv; }
	 
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	
	@RequestMapping("DeleteName")
	public ModelAndView loadDeleteName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteByName");
		List<String> nameList=dao.getNameList();		
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	@RequestMapping("FindByName")
	public ModelAndView loadFindByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findByName");
		List<String> nameList=dao.getNameList();		
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	
	@RequestMapping("FetchEmployee")
	public ModelAndView fetchEmployee(@RequestParam("eid")int eid) {
		ModelAndView mv = new ModelAndView("Update");
		
		try {
			Employee empList = dao.findById(eid).get();
			mv.addObject("empList", empList);
 
		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Not Found");
 
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	
	
		
	
	// Crud Operations
	// Insert Page Operation
	@RequestMapping("InsertEmployee")
	public ModelAndView doInsert(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Insert");
		try {
			dao.save(emp);
			mv.addObject("msg", "Employee Object Inserted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Inserted!!!!!");
		}
		return mv;
	}

	@RequestMapping("DeleteEmployee")
		public ModelAndView doDelete(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Delete");
		try {
			dao.deleteById(eid);			
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Object Not Deleted!!!!!");
		}
		List<Integer> idList = dao.getIdList();
		System.out.println(idList);
		mv.addObject("idList", idList);
		return mv;
	}
	
	@RequestMapping("DeleteEmployeeByName")	
		public ModelAndView doDeleteName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteByName");
		
		try {				
			dao.deleteByEname(ename);
			mv.addObject("msg", "Employee Object Deleted");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", "Employee Object Not Deleted!!!!!");
		}
		List<String> nameList=dao.getNameList();	
		mv.addObject("nameList",nameList);
		
		return mv;
	}
	
	
	
	
	
	@RequestMapping("FindEmployee")
	public ModelAndView doFind(@RequestParam("eid") int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Find");
		try {
		
			Employee emp= dao.findById(eid).get();
			if(emp==null) {
				mv.addObject("msg", "Employee is Not Found");
			}
			else {
				mv.addObject("emp", emp);
			}				 
			
		} catch (Exception e) {
			
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	
	
	@RequestMapping("FindEmployeeByName")
	public ModelAndView doFindByName(@RequestParam("ename") String ename) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("findByName");
		
		try {			 			 
			List<Employee> emp= dao.findByEname(ename);
			if(emp==null) {
				mv.addObject("msg", "Employee is Not Found");
			}
			else {
				 System.out.println(emp);
				mv.addObject("emp", emp);
			}				 
			
		} catch (Exception e) {
			
		}
		List<String> nameList=dao.getNameList();	
		mv.addObject("nameList",nameList);
		return mv;
	}
	
	
	
	@RequestMapping("UpdateEmployee")
	public ModelAndView doUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Update");
		try {
			dao.save(emp);
			mv.addObject("msg", "Employee Details Updated");
		} catch (Exception e) {
			mv.addObject("msg", "Employee Details Updated!!!!");
		}
		List<Integer> idList = dao.getIdList();
		mv.addObject("idList", idList);
		return mv;
	}
	
	
	@RequestMapping("FindAllOrEditOrUpdate")
	public ModelAndView doFindAllOperations(@RequestParam("btn")String btn ,Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		if(btn.equals("Edit/Save")) {
			dao.save(emp);	
		}
		else if(btn.equals("Remove")) {
			dao.deleteById(emp.getEid());
		}	
		ArrayList<Employee> empList= (ArrayList<Employee>) dao.findAll();
		mv.addObject("empList", empList);
		return mv;
	}
	@RequestMapping("New")
	public ModelAndView doAddNew(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAll");
		dao.save(emp);
		 ArrayList<Employee> empList= (ArrayList<Employee>) dao.findAll();
		 mv.addObject("empList", empList);
		return mv;
	}
	
	
	}
