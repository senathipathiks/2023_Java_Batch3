package com.basics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.basics.bean.Calc;
import com.basics.bean.User;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@GetMapping("start")
	public ModelAndView start(){
		ModelAndView mv=new ModelAndView("LandingPage");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView nextPage(){
		ModelAndView mv=new ModelAndView("Hello");
		return mv;
	}
	
	@RequestMapping("calc-input")
	public ModelAndView calculation(){
		ModelAndView mv=new ModelAndView("CalcInput");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("LoginPage");
		return mv;
	}

	
	@RequestMapping("perform-addition")
	public ModelAndView addition(Calc calc) {
		ModelAndView mv=new ModelAndView("CalcInput");
		int sum=calc.getN1()+calc.getN2();
		mv.addObject("Sum",sum);
		return mv;
	}
	
	@RequestMapping("login-details")
	public ModelAndView login(User user) {
		
		if (user.getUsername().equals("admin") && user.getPassword().equals("Password@123")) {
			return new ModelAndView("LoginSuccess").addObject("Msg","Login Success");
		}
		return new ModelAndView("LoginPage").addObject("Msg","Invalid Username/Password");
		
	}
	
	
}
