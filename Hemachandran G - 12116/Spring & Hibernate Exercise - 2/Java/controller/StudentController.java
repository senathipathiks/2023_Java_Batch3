package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("Link")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Link");
		return mv;
		
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
		
		dao.insert(bean);
		ModelAndView mv = new ModelAndView("InsertSuccess");
		mv.addObject("bean",bean);
		return mv;
		
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDeleteStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("idList",list);
		return mv;
		
	}
	
	@RequestMapping("Deletion")
	public  ModelAndView doDelete(@ModelAttribute("bean") Student bean) {
		
		dao.deleteStudent(bean);
		ModelAndView mv = new ModelAndView("DeleteSuccess");
		mv.addObject("bean1",bean);
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdateStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		
		return mv;
		
	}
	
	@RequestMapping("Updation")
	public  ModelAndView doUpdate(@ModelAttribute("bean") Student bean) {
		
		dao.UpdateStudent(bean);
		ModelAndView mv = new ModelAndView("UpdateSuccess");
		mv.addObject("action","Update");
		return mv;
	}
	
	
	
	
//	@RequestMapping("find")
//	public ModelAndView loadfind() {
//		ModelAndView mv = new ModelAndView("Find");
//		return mv;
//	}

}
