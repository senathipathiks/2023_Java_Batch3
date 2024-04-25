package com.sbspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class SecurityController {
	
	@GetMapping
	public String running() {
		return "started";
	}
	
	@PostMapping
	public String postMethodName() {
		
		
		return "Im working";
	}
	
	

}
