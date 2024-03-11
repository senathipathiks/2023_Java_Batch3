package com.abi.annto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);  //used to generate bean
		
		//Person p = (Person) context.getBean("p1");
		
		Customer c = (Customer) context.getBean("c1");
		c.display();

	}

}
