package com.Springautowiredannotation.Springautowiredannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.Springautowiredannotation.Springautowiredannotation"})
public class AppConfig {
@Bean(name="student")
public Student student() {
	return new Student(113,"Dharshsun","Puducherry");
	
}
}
