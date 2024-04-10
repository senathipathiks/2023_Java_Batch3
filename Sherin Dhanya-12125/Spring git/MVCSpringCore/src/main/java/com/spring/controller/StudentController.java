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

	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("banner");
		return mv;
	}

	@RequestMapping("Link")
	public ModelAndView loadlink() {
		ModelAndView mv = new ModelAndView("link");
		return mv;
	}

// insert

	@RequestMapping("Insert")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv = new ModelAndView("insert");
		return mv;
	}

	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
		dao.insertStudent(bean);
		ModelAndView mv = new ModelAndView("insertsuccess");
		mv.addObject("bean", bean);
		return mv;
	}

//delete

	@RequestMapping("Delete")
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

//update

	@RequestMapping("Update")
	public ModelAndView loadUpdateStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("idList1", list);
		return mv;
	}

	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Student bean) {
		dao.updateStudent(bean);
		ModelAndView mv = new ModelAndView("updatesuccess");
		mv.addObject("bean", bean);
		return mv;
	}

// find

	@RequestMapping("Find")
	public ModelAndView loadFindStudent() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("idList1", list);
		return mv;
	}

	@RequestMapping("View")
	public ModelAndView doFind(@ModelAttribute("bean") Student bean) {
		Student bean1 = dao.findStudent(bean);

		ModelAndView mv = new ModelAndView("findsuccess");
		mv.addObject("bean", bean1);
		return mv;
	}
// find all

@RequestMapping("FindAll")
	public ModelAndView doFindAll(@ModelAttribute("bean") Student bean) {
	
	ModelAndView mv = new ModelAndView("viewall");
	List<Student>bean1=dao.findAllStudent();
	mv.addObject("beanlist",bean1);
	return mv;
}


}
