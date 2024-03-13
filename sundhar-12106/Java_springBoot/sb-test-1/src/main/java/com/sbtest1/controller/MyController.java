package com.sbtest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.sbtest1.bean.InputPojo;
import com.sbtest1.bean.LoginCredentials;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MyController {
	
	
	@GetMapping("/start")
	public ModelAndView loadStart() {
		return new ModelAndView("index");
	}
	
	@GetMapping("hello")
	public ModelAndView loadHello() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("name", "Sundhar Raj");
		return mv;
	}
	
	@GetMapping("calc-input")
	public ModelAndView loadCalc() {
		return new ModelAndView("CalcInput");
	}
	
	
	@GetMapping("p-add")
	public ModelAndView loadAddOperation(InputPojo pojo) {
		ModelAndView mv = new ModelAndView("CalcInput");
		int  n = pojo.getInp1()+pojo.getInp2();
		mv.addObject("result", n);
		return mv;
	}
	
	@GetMapping("log")
	public ModelAndView loadLoginPage() {
		return new ModelAndView("Login");
	}
	
	@PostMapping("login-access")
	public ModelAndView authenticateUser(LoginCredentials credentials) {
		
		ModelAndView mv = new ModelAndView();
		
		if (credentials.getUsername().equals("sundhar123") && credentials.getPassword().equals("dhanu@1702")) {
			mv.setViewName("Success");
			mv.addObject("username", credentials.getUsername());
		} else {
			mv.setViewName("Login");
			mv.addObject("error", "authentication failed... try again");
		}
		
		return mv;
	}
	
	

}
