package com.controller.day3_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
		
//		Person p = context.getBean("p1",Person.class);
		
//		System.out.println(p);
		
		Customer c = context.getBean("genCustomer",Customer.class);
		
		System.out.println(c);
	}

}
