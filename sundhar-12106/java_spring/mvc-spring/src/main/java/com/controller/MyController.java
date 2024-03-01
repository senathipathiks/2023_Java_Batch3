package com.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ComponentScan(basePackages = {"com.controller"})
@RequestMapping(path="/")
public class MyController {
	
	@RequestMapping("summa")
	public String showView() {
		System.out.println("hello");
		
		return"display.jsp";
	}

}
