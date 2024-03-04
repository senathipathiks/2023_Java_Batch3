package com.spring.day3.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
		
//		Person p=(Person) context.getBean("per1");
//		System.out.println(p);
		Customer cus1=context.getBean(Customer.class);
		cus1.display();

	}

}
