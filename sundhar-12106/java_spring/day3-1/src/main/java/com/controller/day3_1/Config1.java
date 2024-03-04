package com.controller.day3_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config1 {

	@Bean(name = "p1")
	public Person genPerson() {
		Person p = new Person(101, "sundhar");
		return p;
	}
	
	@Bean
	public Customer genCustomer() {
		Customer c = new Customer();
		c.setId(101);
		return c;
	}
}
