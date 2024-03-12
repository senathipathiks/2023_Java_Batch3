package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Calc;
import com.spring.bean2.Login;

@Controller
public class MyController {
     
	@RequestMapping("start")
	public ModelAndView start() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
//	==============================
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}	
//	===============================
	@RequestMapping("calc-input")
	public ModelAndView calcInput() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
//	===============================
	
	@RequestMapping("perform-addition")
	public ModelAndView performAddition(Calc calc) {
		ModelAndView mv=new ModelAndView();
		int sum=calc.getN1()+calc.getN2();
		int sub=calc.getN1()+calc.getN2();
		mv.setViewName("CalcInput");
		mv.addObject("Sum",sum);
		return mv;
	}
//	===================================
	@RequestMapping("login-input")
	public ModelAndView loginInput() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("LoginInput");
		return mv;
	}
//	================================
	@RequestMapping("Login-Page") 
	public ModelAndView LoginPage(Login login) {
		ModelAndView mv=new ModelAndView("LoginInput");
		if(login.getName().equals("Sowmiya") &&
		login.getPassword().equals("Sowmi@123")) {
			return mv.addObject("Msg","Login Success");
		}
		return mv.addObject("Msg","Login fail");
 }
}
