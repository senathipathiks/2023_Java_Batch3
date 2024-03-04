package com.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s1 = context.getBean("student", Student.class);
		
		s1.getDetails().setFathername("Mariyappan");
		s1.getDetails().setMothername("Neelambal");
		
		System.out.println(s1);
		System.out.println(s1.getDetails());
	}
}
