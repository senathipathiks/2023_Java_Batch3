package com.spring.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//Scope of Bean 
		//singleton - It affects the Whole project itself,
		//prototype - It affect only what object you targeting
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Scope.xml");
		
		Student s = (Student) context.getBean("s1");
		
		s.setScity("Chennai");
		System.out.println(s);
		
	  System.out.println("****************************************");
		
		Student s2 = (Student) context.getBean("s1");
		System.out.println(s2);
	}
}
