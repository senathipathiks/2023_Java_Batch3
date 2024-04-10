package com.day3.Annotations.SpringAnnotationssena;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.day3.Annotations.SpringAnnotationssena")
public class Config {

	@Bean(name = "p")

	public Person genPerson() {

		return new Person(101, "JOthi");

	}
	
	@Bean (name = "c1")
	
	Customer gencustomer() {
		
		Customer c1=new Customer();
		c1.setCustid(121);
		c1.setPerson(genPerson());
		return c1;
	}
}
