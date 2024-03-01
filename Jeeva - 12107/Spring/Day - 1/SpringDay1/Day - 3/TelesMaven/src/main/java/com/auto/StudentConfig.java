package com.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.auto"})
public class StudentConfig {

	@Bean(name="stu")
	public Student student() {
		
		return new Student(1,"singam","Spain");	
		}
}
