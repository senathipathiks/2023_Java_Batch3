package com.Spring.Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//    	Vehicle v1=(Vehicle) context.getBean("b1");
//    	v1.run();
//    	Vehicle v2 =(Vehicle) context.getBean("c1");
//    	v2.run();

		Student s1 = (Student) context.getBean("s1");// Setter injection
		
        System.out.println("By using Setter injection");
        
		System.out.println(s1 +"\n");

		Student s2 = (Student) context.getBean("s2"); // Constructor default value
	    System.out.println("By using default constructor injection");
        System.out.println(s2+"\n");
		Student s3 = (Student) context.getBean("s3");// Constructor injection
		System.out.println("By using  constructor injection method");
		
		System.out.println(s3+"\n");
	}

}
