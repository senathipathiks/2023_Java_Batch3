package com.spring.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("Object.xml");
		
		Student2 s   = (Student2) c.getBean("s1");
		
		s.show();
		System.out.println(s);
		
		

	}

}
