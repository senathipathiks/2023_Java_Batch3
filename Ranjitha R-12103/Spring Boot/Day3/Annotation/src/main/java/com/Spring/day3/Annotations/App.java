package com.Spring.day3.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//		Person p=(Person) context.getBean("person");
//		System.out.println(p);
		
//		Customer c=context.getBean(Customer.class);
//		c.display();
		
		Customer c = (Customer) context.getBean("customer");
		c.display();

	}

}
