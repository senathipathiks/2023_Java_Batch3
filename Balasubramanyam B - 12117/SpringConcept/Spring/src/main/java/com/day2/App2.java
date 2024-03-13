package com.day2;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//		
		
		Student2 s1 = (Student2)context.getBean("s1");
		s1.display();
		System.out.println();
		Student2 s2 = (Student2)context.getBean("s2");
		s1.display();

	}

}
