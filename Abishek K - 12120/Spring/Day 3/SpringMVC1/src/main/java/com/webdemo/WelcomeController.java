package com.webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                         // It handle the all user http- request.
public class WelcomeController {
	
	@PostMapping("Welcome")
	public String display() {
		
		return "Welcome";
	}
	
	

}
