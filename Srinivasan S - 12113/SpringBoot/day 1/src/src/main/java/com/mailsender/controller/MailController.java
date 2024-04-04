package com.mailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


public class MailController {
	
	@Autowired
	private MailSender mailsender;
	
//	@PostMapping("/send")
//	public  triggerMail() {
//		mailsender.sendEmail()
//		return "success";
		
	}


