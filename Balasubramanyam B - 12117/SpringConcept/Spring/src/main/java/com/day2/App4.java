package com.day2;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
	
		
//		Student3 s1 = (Student3)context.getBean("s1");
//		s1.display();
		
		Student4 s1 = (Student4)context.getBean("s1");
		s1.display();

	}

}
