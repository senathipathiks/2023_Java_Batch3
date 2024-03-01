package com.day3.autodemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.day3.autodemo") //informing spring container to take annotation
public class Config {
		@Bean(name="per1")
		public Person genPerson() 
		{
			return new Person(122,"Dharshsun");
		}
		@Bean(name="c1")
		public Customer genCustomer() {
//			Customer c1 = new Customer();
//			c1.getCustid();
			return new Customer(101);
		}
}
