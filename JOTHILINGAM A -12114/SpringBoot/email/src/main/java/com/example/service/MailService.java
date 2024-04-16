package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@Service
public class MailService {
	
	@Autowired
	JavaMailSender mailSender;
	
	public String email(String toMail, String body, String subject) {
		SimpleMailMessage message= new SimpleMailMessage();
		
		message.setFrom("jothilingam9444@gmail.com");
		message.setTo(toMail);
		return null;
		
	}
	
	
	
}
