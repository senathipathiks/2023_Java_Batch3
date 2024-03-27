package com.spring.day5.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.day4.Spring.Vehicle;

public class App {

	
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("ScopeConfig.xml");
	        Student s1 = (Student)context.getBean("student");
	        s1.setScity("Nagercoil");
	        System.out.println(s1);
	        Student s2 = (Student)context.getBean("student");
	        System.out.println(s2);
	      
}
}