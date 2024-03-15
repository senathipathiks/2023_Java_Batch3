package com.sbempapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sbempapp.service.StudentService;


@RestController
public class MyController {
	
//	@Autowired
//	private EmailService emailService;
	
	@Autowired
	private StudentService service;
	
	
//	@GetMapping("hello")
//	public String sendEmail() {
//		
//		String body = "this mail is from sundhar raj to his friend from java codes";
//		String subject = "Urgent Immediate..!";
//		
//		emailService.sendEmail("jothilingamtpt@gmail.com", subject, body);
//		System.out.println("hello");
//		return "success";
//	}
	
	@PostMapping("save")
	public String postStudent(@RequestParam("file") MultipartFile file) throws IOException {
		 System.out.println("hello from controller");
		
		return service.saveStudentPicture(file);
	}
	

}
