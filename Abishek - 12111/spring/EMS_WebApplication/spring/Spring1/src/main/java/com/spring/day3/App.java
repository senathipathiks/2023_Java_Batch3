package com.spring.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Pconfig.class);
		//Person p = (Person) context.getBean("p");
		
		//Customer c = context.getBean("cust", Customer.class);
		Customer c = (Customer) context.getBean("cust");
				c.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Student s1=(Student) context.getBean("student", Student.class);
//		
//		
//		
//		s1.getDetails().setFname("Mr.K");
//		s1.getDetails().setMname("Ms.K");
//		
//		
//		System.out.println(s1);
//		System.out.println(s1.getDetails());
		
	}
}
 