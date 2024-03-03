package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;

@Configuration
@Controller
@ComponentScan
public class Config {

	@Bean
	public Company company() {
		Company c=new Company();
		c.setCid(1);
		c.setCname("Surya");
		return c;

	}

	@Bean
	public Employee employee() {
		return new Employee(2, "Prasanth",company());

	}

}
