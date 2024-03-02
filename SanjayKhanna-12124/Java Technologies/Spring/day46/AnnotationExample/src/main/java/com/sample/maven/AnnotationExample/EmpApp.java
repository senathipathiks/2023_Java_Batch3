package com.sample.maven.AnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.bean.Employee;
import com.sample.resources.EmpConfig;

public class EmpApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee emp = (Employee)context.getBean("employee",Employee.class);
		emp.display();
	}
}
