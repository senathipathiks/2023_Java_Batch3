package com.demoSpring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demoSpring.bean.Student1;
import com.demoSpring.bean.Student3;

public class App1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("listConfig.xml");
		
//		Student1 s1 = (Student1) context.getBean("s1");
//		s1.display();
//		System.out.println("--------------------------------------");
//		Student1 s2 = (Student1) context.getBean("s2");
//		s2.display();
		
//		Student3 s3 = (Student3) context.getBean("s3");
//		System.out.println(s3);
		
		
//		Student3 s4 = (Student3) context.getBean("s4");
//		System.out.println(s4);
		
		Student3 s5 = (Student3) context.getBean("s5");
		System.out.println(s5);
	}

}
