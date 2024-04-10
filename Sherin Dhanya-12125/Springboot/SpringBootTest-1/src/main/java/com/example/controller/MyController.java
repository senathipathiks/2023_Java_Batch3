package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.Calc;
import com.example.bean.Login;

import jakarta.ws.rs.core.Response;

@Controller
public class MyController {

	@RequestMapping("start")
	public ModelAndView start() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("calc-input")
	public ModelAndView calcInput() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("calcinput");
		return mv;
	}
	
	@RequestMapping("perform-addition")
	public ModelAndView performAddition(Calc calc) {
		ModelAndView mv= new ModelAndView();
		int sum=calc.getN1()+calc.getN2();
		mv.setViewName("calcinput");
		mv.addObject("Sum",sum);
		return mv;
	}
	
	@RequestMapping("login-input")
	public ModelAndView loginInput() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("logininput");
		return mv;
	}
	@RequestMapping("perform-login")
	public ModelAndView performLogin(Login login) {
		ModelAndView mv= new ModelAndView("logininput");
		if(login.getUsername().equals("admin") && login.getPassword().equals("Password@123")) {
			return mv.addObject("Msg","Login Success");

		}
		return mv.addObject("Msg","Login Failed");

	}
}
