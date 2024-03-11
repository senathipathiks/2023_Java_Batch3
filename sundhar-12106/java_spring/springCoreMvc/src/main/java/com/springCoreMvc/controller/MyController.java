package com.springCoreMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springCoreMvc.bean.Student;
import com.springCoreMvc.dao.StudentDAO;
import org.springframework.web.bind.annotation.RequestParam;


;

@Controller
@ComponentScan(basePackages = { "com.springCoreMvc.bean", "com.springCoreMvc.dbutil", "com.springCoreMvc.dao" })
public class MyController {

	@Autowired
	StudentDAO dao;

	@RequestMapping("Banner")
	public ModelAndView loadBanner() {
		ModelAndView mv = new ModelAndView("Banner");

		return mv;
	}

	@RequestMapping("Fetch")
	public ModelAndView loadFetch() {

		ModelAndView mv = new ModelAndView("fetch");
		List<Integer> ls = dao.idlist();
		mv.addObject("idList", ls);
		return mv;
	}

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");

		return mv;
	}
	
	@RequestMapping("View")
	public ModelAndView loadView() {
		ModelAndView mv = new ModelAndView("View");

		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		List<Student> ls = dao.fetchByName("Kirubakaran");
		System.out.println(ls);

		return mv;
	}

	@PostMapping("save")
	public ModelAndView postMethodName(@ModelAttribute("student") Student student) {

		System.out.println(student);
		int n = dao.insert(student);
		ModelAndView mv = new ModelAndView("Insert");
//		mv.addObject("stu",student);
		if (n == 1) {
			mv.addObject("res", "tru");
		} else {
			mv.addObject("res", "fal");
		}
		return mv;
	}

	@GetMapping("Delete")
	public ModelAndView deleteReq(@ModelAttribute("student") Student student) {

		List<Integer> ls = dao.idlist();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("idList", ls);
		return mv;
	}

	@PostMapping("Deletion")
	public ModelAndView deletionReq(@ModelAttribute("student") Student student) {

		System.out.println(student);
		int n = dao.delete(student);
		List<Integer> ls = dao.idlist();
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("idList", ls);
		if (n == 1) {
			mv.addObject("res", "tru");
		} else {
			mv.addObject("res", "fal");
		}

		return mv;

	}

	@GetMapping("fetch")
	public ModelAndView fetchReq(@ModelAttribute("student") Student student) {

		ModelAndView mv = new ModelAndView("fetch");
		Student s = dao.fetStudent(student);
		List<Integer> ls = dao.idlist();
		mv.addObject("idList", ls);
		mv.addObject("stu", s);
		return mv;
	}
	
	@GetMapping("update")
	public ModelAndView updateReq(@ModelAttribute("student") Student student) {
		System.out.println(student+"from update ");
		student = dao.updateStudent(student);
		ModelAndView mv = new ModelAndView("fetch");
		mv.addObject("stu", student);
		List<Integer> ls = dao.idlist();
		mv.addObject("idList", ls);
		return mv;
	}
	
	@GetMapping("findAll")
	public ModelAndView fetchAllReq() {
		
		ModelAndView mv = new ModelAndView("fetch");
		mv.addObject("ls", dao.fetchAll());
		List<Integer> ls = dao.idlist();
		mv.addObject("idList", ls);
		return mv;
	}
	
	

}
