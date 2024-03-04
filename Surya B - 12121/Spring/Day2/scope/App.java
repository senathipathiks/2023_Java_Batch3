package com.frame.Day2.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main( String[] args) 
	{
//		//Prototype 
//		ApplicationContext context = new ClassPathXmlApplicationContext("ScopesConfig.xml");
//		Student s1 = (Student)context.getBean("s1");
//		s1.setScity("Kovai");
//		System.out.println(s1);
//		Student s2 = (Student)context.getBean("s1");
//		System.out.println(s2);
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ScopesConfig.xml");
//		context.close();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
//		
//		Student2 s = (Student2) context.getBean("student2");
//		
//	 s.display();
//	 System.out.println(s);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AddressConfig.xml");
		Student3 s = (Student3) context.getBean("s1");
		
		
		System.out.println(s);
		
		
		
	}
}
