package com.spring.day1.Project2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		
		Vehicle v1= (Vehicle) context.getBean("s1");
		System.out.println(v1);
		
	}
	
}
