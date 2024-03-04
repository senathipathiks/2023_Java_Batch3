package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bms.bean.Bike;
import com.bms.bean.Password;
import com.bms.dao.BikeDAO;

@Controller
public class BikeController {
	
	@Autowired
	BikeDAO dao;
	
	@GetMapping("HeadingPage")
	public ModelAndView loadHeading() {
		return new ModelAndView("HeadingPage");
	}
	
	@GetMapping("/home")
	public ModelAndView loadHome() {
		return new ModelAndView("Home").addObject("list",dao.viewAll());
	}
	@GetMapping("/insert")
	public ModelAndView loadInsert() {
		return new ModelAndView("Insert");
	}
	
	@GetMapping("/delete")
	public ModelAndView loadDelete() {
		return new ModelAndView("Delete").addObject("keys",dao.getKeys());
	}
	
	@GetMapping("/update")
	public ModelAndView loadUpdate() {
		return new ModelAndView("Update").addObject("keys",dao.getKeys());
	}
	
	@GetMapping("/search")
	public ModelAndView loadSearch() {
		return new ModelAndView("Search").addObject("keys",dao.getKeys());
	}
	
	@GetMapping("/deleteAll")
	public ModelAndView loadDeleteAll() {
		return new ModelAndView("DeleteAll");
	}
	
	@PostMapping("Insert")
	public ModelAndView doInsert(@ModelAttribute("bean")Bike p) {
		boolean flag = dao.insertPatient(p);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Insert").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Insert");
	}
	
	@PostMapping("Update")
	public ModelAndView doUpdate(@ModelAttribute("bean")Bike p) {
		boolean flag = dao.updatePatient(p);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Update").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Update");
	}
	
	
	@PostMapping("Delete")
	public ModelAndView doDelete(@ModelAttribute("bean")Bike id) {
		boolean flag = dao.deletePatient(id);
		if(flag) {
			return new ModelAndView("Success").addObject("action","Delete").addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Delete");
	}
	
	
	@PostMapping("Search")
	public ModelAndView doSearch(@ModelAttribute("bean")Bike id) {
		Bike p = dao.searchPatient(id);
		if(p != null) {
			return new ModelAndView("Success").addObject("action","Search").addObject("record",p).addObject("keys",dao.getKeys());
		}
		
		return new ModelAndView("Failure").addObject("action", "Search");
	}
	
	
	@PostMapping("DeleteAll")
	public ModelAndView doDeleteAll(@ModelAttribute("pass")Password password) {
		
		System.out.println(password);
		boolean flag = dao.deleteAll(password);
		if(flag) {
			return new ModelAndView("Success").addObject("action","DeleteAll");
		}
		
		return new ModelAndView("Failure").addObject("action", "DeleteAll");
	}

}
