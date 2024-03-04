package com.day1.annotationex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.day1.annotationex")
public class Config {
	
	@Bean(name="per")
	public Person genPerson() 
	
	{
		return new Person(111,"Deepika");

}
	@Bean(name="c1")
	public Customer genCustomer() {
		Customer c1=new Customer();
		c1.setCustid(123);
		c1.setPerson(genPerson());
		return c1;
		
	}
}