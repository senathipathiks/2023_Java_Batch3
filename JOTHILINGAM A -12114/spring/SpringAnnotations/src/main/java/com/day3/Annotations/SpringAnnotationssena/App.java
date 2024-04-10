package com.day3.Annotations.SpringAnnotationssena;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		//Person p=(Person) context.getBean("p");
		Customer c=(Customer) context.getBean("c1");
		
		
		c.display();

	}

}
