package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Calc;
import com.example.demo.bean.Login;

import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MyController {
	
	@RequestMapping("start")
	public ModelAndView onStart() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		return new ModelAndView("hello");
	}
	
	@RequestMapping("registration")
	public ModelAndView loadRegistration() {
		return new ModelAndView("Registration");
	}
	
	@PostMapping("register")
	public ModelAndView doRegister(@RequestParam("name")String name,@RequestParam("age")Integer age,@RequestParam("gender")String gender) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(name);
		list.add(age);
		list.add(gender);
		return new ModelAndView("Success").addObject("list",list);
	}
	
	@RequestMapping("calc")
	public ModelAndView loadCalc() {
		return new ModelAndView("Calci");
	}
	
	@PostMapping("calculate")
	public ModelAndView doCalc(Calc c) {
		int sum = c.getNum1()+c.getNum2();
		return new ModelAndView("Calci").addObject("output", sum);
	}
	
	@RequestMapping("loginpage")
	public ModelAndView loadLogin() {
		return new ModelAndView("Login");
	}
	
	@PostMapping("login")
	public ModelAndView doLogin(Login l) {
		if((l.getUsername().equals("admin")||l.getUsername().equals("Admin"))&& l.getPassword().equals("password@123"))
			return new ModelAndView("LoginSuccess").addObject("username",l.getUsername());
		return new ModelAndView("Login").addObject("msg","Login unsuccessful");
	}
	
}
