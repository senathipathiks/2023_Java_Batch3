package com.sb.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.usermanagement.service.JWTUtils;

@SpringBootApplication
public class SbUserManagementApplication {
	@Autowired
	JWTUtils jwt ;

	public static void main(String[] args) {
		SpringApplication.run(SbUserManagementApplication.class, args);
		
	}

}
