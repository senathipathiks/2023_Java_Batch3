package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.bean.Calc;
import com.springboot.bean.Login;

@Controller
public class MyController {

	@RequestMapping("start")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Landing");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("login-input")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
	
	@RequestMapping("calc-input")
	public ModelAndView calcInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
	
	@RequestMapping("perform-addition")
	public ModelAndView performAddition(Calc calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getN1() + calc.getN2();
		mv.addObject("Sum" , sum);
		mv.setViewName("CalcInput");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView loginFailure(Login lgn) {
		if(lgn.getUsername().equals("admin") && lgn.getPassword().equals("Password@12345")) {
			return new ModelAndView("LoginSuccess");
		}
		return new ModelAndView("Login").addObject("Msg","Invalid Username/Password");
			
	}	
	
}
