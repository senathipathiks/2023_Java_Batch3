package com.spring.day3.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = ("com.spring.day3.Annotations"))
public class AppConfig {
	@Bean(name="student")
	public Student student() {
		return new Student(12113, "Srini", "Neyveli");
		
	}
	@Bean(name="parent")
	public Parent parent() {
		return new  Parent("Subramanian","Latha");
		
	}
}
