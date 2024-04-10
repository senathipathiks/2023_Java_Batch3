package com.day3.Annotations.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.day3.Annotations.SpringAnnotations" })
public class Appconfig {

	@Bean(name = "student")
	
	public Student student() {
		return new Student(101, "jothi", "Tirupattur");
	}
}
