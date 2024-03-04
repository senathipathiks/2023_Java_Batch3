package day3mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("Welcome")
	public String display() {
		System.out.println("hello");
		return "Welcome";
	}

}
