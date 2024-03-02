package com.Spring.day3.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.Spring.day3.Annotations"})
public class Config {
	@Bean(name = "person")
	public Person getPerson() {
		return new Person(12,"RAM");
	}
@Bean(name="customer")
public Customer getCustomer() {
	Customer c1=new Customer();
	c1.setCid(123);
	c1.setPerson(getPerson());
	return c1;
}
}
