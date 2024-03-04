package com.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//Person p = (Person) context.getBean("per1");
		//System.out.println(p);
		
		Customer c = context.getBean(Customer.class);
		
		c.display();
		System.out.println(c);
	}

}
