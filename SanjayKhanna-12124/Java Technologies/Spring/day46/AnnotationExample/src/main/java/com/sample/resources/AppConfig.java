package com.sample.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.bean.Student;


@Configuration
@ComponentScan(basePackages = {"com.sample.bean"})
public class AppConfig {
	
	@Bean(name = "Student")
	public Student student() {
		return new Student(121, "Sanjay Khanna", "Chennai");
	}

}
