package com.day2;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//		Student s1 = (Student) context.getBean("s1");
//        s1.setCity("Chennai");
//        System.out.println(s1);
//        Student s2 = (Student) context.getBean("s1");
//        System.out.println(s2);
		Employee s4 = (Employee) context.getBean("e1");
		System.out.println(s4);
		Employee s3 = (Employee) context.getBean("e1");
		s3.setName("Kamaraj");
		s3.setAge(21);
		System.out.println(s3);

	}

}
