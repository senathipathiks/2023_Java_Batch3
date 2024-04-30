package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		 ModelAndView mv= new ModelAndView("banner");
		 return mv;
	
	}
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		 ModelAndView mv= new ModelAndView("links");
		 return mv;
	
	}
	@RequestMapping("Insert")
	public ModelAndView loadInsertStudent() {
		 ModelAndView mv= new ModelAndView("insert");
		 return mv;
	
	}
	 
	
	

}
