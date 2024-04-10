package com.sbmailverification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbmailverification.entity.Mail;
import com.sbmailverification.generator.MailGenerator;
import com.sbmailverification.repository.MailRepo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class MailServiceImpl implements MailService {

	private MailRepo repo;

	private MailGenerator generator;

	@Autowired
	public MailServiceImpl(MailRepo repo, MailGenerator generator) {
		super();
		this.repo = repo;
		this.generator = generator;
	}

	public MailServiceImpl() {

	}

	@Override
	public boolean saveMail(Mail mail) {

		generator.sendMail(mail);
		return repo.saveMail(mail);
	}
	
	
	@Override
	public String mailValidator(String mail, long otp) {
		
		if(generator.mailVerification(mail, otp)) {
			return "verification success...!";
		}
		return "verification failure...!";
	}

}
