package com.spring.day2.SpringDay2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= ("com.spring.day2.SpringDay2"))
public class AppConfig {

	@Bean(name="student")
	public Student student() {
		return new Student(111,"Varshi","Chennai");
		

	}

}
