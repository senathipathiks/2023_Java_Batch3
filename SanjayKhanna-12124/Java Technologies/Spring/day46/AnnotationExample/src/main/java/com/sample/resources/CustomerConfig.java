package com.sample.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.bean.Customer;
import com.sample.bean.Person;

@Configuration
@ComponentScan(basePackages = "com.sample.bean")
public class CustomerConfig {
	
	@Bean(name="p1")
	public Person person() {
		return new Person(1, "SanjayKhanna");
	}
	
	@Bean(name="c1")
	public Customer customer() {
		return new Customer(12124, person());
	}

}
