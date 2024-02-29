package com.abi.blife;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("blife.xml");
		
		
		//Setter-Injection
//		Student std = (Student)context.getBean("stud");
//		std.display();
		
		//Constructor-Injection
//		Student std = (Student) context.getBean("stud1");
//		std.display();
		
		Student2 std = (Student2) context.getBean("std");
		std.display();
		
		

	}

}
