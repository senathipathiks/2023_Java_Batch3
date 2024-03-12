package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Library;
import com.spring.dao.LibraryDAO;

@Controller
public class LibraryController {
	@Autowired
	LibraryDAO dao;

	@RequestMapping("Header")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("Header");
		return mv;
	}

	@RequestMapping("links")
	public ModelAndView loadView() {
		ModelAndView mv = new ModelAndView("links");
		return mv;
	}

	@RequestMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@RequestMapping("About")
	public ModelAndView loadAbout() {
		ModelAndView mv = new ModelAndView("About");
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsertBook() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}

	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Library bean) {
		dao.insertBookDetails(bean);
		ModelAndView mv = new ModelAndView("InsertSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("Delete")
	public ModelAndView loadDeleteBook() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean") Library bean) {
		dao.deleteBookDetails(bean);
		ModelAndView mv = new ModelAndView("DeleteSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("Update")
	public ModelAndView loadUpdateBook() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean") Library bean) {
		dao.updateBookDetails(bean);
		ModelAndView mv = new ModelAndView("UpdateSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("Find")
	public ModelAndView loadFindBook() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("Finds")
	public ModelAndView doFind(@ModelAttribute("bean") Library bean) {
		Library bean1 = dao.FindBookDetails(bean);
		ModelAndView mv = new ModelAndView("FindSuccess");
		mv.addObject("bean", bean1);
		return mv;
	}

	@RequestMapping("FindAll")
	public ModelAndView doFindAll() {
		List<Library> list = dao.FindAllBookDetails();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("beanlist", list);
		return mv;
	}
}
