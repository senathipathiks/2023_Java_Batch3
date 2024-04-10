package com.spring.day3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.day3")
public class Pconfig {
	
	
	@Bean(name="p")
	public Person genPerson()
	{
		return new Person(1,"Emp");
	}
	
	
	@Bean(name="cust")
	public Customer genCust()
	{
		Customer cust = new Customer();
		cust.setCustid(121);
		cust.setPerson(genPerson());
		return cust;

	
}
}