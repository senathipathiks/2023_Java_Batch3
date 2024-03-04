package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.bean.Student;
import com.mvc.dao.StudentDAO;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("NavLink")
	public ModelAndView loadnav() {
		ModelAndView mv=new ModelAndView("NavLink");
		return mv;
	}
	
	@RequestMapping("Home")
	public ModelAndView loadhome() {
		ModelAndView mv=new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("Add")
	public ModelAndView loadadd() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Add");
		return mv;
	}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
		
		dao.insertStudent(bean);
		ModelAndView mv=new ModelAndView("addsuccess");
		mv.addObject("bean",bean);
		return mv;
		
	}
	
	@RequestMapping("Delete")
	public ModelAndView loaddelete() {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("Delete");
		mv.addObject("listId",list);
		
		return mv;
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Student bean) {
		
		dao.deleteStud(bean);
		ModelAndView mv=new ModelAndView("deletesuccess");
//		mv.addObject("bean",bean);
		
		return mv;		
	}
	
	@RequestMapping("Update")
	public ModelAndView loadupdate() {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("Update");
		mv.addObject("listId",list);
		return mv;
		
	}
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Student bean) {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("updatesuccess");
		dao.updateStud(bean);
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("Search")
	public ModelAndView  loadSearch(@ModelAttribute("bean")Student bean) {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("Search");
		mv.addObject("listId",list);
		return mv;
	}
	
	@RequestMapping("Searches")
	public ModelAndView doSearch(@ModelAttribute("bean")Student bean) {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("searchsuccess");
		Student s=dao.searchStud(bean);
		mv.addObject("bean",s);
		return mv;
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadsearchall(@ModelAttribute("bean")Student bean) {
		ModelAndView mv=new ModelAndView("FindAll");
		List<Student> stud=dao.FindAll();
		mv.addObject("beanlist",stud);
		return mv;
	}
	
}
