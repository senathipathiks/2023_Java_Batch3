package com.SpringDay3.Example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
//		Person p=(Person) context.getBean("per1");
//		System.out.println(p);
		
		
//		Customer c=context.getBean(Customer.class);
//        c.display();
		
		Customer c=(Customer)context.getBean("C1");
		c.display();
		

	}
}
