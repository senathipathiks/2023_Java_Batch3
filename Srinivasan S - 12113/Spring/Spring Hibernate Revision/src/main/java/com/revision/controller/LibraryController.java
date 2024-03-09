package com.revision.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.revision.dao.LibraryDAO;
import com.revision.bean.*;

@Controller
public class LibraryController {
	int n=0;
	
	@Autowired
	LibraryDAO dao;
	
	@RequestMapping("NavLink")
	public ModelAndView loadnav() {
		ModelAndView mv=new ModelAndView("NavLink");
		return mv;
	}
	
	@RequestMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv=new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("Add")
	public ModelAndView loadAdd() {
		ModelAndView mv=new ModelAndView("Add");
		return mv;
	}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean") Library bean) {
		
		dao.insertLib(bean);
		
		System.out.println(n);
		
		ModelAndView mv=new ModelAndView("addsuccess");
		mv.addObject("bean",bean);
		return mv;
		
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDelete(@ModelAttribute("bean") Library bean) {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("Delete");
		mv.addObject("listId",list);
		
		return mv;
		
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Library bean) {
	
	dao.deleteLib(bean);
	
	ModelAndView mv=new ModelAndView("deletesuccess");
	mv.addObject("bean",bean);
	return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadupdate() {
		List<Integer>list=dao.listId();
		ModelAndView mv=new ModelAndView("Update");
		mv.addObject("Idlist",list);
		return mv;
		
	}
	@RequestMapping("Fetch")
	public ModelAndView doFetch(@ModelAttribute("bean") Library bean) {
		ModelAndView mv=new ModelAndView("Update");
		
		List<Integer>list=dao.listId();
		bean = dao.getLib(bean);
		mv.addObject("bean",bean);
		mv.addObject("Idlist",list);
		return mv;
	}
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Library bean) {
		ModelAndView mv=new ModelAndView("updatesuccess");
		bean=dao.updateLib(bean);
		mv.addObject("bean",bean);
		return mv;
		
	}
	
	@RequestMapping("Search")
	public ModelAndView loadSearch(@ModelAttribute("bean") Library bean) {
		ModelAndView mv=new ModelAndView("Search");
		
		List<Integer>list=dao.listId();
		bean = dao.getLib(bean);
		mv.addObject("bean",bean);
		mv.addObject("Idlist",list);
		return mv;
	}	
	
	@RequestMapping("Searches")
	public ModelAndView doSearch(@ModelAttribute("bean")Library bean) {
		ModelAndView mv=new ModelAndView("searchsuccess");
		
		List<Integer>list=dao.listId();
		bean = dao.getLib(bean);
		mv.addObject("bean",bean);
		mv.addObject("Idlist",list);
		return mv;
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadsearchall(@ModelAttribute("bean")Library bean) {
		ModelAndView mv=new ModelAndView("FindAll");
		List<Library> lib=dao.findallLib();
		
		mv.addObject("Idlist",lib);
		return mv;
	}
	
	
	@RequestMapping("EditForm")
	public ModelAndView doEdit(@ModelAttribute("bean")Library bean) {
		
	   
		
		 Library lib1=dao.updateLib(bean);
	
		 ModelAndView mv=new ModelAndView("FindAll");
		
		 mv.addObject("bean",lib1);
		 mv.addObject("Idlist",dao.findallLib());
		 return mv;
	}
	
	
	@RequestMapping("Remove")
	public ModelAndView doRemove(@ModelAttribute("bean")Library bean) {
		
		dao.deleteLib(bean);
		
		ModelAndView mv=new ModelAndView("FindAll");
		mv.addObject("Idlist",dao.findallLib());
		return mv;
		}
	
	
	
	@RequestMapping("Save")
	public ModelAndView doSave(@ModelAttribute("bean") Library bean) {
		
		dao.insertLib(bean);
		
		System.out.println(n);
		
		ModelAndView mv=new ModelAndView("FindAll");
		 mv.addObject("Idlist",dao.findallLib());
		return mv;
		
	}
	
		
}
