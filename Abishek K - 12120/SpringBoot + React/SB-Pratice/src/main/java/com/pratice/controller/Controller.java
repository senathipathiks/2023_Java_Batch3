package com.pratice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
 

import com.pratice.service.MailService;

@RestController
public class Controller {
	
	@Autowired
    MailService service;
	
    @PostMapping("/sendmail")
    public String doSend() {
    	int otp = (int) ((Math.random()*9000)+1000);
    	String otpValue = String.valueOf(otp);
    	service.sendMail("leo416006@gmail.com", "Testing mail from Abishek","check your OTP: "+ otpValue);
    	return "mail sended successfuly";
    }
    @PostMapping("/sendattach")
    public String doAttach() throws Exception {
    	service.sendAttach("leo416006@gmail.com", "leo416006@gmail.com","Testing mail from Abishek", "Click to view the file document",
    			"C:\\Users\\abishek.kumar\\Downloads\\Spring + React Assessment (1).pdf");

    	return "Sended succesfully";
    }

}
