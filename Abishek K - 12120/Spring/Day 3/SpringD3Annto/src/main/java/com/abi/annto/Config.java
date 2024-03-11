package com.abi.annto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.abi.annto")
public class Config {
	
	@Bean(name="p1")
	public Person genPerson() {    //Bean creating  Method
		
		return new Person(12120, "Abishek");     //Constructor Injection 
	}
	
	@Bean(name="p2")
	public Person g2() {
		
		return new Person(11,"Abi");
	}
	
	@Bean(name="c1")
	public Customer genCustomer() {
		
		Customer c1 = new Customer();
		c1.setCustid(88);
		//c1.setPerson(genPerson());  //Once we set the value to the person, another time we don't want to set the value. This is because of the "Autowired". 
		                              //First time we set the value to the Person, second time we don't want to set the value. If we comment this set line, In the output it will show the person value.
		
		return c1;
	

}
}
