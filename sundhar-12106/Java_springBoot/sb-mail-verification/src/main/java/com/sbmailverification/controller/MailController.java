package com.sbmailverification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbmailverification.entity.Mail;
import com.sbmailverification.service.MailService;

@RestController
public class MailController {

	@Autowired
	private MailService service;
	
	@Value("${spring.mail.username}")
	private String userMail;

	public MailController() {

	}

	public MailController(MailService service) {
		super();
		this.service = service;
	}

//	Logger logger = LoggerFactory.getLogger(MailController.class);

	@PostMapping("saveMail")
	public String saveMail(@RequestBody Mail mail) {

		mail.setFromMailId(userMail);
		if (service.saveMail(mail)) {
			return "saved successfully...!";
		}

		return "not saved technical error...!";

	}
	
	
	@GetMapping("verification")
	public String verificationMail(@RequestParam String mail,@RequestParam long otp) {
		return service.mailValidator(mail, otp);
	}
	

}
