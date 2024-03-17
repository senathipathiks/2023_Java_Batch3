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
	public ModelAndView calcInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;

	}

	@RequestMapping("perform-addition")
	public ModelAndView performaddition(Calc calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getN1() + calc.getN2();
		mv.setViewName("CalcInput");
		mv.addObject("Sum", sum);
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("Login");
		return mv;
		
	}
	
	@RequestMapping("Returnform")
	public ModelAndView loadForm(Login log) {
		ModelAndView mv = new ModelAndView();
		String name= log.getUserName();
		String pwd = log.getPassword();
		
		if(name.equals("Vicky") && pwd.equals("1234")) {
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
