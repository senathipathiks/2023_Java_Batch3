package com.day2.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("collection.xml");
		
		Author a1 = (Author) ac.getBean("author");
		a1.display();
	}
}
