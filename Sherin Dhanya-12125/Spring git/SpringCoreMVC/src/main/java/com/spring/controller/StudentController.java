package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;
import com.spring.dao.StudentDAO;

@Controller
public class StudentController {
@Autowired
StudentDAO dao;

@RequestMapping("banner")
public ModelAndView loadbanner() {
	ModelAndView mv =new ModelAndView("banner");
	return mv;
}

@RequestMapping("link")
public ModelAndView loadlink() {
	ModelAndView mv =new ModelAndView("link");
	return mv;
}

@RequestMapping("Insert")
public ModelAndView loadInsertStudent() {
	ModelAndView mv =new ModelAndView("insert");
	return mv;
}
@RequestMapping("Insertion")
public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
	dao.insertStudent(bean);
	ModelAndView mv = new ModelAndView("insertsuccess");
	mv.addObject("bean",bean);
	return mv;
}

@RequestMapping("Delete")
public ModelAndView loadDeleteStudent() {
	List<Integer> list = dao.idList();
	ModelAndView mv =new ModelAndView("delete");
	mv.addObject("idList",list);
	return mv;
}
@RequestMapping("Deletion")
public ModelAndView doDelete(@ModelAttribute("bean") Student bean) {
	dao.insertStudent(bean);
	ModelAndView mv = new ModelAndView("deletesuccess");
	mv.addObject("bean",bean);
	return mv;
}
}
