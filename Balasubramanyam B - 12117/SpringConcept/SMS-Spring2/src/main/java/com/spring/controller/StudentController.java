package com.spring.controller;


import java.util.List;
import com.spring.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;

@Controller
public class StudentController {
@Autowired
StudentDAO dao;

@RequestMapping("Banner")
public ModelAndView loadbanner() {
	ModelAndView mv =new ModelAndView("Banner");
	return mv;
}

@RequestMapping("Link")
public ModelAndView loadlink() {
	ModelAndView mv =new ModelAndView("Link");
	return mv;
}

@RequestMapping("Insert")
public ModelAndView loadInsertStudent() {
	ModelAndView mv =new ModelAndView("Insert");
	return mv;
}
@RequestMapping("Insertion")
public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
	dao.insertStudent(bean);
	ModelAndView mv = new ModelAndView("Success");
	mv.addObject("res","Insert");
	mv.addObject("bean",bean);
	return mv;
}
 
@RequestMapping("Delete")
public ModelAndView loadDeleteStudent() {
	List<Integer> list = dao.idList();
	ModelAndView mv =new ModelAndView("Delete");
	mv.addObject("idList",list);
	return mv;
}
@RequestMapping("Deletion")
public ModelAndView doDelete(@ModelAttribute("bean") Student bean) {
	dao.deleteStudent(bean);
	ModelAndView mv = new ModelAndView("Success");
	mv.addObject("res","Delete");
	mv.addObject("bean",bean);
	return mv;
}
@RequestMapping("Update")
public ModelAndView loadUpdateStudent() {
	List<Integer> list = dao.idList();
	ModelAndView mv =new ModelAndView("Update");
	mv.addObject("idList",list);
	return mv;
}
@RequestMapping("Updation")
public ModelAndView doUpdate(@ModelAttribute("bean") Student bean) {
	dao.updateStudent(bean);
	ModelAndView mv = new ModelAndView("Success");
	mv.addObject("res","Update");
	mv.addObject("bean",bean);
	return mv;
}
@RequestMapping("Search")
public ModelAndView loadFindStudent() {
	List<Integer> list = dao.idList();
	ModelAndView mv =new ModelAndView("Search");
	mv.addObject("idList1",list);
	return mv;
}
@RequestMapping("Find")
public ModelAndView doFind(@ModelAttribute("bean")Student bean) {
	Student bean1 = dao.findStudent(bean);
	ModelAndView mv = new ModelAndView("Success");
	mv.addObject("res","Find");
	mv.addObject("bean",bean1);
	return mv;
}
@RequestMapping("SearchAll")
public ModelAndView doFindAll() {
	List<Student> list = dao.findallStudent();
	ModelAndView mv = new ModelAndView("Success");
	mv.addObject("res","FindAll");
	mv.addObject("beanlist",list);
	return mv;
}
}
