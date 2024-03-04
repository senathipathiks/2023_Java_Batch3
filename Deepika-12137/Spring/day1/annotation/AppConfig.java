package com.day1.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages= {"com.day1.annotation"})
public class AppConfig {

	@Bean(name="student")
	public Student student() {
		return new Student(111,"Gowtham","Chennai");
	}
}
