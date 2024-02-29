package com.day7.SpringGetterSetter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configgetset.xml");
	
		//using setter
	 Student s1=(Student)context.getBean("Student");
	 s1.display();
	 
	 //using constructor bean injection
	 
	 Student s2=(Student)context.getBean("s2");
	 s2.display();
	 
	}
}