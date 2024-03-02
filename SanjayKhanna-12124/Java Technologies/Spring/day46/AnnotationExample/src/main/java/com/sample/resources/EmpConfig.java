package com.sample.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.bean.Employee;
import com.sample.bean.Parent;

@Configuration
@ComponentScan(basePackages = {"com.sample.bean"})
public class EmpConfig {
	
	public Parent parent() {
		return new Parent("Subramani", "Anandhi");
	}
	
	@Bean(name = "employee")
	public Employee employee() {
		return new Employee(10, "Sanjay Khanna",parent());
	}

}
