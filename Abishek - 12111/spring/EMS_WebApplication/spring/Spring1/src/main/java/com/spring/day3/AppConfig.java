package com.spring.day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.day3"})

public class AppConfig {
@Bean(name="student")
public Student student()
{
	return new Student(001,"Emperor","chennai");
}
}
