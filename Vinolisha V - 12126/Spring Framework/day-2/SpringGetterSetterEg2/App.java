package com.day7.SpringGetterSetterEg2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configgetsetEg.xml");
	
		//using setter
	 Student s1=(Student)context.getBean("sq");
	 s1.display();
	 
	 //using constructor bean injection
	 

	 
	 
	 
	}
}