package com.jeeva.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jeeva.annotations")
//8th line  it will search this package which are having component in that class & create bean for that
public class Confi{

	@Bean(name="per1") // bean created & available in container & check @ Componet in this package
	public Person genperson() {   // Bean Method
		
	return new Person(1,"Astro");  // Constructor Injection
	}
	
	@Bean(name="cus1")
	public Customer genCustomer() {
		
		Customer c1= new Customer();
		c1.setcId(100);
		c1.setPerson(genperson());
		return c1;
	}
	
}
