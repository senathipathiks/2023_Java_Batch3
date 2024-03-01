package com.day3.Spring.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		//Person p=(Person) context.getBean("per1");
//		System.out.println(p);
		
//		Customer c=context.getBean(Customer.class);
//		c.setCusid(12126);
//		c.display();
		
		Customer c1= (Customer) context.getBean("cus1");
		c1.setCusid(99);
		c1.display();
	}
}
