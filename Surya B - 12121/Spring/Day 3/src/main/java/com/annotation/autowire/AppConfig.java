package com.annotation.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.annotation.autowire"})
public class AppConfig {
	
	@Bean(name = "student")
	public Student student() {
		return new Student(121, "Prem", "Salem");
	}
}
