package com.spring.day3.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = ("com.spring.day3.Annotations"))
public class PersonConfig {
	
	@Bean(name="person")
	public Person genPerson() {
		return new Person(11,"Srini");
		
	}
	
	@Bean(name="customer")
	public Customer gencustomer() {
		return new Customer(101);
	}
}
