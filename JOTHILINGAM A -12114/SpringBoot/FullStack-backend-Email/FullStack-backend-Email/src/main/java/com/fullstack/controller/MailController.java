package com.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.service.MailService;

@RestController
public class MailController {

	@Autowired 
	MailService service;
	
	@PostMapping("/sendmail")
	public String getEmail() {
		
		System.out.println("hello");
		service.email("kirubakaran1102@gmail.com","Hi Kirubakaran your are terminated!!! Get out from the company", "Urgent");
		
		return "Send successfully";
		
	}
	
	@PostMapping("/sendmail")
	public String getAttach() throws Exception {
		
		System.out.println("hello");
		
		service.document("kirubakaran1102@gmail.com","sherindhanya232@gmail.com","Testing mail","Hi Kirubakaran your are terminated!!", "C:\\Users\\vinolisha.v\\Downloads\\Accountability Action Plan");
		
		return "Send successfully";
		
	}
	  
}
