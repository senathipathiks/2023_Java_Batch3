package com.controller.day3_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@Configuration
@ComponentScan
public class Config {
	
	
	@Bean
	public Parent parent() {
		return new Parent("Muthulakshmi", "Soundhar rajan");
		
	}
	
	@Bean
	public Student student() {
		return new Student(101, "sundhar", "avadi");
		
	}
	

}
