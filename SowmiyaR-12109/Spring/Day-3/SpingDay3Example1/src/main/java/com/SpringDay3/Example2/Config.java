package com.SpringDay3.Example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.SpringDay3.Example2")
public class Config {

@Bean(name="per1")
public Person getPerson()
{
	return new Person(12,"sowmi");
}
	
@Bean(name="C1")
public Customer getCustomer()
{
	Customer c1=new Customer();
	c1.setCustid(111);
	c1.setPerson(getPerson());
	return c1;
}
}
