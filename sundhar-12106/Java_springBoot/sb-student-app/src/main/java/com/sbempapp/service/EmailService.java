package com.sbempapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String toMail, String subject, String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("sundharrajs.m.s422@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		
		mailSender.send(message);
		
		System.out.println("mail send successfully...!");
	}

}
