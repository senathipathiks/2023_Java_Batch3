package com.sbmailverification.service;

import com.sbmailverification.entity.Mail;

public interface MailService {
	
	
	public boolean saveMail(Mail mail);
	
	public String mailValidator(String mail, long otp);
	

}
