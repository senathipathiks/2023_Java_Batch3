package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.StudentDAO;
import com.spring.bean.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDAO dao;

	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
	}

	@RequestMapping("Link1")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Link1");
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean")Student bean) {
		int n=dao.insert(bean);
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("action" ,"Insertion");
		mv.addObject("bean",bean);
		return mv; 
		
	}

	@RequestMapping("Delete")
	public ModelAndView loadDeleteStudent() {
		
		List<Integer> list=dao.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("idList",list);
		return mv;
	}
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Student bean) {
		dao.delete(bean);
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("action" ,"Delete");		
		return mv; 
		
	}


	@RequestMapping("Update")
	public ModelAndView loadUpdateStudent() {
		List<Integer> list=dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("idList",list);
		return mv;
	}
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Student bean) {
		dao.update(bean);
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("action" ,"Update");		
		return mv; 
		
	}
	
	

	@RequestMapping("Search")
	public ModelAndView loadSearchStudent() {
		List<Integer> list=dao.idList();
		ModelAndView mv = new ModelAndView("Search");
		mv.addObject("idList",list);
		return mv;
	}
	
	@RequestMapping("Searchh")
	public ModelAndView doSearch(@ModelAttribute("bean")Student bean) {
		Student stud=dao.search(bean);
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("bean" ,stud);	
		mv.addObject("action","Search");
		System.out.println(bean);
		return mv; 
		
	}
}
