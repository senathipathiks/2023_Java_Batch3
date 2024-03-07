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
	
	@RequestMapping("home")
	public ModelAndView loadhome() {
	ModelAndView mv=new ModelAndView("home"); 
	return mv;
}
	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		ModelAndView mv=new ModelAndView("banner");
		return mv;
	}
	@RequestMapping("Links")
	public ModelAndView loadView() {
		ModelAndView mv=new ModelAndView("links");
		return mv;
	} 
	//INSERT
	@RequestMapping("Insert")
	public ModelAndView loadInsertStudent() {
	ModelAndView mv=new ModelAndView("insert"); 
	return mv;
}	
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean")Student bean) {
		dao.insertStudent(bean);
		ModelAndView mv=new ModelAndView("insertsuccess");
		mv.addObject("bean",bean);
		return mv;
	}
//===========================================DELETE
	@RequestMapping("Delete")
	public ModelAndView loadDeleteStudent() {
		List<Integer>  list = dao.idList();
		ModelAndView mv=new ModelAndView("delete");
		mv.addObject("idList", list);
		return mv;
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Student bean) {
		dao.deleteStudent(bean);
		ModelAndView mv=new ModelAndView("deletesuccess");
		mv.addObject("bean", bean);
		return mv;
	}
//==========================================================UPDATE
	@RequestMapping("Update")
	public ModelAndView loadUpdateStudent() {
		List<Integer>  list = dao.idList();
		ModelAndView mv=new ModelAndView("update");
		mv.addObject("idList", list);
		return mv;
	}
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Student bean) {
		dao.updateStudent(bean);
		ModelAndView mv=new ModelAndView("updatesuccess");
		mv.addObject("bean", bean);
		return mv;
	}
//====================================View
	@RequestMapping("View")
	public ModelAndView loadFindStudent() {
		List<Integer>  list = dao.idList();
		ModelAndView mv=new ModelAndView("find");
		mv.addObject("idList", list);
		return mv;
	}
//==================================FInd
	@RequestMapping("Find")
	public ModelAndView doFind(@ModelAttribute("bean")Student bean) {
		Student bean1=dao.findStudent(bean);
		ModelAndView mv=new ModelAndView("findsuccess");
		mv.addObject("bean", bean1);
		return mv;
	}
//===============================FindAll
	@RequestMapping("FindAll")
	public ModelAndView doFindAll() {
		List<Student> list=dao.findallStudent();
		ModelAndView mv=new ModelAndView("findall");
		mv.addObject("beanlist", list);
		return mv;
		}
//=========================================
}
