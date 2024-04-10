package com.spring.day2.Example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.day2.Example2")
public class Config {

	@Bean(name="per1")
	public Person genPerson()
	{
		return new Person(12,"Varshi");
	}
	
	@Bean
	public Customer customer()
	{
//		Customer c1=new Customer();
//		c1.setCustid(121);
//		c1.setPerson(genPerson());
//		return c1;
		
		return new Customer(123);
		
		
	}
}
