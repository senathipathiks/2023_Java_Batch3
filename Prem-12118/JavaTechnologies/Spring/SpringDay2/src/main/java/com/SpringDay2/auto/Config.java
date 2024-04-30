package com.SpringDay2.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="student")
	public Student beanGen()
	{
		return new Student(121,"Arun","Chennai");
	}
}
