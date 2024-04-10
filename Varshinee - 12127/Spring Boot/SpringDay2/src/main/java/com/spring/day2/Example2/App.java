package com.spring.day2.Example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
//		Person p=(Person) context.getBean("per1");
//		System.out.println(c);
		
		Customer c=context.getBean(Customer.class);
//		Customer c=(Customer) context.getBean("c1");
		c.display();
	}

}
