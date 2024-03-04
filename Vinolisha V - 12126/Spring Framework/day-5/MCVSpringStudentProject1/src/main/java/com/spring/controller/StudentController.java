package com.spring.controller;

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

	@RequestMapping("links")
	public ModelAndView loadlinks() {
		ModelAndView mv = new ModelAndView("links");
		return mv;

	}

	@RequestMapping("home")
	public ModelAndView loadinsert() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	//insert
	
	@RequestMapping("insert")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv=new ModelAndView("insert");
		return mv;
		
	}

	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
		dao.insertStudent(bean);
		ModelAndView mv = new ModelAndView("insertSuccess");
		mv.addObject("bean", bean);
		return mv;

	}

//		
	@RequestMapping("delete")
	public ModelAndView loadDeleteStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idList", list);
		return mv;

	}

	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Student bean) {

		dao.deleteStudent(bean);
		ModelAndView mv = new ModelAndView("deletesuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("update")
	public ModelAndView loadupdateStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("idList", list);
		return mv;

	}

	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student bean) {
		dao.updateStudent1(bean);
		ModelAndView mv = new ModelAndView("updatesuccess");
		mv.addObject("bean", bean);
		return mv;

	}

	// find
	@RequestMapping("search")
	public ModelAndView loadviewStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("search");
		mv.addObject("idList", list);
		return mv;

	}

	@RequestMapping("View")
	public ModelAndView doview(@ModelAttribute("bean") Student bean) {
		Student bean1 = dao.findStudent(bean);
		ModelAndView mv = new ModelAndView("viewsuccess");
		mv.addObject("bean", bean1);
		return mv;

	}
	
	// find All
		@RequestMapping("searchall")
		public ModelAndView loadviewallStudent() {
			List<Student> list = dao.findallStudent();
			ModelAndView mv = new ModelAndView("viewallsuccess");
			mv.addObject("idList", list);
			return mv;

		}

}
