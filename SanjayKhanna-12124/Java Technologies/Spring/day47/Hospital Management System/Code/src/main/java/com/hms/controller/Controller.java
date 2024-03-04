package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hms.bean.Password;
import com.hms.bean.Patient;
import com.hms.dao.PatientDAO;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	PatientDAO dao;
	
	@RequestMapping("HeadingPage")
	public ModelAndView loadHeading() {
		return new ModelAndView("HeadingPage");
	}
	
	@RequestMapping("/home")
	public ModelAndView loadHome() {
		return new ModelAndView("Home").addObject("list",dao.viewAll());
	}
	@RequestMapping("/insert")
	public ModelAndView loadInsert() {
		return new ModelAndView("Insert");
	}
	
	@RequestMapping("/delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("Delete").addObject("keys",dao.getKeys());
	}
	
	@RequestMapping("/update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("Update").addObject("keys",dao.getKeys());
	}
	
	@RequestMapping("/search")
	public ModelAndView loadSearch() {
		return new ModelAndView("Search").addObject("keys",dao.getKeys());
	}
	
	@RequestMapping("/deleteAll")
	public ModelAndView loadDeleteAll() {
		return new ModelAndView("DeleteAll");
	}
	
	@RequestMapping(value="Insert", method=RequestMethod.POST)
	public ModelAndView doInsert(@ModelAttribute("bean1")Patient p) {
		boolean flag = dao.insertPatient(p);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Insert").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Insert");
	}
	
	@RequestMapping(value="Update", method=RequestMethod.POST)
	public ModelAndView doUpdate(@ModelAttribute("bean2")Patient p) {
		boolean flag = dao.updatePatient(p);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Update").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Update");
	}
	
	
	@RequestMapping(value="Delete", method=RequestMethod.POST)
	public ModelAndView doDelete(@ModelAttribute("deleteId")Patient id) {
		boolean flag = dao.deletePatient(id);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Delete").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Delete");
	}
	
	
	@RequestMapping(value="Search", method=RequestMethod.POST)
	public ModelAndView doSearch(@ModelAttribute("searchId")Patient id) {
		Patient p = dao.searchPatient(id);
		if(p != null) {
			return new ModelAndView("Success").addObject("action","Search").addObject("record",p).addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Search");
	}
	
	
	@RequestMapping(value="DeleteAll", method=RequestMethod.POST) 
	public ModelAndView doDeleteAll(@ModelAttribute("pass")Password password) {
		
		System.out.println(password);
		boolean flag = dao.deleteAll(password);
		if(flag) {
			return new ModelAndView("Success").addObject("action","DeleteAll");
		}
		
		return new ModelAndView("Failure").addObject("action", "DeleteAll");
	}
	
}
