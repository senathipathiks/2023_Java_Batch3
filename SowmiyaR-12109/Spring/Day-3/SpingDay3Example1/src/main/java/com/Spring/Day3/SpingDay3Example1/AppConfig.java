package com.Spring.Day3.SpingDay3Example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.Spring.Day3.SpingDay3Example1"})
public class AppConfig {
	
	@Bean(name="student")
	public Student student() {
		return new Student(111,"Sowmi","Chennai");
	}

}

























