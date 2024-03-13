package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Calc;
import com.bean.Login;

@Controller
public class MyController {

	@RequestMapping("start")
	public ModelAndView loadStart() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView loadHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("calc-input")
	public ModelAndView loadCalc() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
	
	@RequestMapping("login-form")
	public ModelAndView loadLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	
	@RequestMapping("perform-additon")
	public ModelAndView doPerform(Calc calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getOne() + calc.getTwo();
		mv.setViewName("CalcInput");
		mv.addObject("sum", sum);
		return mv;
	}
	
	@PostMapping("login-validate")
	public ModelAndView doValidate(Login login) {
		String name = "Surya";
		String pass = "1234";
		
		System.out.println(login);
		
		if(login.getUsername().equals(name) && login.getPass().equals(pass)) 
			return new ModelAndView("Login").addObject("msg", "Validation Success");
		
		return new ModelAndView("Login").addObject("msg", "validation Failed");
	}
	
	
}
