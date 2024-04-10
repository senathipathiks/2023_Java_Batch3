package com.spring.day4.sampleprg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	 public static void main( String[] args )
	    {
		     	ApplicationContext context = new ClassPathXmlApplicationContext("Map.xml");
//		     	Student2 s1 = (Student2)context.getBean("student");
//				 s1.display();
////				 using constructor bean injection
//				 Student2 s2 = (Student2)context.getBean("s2");
//				 s2.display();
//			Using two class
//				 Student3 s3 = (Student3)context.getBean("sw");
//				 s3.display();
		     	
		     	 StudentUsingMap s3 = (StudentUsingMap)context.getBean("sw");
				 s3.display();
	    }
}
