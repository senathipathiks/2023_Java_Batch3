package com.ems.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

//@Controller
public class EMSControllerBackUp {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("Start")
	public ModelAndView startApplication() {
		ModelAndView mv=new ModelAndView("LandingPage");
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView showLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertEmployee")
	public ModelAndView showInsert() {
		ModelAndView mv=new ModelAndView("Insert");
		return mv;
	}
	
	@RequestMapping("insert")
	public ModelAndView showInsertPage() {
		ModelAndView mv=new ModelAndView("Insert");
		return mv;
	}
	
	@RequestMapping("delete")
	public ModelAndView showDeletePage() {
		ModelAndView mv=new ModelAndView("Delete");
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("deletebyname")
	public ModelAndView showDeletebynamePage() {
		ModelAndView mv=new ModelAndView("DeleteByName");
		ArrayList<String> list=dao.getNameList();
		mv.addObject("nameList",list);
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView showUpdatePage() {
		ModelAndView mv=new ModelAndView("Update");
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("find")
	public ModelAndView showFindPage() {
		ModelAndView mv=new ModelAndView("Find");
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("findbyname")
	public ModelAndView showFindByNamePage() {
		ModelAndView mv=new ModelAndView("FindByName");
		ArrayList<String> list=dao.getNameList();
		mv.addObject("nameList",list);
		return mv;
	}
	
	@RequestMapping("Fetch")
	public ModelAndView showfetchedPage(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView("Update");
		try {
			
			Employee emp=dao.findById(eid).get();
			mv.addObject("record",emp);
			
		} catch (Exception e) {
			mv.addObject("Msg","Not found");
		}
		
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsertOperation(Employee employee) {
		ModelAndView mv=new ModelAndView("Insert");
		try {		
			dao.save(employee);
			mv.addObject("Msg","Record inserted");
			
		} catch (Exception e) {
			
			mv.addObject("Msg","Insertion Failed");
		}
		return mv;
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView("Delete");
		try {
			dao.deleteById(eid);
			mv.addObject("Msg","Record deleted");
		} catch (Exception e) {
			mv.addObject("Msg","Deletion Failed");
		}
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
		
	}
	
	@RequestMapping("DeletionByName")
	public ModelAndView doDeleteByName(@RequestParam("ename")String ename) {
		ModelAndView mv=new ModelAndView("DeleteByName");
		try {
			dao.deleteByEname(ename);
			mv.addObject("Msg","Record deleted");
		} catch (Exception e) {
			mv.addObject("Msg","Deletion Failed");
		}
		ArrayList<String> list=dao.getNameList(); 
		mv.addObject("nameList",list);
		return mv;
		
	}
	
	@RequestMapping("findemp")
	public ModelAndView dofindById(@RequestParam("eid")int eid) {
		ModelAndView mv=new ModelAndView("Find");
		try {
			
			Employee emp=dao.findById(eid).get();
			mv.addObject("record",emp);
			
		} catch (Exception e) {
			mv.addObject("Msg","Not found");
		}
		
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
		
	}
	
	@RequestMapping("findempbyName")
	public ModelAndView dofindByName(@RequestParam("ename")String ename) {
		ModelAndView mv=new ModelAndView("FindByName");
		try {
			
			ArrayList<Employee> emp=dao.findByEname(ename);
			mv.addObject("record",emp);
			
			
		} catch (Exception e) {
			mv.addObject("Msg","Not found");
		}
		
		ArrayList<String> list=dao.getNameList();
		mv.addObject("nameList",list);
		return mv;
		
	}
	
	@RequestMapping("updateemployee")
	public ModelAndView doupdate(Employee employee) {
		ModelAndView mv=new ModelAndView("Update");
		try {		
			dao.save(employee);
			mv.addObject("Msg","Record updated Successfully");
			
		} catch (Exception e) {
			mv.addObject("Msg","Updation Failed");
		}
		ArrayList<Integer> list=dao.getIdList();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("findall")
	public ModelAndView showFindAllPage() {
		ModelAndView mv=new ModelAndView("FindAll");
		
		ArrayList<Employee> list=(ArrayList<Employee>) dao.findAll();
		mv.addObject("idList",list);
		return mv;
	}
	
	
	@RequestMapping("EditOrDelete")
	public ModelAndView editOrDelete(@RequestParam("emsBtn") String btn,Employee employee) {
		ModelAndView mv=new ModelAndView("FindAll");
		if (btn.equals("Save/Edit")) {
			dao.save(employee);
		}else if (btn.equals("Delete")) {
			dao.deleteById(employee.getEid());
		}
		ArrayList<Employee> list=(ArrayList<Employee>) dao.findAll();
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("InsertionInFindAll")
	public ModelAndView doInsertInFindAll(Employee employee) {
		ModelAndView mv=new ModelAndView("FindAll");
		try {		
			dao.save(employee);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ArrayList<Employee> list=(ArrayList<Employee>) dao.findAll();
		mv.addObject("idList",list);
		return mv;
	}
	
	
	

}
