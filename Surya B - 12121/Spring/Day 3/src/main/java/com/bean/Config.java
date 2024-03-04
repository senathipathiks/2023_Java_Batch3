package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	
	@Bean
	public Person genPerson() {
		return new Person(12,"Loki");
	}
	
	@Bean
	public Customer customer() {
		Customer c = new Customer();
		c.setCustid(12);
		return c;
	}
	
	
	
}
