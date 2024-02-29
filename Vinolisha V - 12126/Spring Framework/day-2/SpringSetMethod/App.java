package com.day7.SpringSetMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("configset.xml");
	
//	Student s2=(Student) context.getBean("Student");
//	s2.display();
//	Student s3=(Student) context.getBean("Stud");
//	s3.display();
	
	
	Student2 s1=(Student2) context.getBean("Student2");
	s1.display();
	
	
	
	
	}
	
}
