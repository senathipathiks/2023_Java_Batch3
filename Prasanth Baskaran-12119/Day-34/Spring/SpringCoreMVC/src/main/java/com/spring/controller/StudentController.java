package com.spring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

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
	
	@RequestMapping("nav")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("nav");
		
		
		return mv;
	}
	
	@RequestMapping("Home")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Home");
		
		
		return mv;
	}
	
	@RequestMapping("insert")
	public ModelAndView loadInsertStudents() {
		ModelAndView mv = new ModelAndView("insert");
		
		
		return mv;
	}
	
	@RequestMapping("delete")
	public ModelAndView loadDeleteStudents() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idList",list);
		
		
		
		return mv;
	}
	
	@RequestMapping("Edit")
	public ModelAndView loadEditStudents() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Edit");
		mv.addObject("idList",list);
		
		return mv;
	}
	
	@RequestMapping("search")
	public ModelAndView loadSearchStudents() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("search");
		mv.addObject("idList",list);
		
		return mv;
	}
	
//	@RequestMapping("list")
//	public ModelAndView loadListStudents() {
//		ModelAndView mv = new ModelAndView("list");
//		
//		
//		return mv;
//	}
	
	@RequestMapping("listAll")
	public ModelAndView loadListAllStudents() {
		
		List<Integer> list = dao.ListAll();
		ModelAndView mv = new ModelAndView("listall");
		mv.addObject("idList",list);
		
		return mv;
	}
	
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean) throws SecurityException, SQLException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		dao.insertUser(bean);
		
		ModelAndView mv = new ModelAndView("Succesful");
		
		mv.addObject("b","insert");
		
		return mv;
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Student bean) throws SQLException {
		
		  dao.deleteUser(bean);
		  ModelAndView mv = new ModelAndView("Succesful");
		  mv.addObject("b","delete");
		  
		  return mv;
		  
	}
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student bean) throws SQLException {
		
		  dao.editUser(bean);
		  ModelAndView mv = new ModelAndView("Succesful");
		  mv.addObject("b","update");
		  
		  return mv;
		  
	}
	
	@RequestMapping("list")
	public ModelAndView doSearch(@ModelAttribute("bean") Student bean) throws SQLException {
		
		   Student stu = dao.searchUser(bean);
		  ModelAndView mv = new ModelAndView("list");
		  mv.addObject("b",stu);
		  
		  return mv;
		  
	}
	
	

}
