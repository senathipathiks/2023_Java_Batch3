package com.day1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.day1.bean.Calculator;
import com.day1.bean.LoginBean;

@Controller
public class Example1Controller {
	
	@RequestMapping("/start")
	public ModelAndView loadstart() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	
	@RequestMapping("Hello")
	public ModelAndView loadhello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}
	
	@RequestMapping("Calci")
	public ModelAndView loadcalci() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Calci");
		return mv;
	}
	
	@GetMapping("addition")
	public ModelAndView doaddition(Calculator cal) {
		ModelAndView mv=new ModelAndView();
		int sum= cal.getNum1() + cal.getNum2();
		mv.setViewName("Calci");
		mv.addObject("Sum",sum);
		return mv;
	}
	
	@GetMapping("Login")
	public ModelAndView loadlogin() {
		ModelAndView mv=new ModelAndView("Login");
		return mv;
		
	}
	
	@GetMapping("loginPage")
	public ModelAndView dologin(LoginBean log) {
		
		ModelAndView mv=new ModelAndView();
		
		String uname=log.getName();
//		String upwd=log.getPwd();
				
		
		if(log.getName().equals("Srini")&& log.getPwd().equals("Sri25")) {
			mv.addObject("username",uname);
			mv.setViewName("LoginSuccess");
		}
		else
			mv.setViewName("LoginFail");
		
		
		
		return mv;
	}
}
