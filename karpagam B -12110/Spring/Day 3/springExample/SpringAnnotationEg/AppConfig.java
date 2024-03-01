package com.day3.springExample.SpringAnnotationEg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.day3.springExample.SpringAnnotationEg"})
public class AppConfig {
	@Bean(name="student") // we will specify which bean we are going to execute
	public Student student() {
		return new Student(123,"kaviya","Tenkasi");
		
	}
}
