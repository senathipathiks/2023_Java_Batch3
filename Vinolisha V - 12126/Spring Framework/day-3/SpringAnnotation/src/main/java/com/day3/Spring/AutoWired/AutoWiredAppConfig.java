package com.day3.Spring.AutoWired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.day3.Spring.AutoWired"})
public class AutoWiredAppConfig {
	
	@Bean(name="Student")
	public Student student() {
		return new Student(12126,"Vino","Nagercoil");
	}
}
