package com.spring.day2.SpringDay2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

 
public class App {
 
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
		Student s1 = (Student) context.getBean("student", Student.class);
 
		s1.getDetails().setFathername("Manisekar");
		s1.getDetails().setMothername("Meena");
 
		System.out.println(s1);
		System.out.println(s1.getDetails());
 
	}
}