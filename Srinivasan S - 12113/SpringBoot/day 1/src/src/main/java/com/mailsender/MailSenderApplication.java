package com.mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mailsender.entity.Mail;
import com.mailsender.service.MailService;

@SpringBootApplication
public class MailSenderApplication implements CommandLineRunner{
	
	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mail mail = new Mail();
		mail.setMailFrom("sender@gmail.com");
		mail.setMailTo("receiver@gmail.com");
		mail.setMailSubject("Spring Boot - Email demo");
		mail.setMailContent("Just testing");
		mailService.sendEmail(mail);
	}

}
