package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.CalciBean;
import com.spring.bean1.LoginBean;

@Controller
public class MyController {
	@RequestMapping("start")
	public ModelAndView start() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	@RequestMapping("calc-input")
	public ModelAndView calc() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("calc");
		return mv;
	}
	@RequestMapping("perform-addition")
	public ModelAndView performAddition(CalciBean calc) {
		ModelAndView mv=new ModelAndView();
		int sum=calc.getN1()+calc.getN2();
		mv.setViewName("calc");
		mv.addObject("Sum",sum);
		return mv;
	}
	@RequestMapping("login-input")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("login")
	public ModelAndView performlogin(LoginBean login) {
		ModelAndView mv=new ModelAndView();
		if(login.getName().equals("Varshinee")&&
				login.getPass().equals("Pass@123")) {
			return mv.addObject("msg", "LoginSuccess");
		}
		return mv.addObject("msg", "LoginFail");
		
	}

}
