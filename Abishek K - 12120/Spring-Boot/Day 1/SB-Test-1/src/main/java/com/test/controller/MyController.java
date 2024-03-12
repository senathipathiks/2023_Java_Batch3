package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.Calc;
import com.test.bean.Login;

@Controller
public class MyController {
	
	@RequestMapping("start")
	public ModelAndView start() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}
	
	@RequestMapping("calc-input")
	public ModelAndView calc() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
	
	@RequestMapping("perform-addition")
	public ModelAndView addition(Calc calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getN1()+calc.getN2();
		mv.setViewName("CalcInput");
		mv.addObject("sum",sum);
		return mv;
		
	}
	
	@RequestMapping("login")
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView("Login");
		return mv;
		
		
	}
	
		
	
	@RequestMapping("valid")
	public ModelAndView valid(Login log) {
		
        ModelAndView mv = new ModelAndView();
		
		String name = log.getUname();
		String pwd = log.getPassword();
		
		if(name.equals("Admin") && pwd.equals("1234")) {
			mv.setViewName("Login");
			mv.addObject("msg","Success");
		}
		else {
			mv.setViewName("Login");
			mv.addObject("msg","Failure");
		}
		
		return mv;
	}
	
		
	}


