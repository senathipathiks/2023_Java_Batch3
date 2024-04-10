package com.day1.springex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		// without constructor
		Student s1=(Student) context.getBean("s1");		
		System.out.println(s1);
		
		// default constructor in xml file		
		Student s2=new Student();
		System.out.println(s2);
		
		
		
		// argumented constructor		
		Student s3=(Student) context.getBean("s3");		
		System.out.println(s3);
		
		
		
		
		
	}
}
