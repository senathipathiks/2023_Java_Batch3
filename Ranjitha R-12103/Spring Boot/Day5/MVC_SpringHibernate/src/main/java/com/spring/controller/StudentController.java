package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;
import com.spring.dao.StudentDAO;



@Controller
public class StudentController {
	@Autowired
	StudentDAO dao;

	@RequestMapping("Header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("Header");
		return mv;
	}

	@RequestMapping("Home")
	public ModelAndView loadhome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@RequestMapping("links")
	public ModelAndView loadlinks() {
		ModelAndView mv = new ModelAndView("links");
		return mv;
	}
	@RequestMapping("About")
	public ModelAndView loadAbout() {
		ModelAndView mv = new ModelAndView("About");
		return mv;
	}
	@RequestMapping("Insert")
	public ModelAndView loadinsert() {
		return new ModelAndView("Insert");

	}

	@PostMapping("InsertionStud")
	public ModelAndView doInsert(@ModelAttribute("bean") Student stud) {
		int n = dao.insertStudent(stud);

		if (n == 1)
			return new ModelAndView("Insert").addObject("msg", "Record Inserted Successfullly");
		return new ModelAndView("Insert").addObject("msg", "Record Inserted Failure");
	}

	@RequestMapping("Delete")
	public ModelAndView loaddelete() {
		return new ModelAndView("Delete").addObject("key", dao.getIds());
	}

	@PostMapping("DeletionStud")
	public ModelAndView doDelete(@ModelAttribute("bean") Student stud) {
		if (dao.deleteStudent(stud))
			return new ModelAndView("Delete").addObject("key", dao.getIds()).addObject("msg","Record Deleted Successfully");
		return new ModelAndView("Delete").addObject("key", dao.getIds()).addObject("msg", "Record Deleted Failure");
	}

	@RequestMapping("Update")
	public ModelAndView loadupdate() {
		return new ModelAndView("Update").addObject("key", dao.getIds());
	}
	@PostMapping("Fetch")
	public ModelAndView doFetch(@ModelAttribute("bean") Student stud) {
		return new ModelAndView("Update").addObject("key",dao.getIds()).addObject("stud",dao.getStudent(stud));
	}
	
	@PostMapping("UpdationStud")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student stud) {
		if (dao.updateStudent(stud))
			return new ModelAndView("Update").addObject("key", dao.getIds()).addObject("msg","Record Updated Successfully");
		return new ModelAndView("Update").addObject("key", dao.getIds()).addObject("msg", "Record Updated Failure");
	}
	@RequestMapping("Find")
	public ModelAndView loadfind() {
		return new ModelAndView("Find").addObject("key", dao.getIds());
	}
	
	@PostMapping("FindStud")
	public ModelAndView doFind(@ModelAttribute("bean") Student s) {
		Student stud=dao.getStudent(s);
		if(stud!=null)
			return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("bean",stud);
		return new ModelAndView("Find").addObject("key",dao.getIds()).addObject("msg","Record not found");
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
	
	
	@RequestMapping("doEdit")
	public ModelAndView doFindAll(@ModelAttribute("bean") Student stud) {
		dao.updateStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
		
	}
	
	@RequestMapping("deletenow")
	public ModelAndView doDeleteNow(@RequestParam("bean") Integer id) {
		Student stud=new Student();
		stud.setSid(id);
		dao.deleteStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(@ModelAttribute("bean") Student stud) {
		dao.insertStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
	}
	

