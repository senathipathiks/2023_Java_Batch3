package com.Spring.Day3.SpingDay3Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student s1 = (Student) context.getBean("student", Student.class);

		s1.getDetails().setFathername("Ram");
		s1.getDetails().setMothername("mageshwari");

		System.out.println(s1);
		System.out.println(s1.getDetails());

	}
}
