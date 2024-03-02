package com.day3.annotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.day3.annotation2")
public class Config {
	
	@Bean(name="per1")
	public Person genPerson() {
		return new Person(3,"Sathya");
	}
	
	@Bean(name="c2")
	public Customer genCustomer() {
		Customer c=new Customer();
		c.setCustid(12);
		c.setPerson(genPerson());
		return c;
	}
	

}
