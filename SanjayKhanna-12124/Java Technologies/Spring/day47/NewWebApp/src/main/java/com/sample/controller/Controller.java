package com.sample.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping(value="addStudent", method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student")Student student) {
		ModelAndView mv = new ModelAndView("Welcome");
		mv.addObject("stu",student);
		return mv;
	}

}
