package com.day1.SBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.day1.SBoot.bean.Calc;
import com.day1.SBoot.bean.Login;

@Controller
public class MyController {

	@GetMapping("start")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LandingPage");
		return mv;
	}

	@GetMapping("hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}

	@GetMapping("calc-input")
	public ModelAndView calcInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CalcInput");
		return mv;
	}

	@GetMapping("perform-addtion")
	public ModelAndView performAddition(Calc calc) {
		ModelAndView mv = new ModelAndView();
		int sum = calc.getN1() + calc.getN2();
		mv.setViewName("CalcInput");
		mv.addObject("Sum", sum);
		return mv;
	}

	@GetMapping("login-input")
	public ModelAndView loginInput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginInput");
		return mv;
	}

	@GetMapping("login-msg")
	public ModelAndView loginMsg(Login login) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginInput");
		if (login.getName().equals("Ranjitha") && login.getPassword().equals("12345")) {
		return mv.addObject("Msg", "Login Successfully");
		}
		else return mv.addObject("Msg", "Login Failure");
		
	}
}
