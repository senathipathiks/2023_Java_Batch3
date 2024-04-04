package com.sbmailverification.generator;

import java.beans.JavaBean;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.sbmailverification.entity.Mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Service
public class MailGenerator {

	@Autowired
	private JavaMailSender mailSender;

	public MailGenerator() {

	}

	static int tempOtp;
	static String toMail;

	public void sendMail(Mail mail) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		Random random = new Random();
//		int sysOtp = random.nextInt(999999);
//		System.out.println(sysOtp +" : random class otp ");
		tempOtp = (int) (Math.random() * 99999 + 99999);
		toMail = mail.getToMailId();
		System.out.println(tempOtp);
		System.out.println(mail.getFromMailId());
		mailMessage.setFrom(mail.getFromMailId());
		mailMessage.setTo(mail.getToMailId());
		mailMessage.setSubject(mail.getSubjectMail());
		mailMessage.setText(mail.getBodyMail() + "\nyour OTP : " + tempOtp);

		mailSender.send(mailMessage);

	}

	public MailGenerator(JavaMailSender mailSender) {
		super();
		this.mailSender = mailSender;
	}

	public boolean mailVerification(String mail, long otp) {

		System.out.println(tempOtp + " : "+otp);
		System.out.println(mail + " : "+toMail);
		if (mail.equalsIgnoreCase(toMail) && otp == tempOtp) {
			return true;
		} else {

			return false;
		}

	}
}
