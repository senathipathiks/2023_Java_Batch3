package com.day1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.day1.bean.Calc;
import com.day1.bean.LogBean;

@Controller
public class MyController {

	@GetMapping("/start")
	public ModelAndView loadstart() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Index");
		return mv;
	}
	@GetMapping("hello")
	public ModelAndView sayhello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	@GetMapping("CalcInput")
	public ModelAndView docalc() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
	@GetMapping("perform-add")
	public ModelAndView performAdd(Calc calc) {
		int sum=calc.getN1()+calc.getN2();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("CalcInput");
		mv.addObject("sum",sum);
		return mv;
	}
	@GetMapping("Login")
	public ModelAndView loadLogin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	@GetMapping("LoginPage")
	public ModelAndView loadLoginPage(LogBean log) {
		ModelAndView mv=new ModelAndView();
		
		
		if(log.getName().equals("kavi")&& log.getPwd().equals("kavi1602")) {
			mv.setViewName("loginSucc");
			}
		else {
			mv.setViewName("loginfail");

		}
		return mv;
	}
	
}
