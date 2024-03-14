package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Mybean;

@Controller
public class Mycontroller {
	
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
	public ModelAndView loadHello1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}
	
	@RequestMapping("perform-addition")
	public ModelAndView performAddition(Mybean calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getN1()+calc.getN2();
		mv.setViewName("CalcInput");
		mv.addObject("Sum",sum);
		return mv;
		
	}
}