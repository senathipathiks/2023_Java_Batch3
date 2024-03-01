package com.day3.annoteg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this is the configuration file, replacement of xml file

@Configuration
@ComponentScan(basePackages= {"com.day3.annoteg"}) //set the base package, inform spring container to check the class within the package
public class Config {
	@Bean(name="person") // it should be in small case i.e decaptilize
	public Person person() {
		
		return new Person(101,"kaviya Anand");
		
	}
	
	@Bean(name="cus")
	public Customer customer() {
		
//		Customer c1=new Customer();
//		c1.setCustid(201);
//		c1.setPerson(person());
//		return c1;
		
		return new Customer(201);
		
	}
	

	
	
	
}
