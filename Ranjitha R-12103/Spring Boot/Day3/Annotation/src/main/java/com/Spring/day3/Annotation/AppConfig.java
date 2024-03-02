package com.Spring.day3.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.Spring.day3.Annotation" })
public class AppConfig {
	@Bean(name = "student")
	public Student student() {
		return new Student(121, "Ram", "Chennai");
	}

}
