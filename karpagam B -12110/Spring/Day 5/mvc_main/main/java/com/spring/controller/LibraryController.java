package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.LibraryDAO;
import com.spring.bean.Library;

@Controller
public class LibraryController {
	
	@Autowired
	LibraryDAO dao;
	
	@RequestMapping("Banner") // source file name
	public ModelAndView loadbanner() {
		ModelAndView mv=new ModelAndView("banner");
		return mv;
		}
	@RequestMapping("Home")
	public ModelAndView loadHome() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
		}
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("links");
		return mv;
		}
	@RequestMapping("Insert")
	public ModelAndView loadInsertLibrary() {
		ModelAndView mv=new ModelAndView("insert");
		return mv;
		}
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean")Library bean){
		dao.insertLibrary(bean);
		ModelAndView mv=new ModelAndView("insertsuccess");
		mv.addObject("bean",bean);
		return mv;
		}
	@RequestMapping("Delete")
	public ModelAndView loadDeleteLibrary() {
		List<Integer> list=dao.idList();                                   //Auto populate by storing backend data in a List 
		ModelAndView mv=new ModelAndView("delete");
		mv.addObject("idList",list);
		return mv;
		}
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Library bean){
		dao.deleteLibrary(bean);
		ModelAndView mv=new ModelAndView("deletesuccess");
//		mv.addObject("bean",bean);
		return mv;
		}

	 @RequestMapping("Update")
     public ModelAndView loadUpdateLibrary() {
	List<Integer> list=dao.idList();                                   //Auto populate by storing backend data in a List 
	ModelAndView mv=new ModelAndView("update");
	mv.addObject("idList",list);
	return mv;
	}
	 @RequestMapping("Updation")
	 public ModelAndView doUpdate(@ModelAttribute("bean")Library bean){
	dao.updateLibrary(bean);
//	System.out.println(bean.getBname());
//	System.out.println(bean.getBuath());
	ModelAndView mv=new ModelAndView("updatesuccess");
	mv.addObject("bean",bean);
	return mv;
	}
	 
	 @RequestMapping("View")
		public ModelAndView loadfindLibrary() {
			List<Integer> list=dao.idList();                                   //Auto populate by storing backend data in a List 
			ModelAndView mv=new ModelAndView("view");
			mv.addObject("idList",list);
			return mv;
			}
	 
	 @RequestMapping("Find")
	 public ModelAndView doSearch(@ModelAttribute("bean")Library bean){
	
	
	
	Library l=dao.findLibrary(bean);
	ModelAndView mv=new ModelAndView("findsuccess");
	mv.addObject("bean",l);
	return mv;
	}
	 
	 @RequestMapping("FindAll")
		public ModelAndView loadfindallLibrary() {
			List<Library> list=dao.findallLibrary();                          //Auto populate by storing backend data in a List 
			ModelAndView mv=new ModelAndView("viewall");
			mv.addObject("beanlist",list);
			return mv;
			}
	 }
