package com.pratice.service;

import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	
	@Autowired
	private JavaMailSender mailsender;
	
	public void sendMail(String toMail ,String subject,String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("leo416006@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		mailsender.send(message);
		System.out.println("sended");

	}
	public void sendAttach(String toMail,String cc,String subject,String body,String attachment)throws Exception {
		MimeMessage ms=mailsender.createMimeMessage();
		MimeMessageHelper msgg=new MimeMessageHelper(ms,true);
		msgg.setFrom("abi948407@gmail.com");
		msgg.setTo(toMail);
		msgg.setCc(cc);
		msgg.setText(body);
		msgg.setSubject(subject);
		FileSystemResource fs=new FileSystemResource(new File(attachment));
		msgg.addAttachment(fs.getFilename(), fs);
		mailsender.send(ms);
		System.out.println("sended");

	}
}
