package com.day2.ListCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configpackgListCollection.xml");
		Student2 s1 = (Student2) context.getBean("s1");
		s1.display();
		
		Student2 s2 = (Student2) context.getBean("s2");
		s2.display();

	}
}
