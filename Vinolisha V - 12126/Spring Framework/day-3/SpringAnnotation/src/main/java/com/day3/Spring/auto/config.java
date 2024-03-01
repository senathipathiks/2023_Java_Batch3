package com.day3.Spring.auto; // here we have bean generation method

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.day3.Spring.auto")//informing the spring to check the component
public class config {
	
	@Bean(name="per1") //creating the bean// now the bean is contain in the container
	public Person genPerson() {
		return new Person(1,"Vinu");
	}
		
	@Bean(name="cus1")
	public Customer genCustomer() {
		
		Customer c1=new Customer();
		c1.setCusid(121);
		c1.setPerson(genPerson());
		return c1;
		
	
		
	}
	
	
}
