package com.basics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.basics.bean.Calc;
import com.basics.bean.User;

@Controller
public class MyController {
	
		@RequestMapping("start")
		public ModelAndView start() {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("LandingPage");
				return mv;
		}
		
		@RequestMapping("hello")
		public ModelAndView sayHello() {
			ModelAndView mv=new ModelAndView("Hello");
			
				return mv;
		}
		
		@RequestMapping("calc-input")
		public ModelAndView calcInput() {
			ModelAndView mv=new ModelAndView("CalcInput");
			
				return mv;
		}
		
		@RequestMapping("login-input")
		public ModelAndView loginInput() {
			ModelAndView mv=new ModelAndView("LoginPage");
			
				return mv;
		}
		
		
		
		
		//method for CalcInput
		@RequestMapping("perform-addition")
		public ModelAndView performAddition(Calc calc) {
			ModelAndView mv=new ModelAndView("CalcInput");
			int sum=calc.getN1()+calc.getN2();
			mv.addObject("Sum",sum);
				return mv;
		}
		
		//method for LoginPage
		@RequestMapping("login-page")
		public ModelAndView performLogin(User user) {
			
			if(user.getUserName().equals("Vinolisha")||user.getUserName().equals("vinolisha") && user.getPassword().equals("Password@123"))
				return new ModelAndView("Success").addObject("username",user.getUserName());
			
			return new ModelAndView("LoginPage").addObject("message","Invalid UserName / Password");
			
		}
		
}

















