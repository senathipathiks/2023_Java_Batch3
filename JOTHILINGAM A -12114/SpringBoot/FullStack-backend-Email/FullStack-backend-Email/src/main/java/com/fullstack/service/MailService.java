package com.fullstack.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;


@Service

public class MailService {
	
	@Autowired
	JavaMailSender mailSender;

	public String email(String toMail, String body, String subject){
		
		SimpleMailMessage message= new SimpleMailMessage();
		
		message.setFrom("vinolisha2000@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		return null;
		
	}
	
	public void document(String toMail, String cc, String subject, String body, String attachment) throws Exception{
		MimeMessage mimeMsg=mailSender.createMimeMessage();
		
		MimeMessageHelper msg=new MimeMessageHelper(mimeMsg, true);
		msg.setFrom("vinolisha2000@gmail.com");
		msg.setTo(toMail);
		msg.setCc(cc);
		msg.setText(body);
		msg.setSubject(subject);
		
		FileSystemResource fs=new FileSystemResource(new File(attachment));
		msg.addAttachment(fs.getFilename(), fs);
		mailSender.send(mimeMsg);
		System.out.println("Mail sended Successfully");
		
	}
	
}
