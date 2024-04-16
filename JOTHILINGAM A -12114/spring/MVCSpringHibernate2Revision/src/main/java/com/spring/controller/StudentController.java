package com.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.spring.DAO.StudentDAO;
import com.spring.bean.Student;

@Controller
public class StudentController {

	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("banner")
	public ModelAndView loadbanner()
	{
		ModelAndView mv = new ModelAndView("banner");
		return mv;
	}
	
	@RequestMapping("Link1")
	public ModelAndView loadLinks()
	{
		ModelAndView mv = new ModelAndView("Link1");
		return mv;
	}
	
	@RequestMapping("insert")
	public ModelAndView loadInsertStudent()
	{
		ModelAndView mv = new ModelAndView("insert");
		return mv;
	}
	
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean)
	
	{
		dao.insertStudent(bean);
		ModelAndView mv = new ModelAndView("insertsuccess");
		mv.addObject("bean", bean);
		return mv;
		
		
	}
	
	@RequestMapping("delete")
	public ModelAndView loadDeleteStudent()
	{
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idlist",list);
		return mv;
	}

	
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Student bean)
	{
	List<Integer> list = dao.idList();
	dao.deleteStudent(bean);
	ModelAndView mv = new ModelAndView("deletesuccess");
	mv.addObject("idlist",list);
	//mv.addObject("bean",bean);
	return mv;
	
	
	}
	
	
	@RequestMapping("update")
	public ModelAndView loadUpdateStudent()
	{
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("idlist",list);
		return mv;
	}

	@RequestMapping("fetch")
	public ModelAndView loadFetch(@ModelAttribute("bean")Student emp1){
		
		String id = emp1.getId();
		Student emp = dao.fetchMethod(id);
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("emp",emp);
		
		return mv;
		
	}
	
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Student bean)
	{
	
	dao.updateStudent(bean);
	List<Integer> list = dao.idList();
	ModelAndView mv = new ModelAndView("updatesuccess");
	//mv.addObject("bean",bean);
	mv.addObject("idlist",list);
	return mv;
	}
	
	
	@RequestMapping("view")
	public ModelAndView loadViewStudent()
	{
		List<Integer> list = dao.idList();
		System.out.println(list);
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("idlist",list);
		return mv;
	}
	
	
	@RequestMapping("Search")
	public ModelAndView doFind(@ModelAttribute("bean")Student bean)
	{
		
	
	   Student stu = dao.viewStudent(bean);
	ModelAndView mv = new ModelAndView("search");
	mv.addObject("bean", stu);
	return mv;
	}
	
	@RequestMapping("SearchAll")
	public ModelAndView doFindAll(@ModelAttribute("bean")Student bean)
	{
		
	
	   List<Student> list= dao.findallStudent();
	ModelAndView mv = new ModelAndView("listall");
	mv.addObject("list", list);
	return mv;
	}
	
	
	@RequestMapping("viewall")
	public ModelAndView loadFindAll() {
		
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
	
		mv.addObject("msg","viewall");
		return mv;
	}
	
	@RequestMapping("Edit")
	public ModelAndView loadedit(@ModelAttribute("rdata")Student emp) {
		
		String id = emp.getId();
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("id",id);
		mv.addObject("msg","Edit");
		return mv;
	}
	
	@RequestMapping("Save")
	public ModelAndView doEdit(@ModelAttribute("data")Student emp) {
		
		dao.updateStudent(emp);;
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("msg","viewall");
		return mv;
	}
	
	@RequestMapping("Remove")
	public ModelAndView doRemove(@ModelAttribute("rdata")Student emp) {
		
		dao.deleteStudent(emp);;
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("list",list);
		mv.addObject("msg","viewall");
		return mv;
	}
	
	@RequestMapping("NewElem")
	public ModelAndView loadNew() {
		
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("msg","New");
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping("New")
	public ModelAndView doNew(@ModelAttribute("bean")Student emp) {
		
		dao.insertStudent(emp);
		List<Student> list = dao.findallStudent();
		ModelAndView mv = new ModelAndView("viewall");
		mv.addObject("msg","viewall");
		mv.addObject("list",list);
		return mv;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
