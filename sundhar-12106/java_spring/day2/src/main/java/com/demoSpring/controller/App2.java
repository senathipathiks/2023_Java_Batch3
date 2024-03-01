package com.demoSpring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demoSpring.bean1.Student1;

public class App2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("listConfig.xml");
		
//		Student s1 = (Student) context.getBean("s6");
//		System.out.println(s1.getAddress());
		
		Student1 s2 = (Student1) context.getBean("s7");
		System.out.println(s2.getAddress());
	}

}
