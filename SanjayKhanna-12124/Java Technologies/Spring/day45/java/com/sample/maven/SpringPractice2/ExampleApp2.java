package com.sample.maven.SpringPractice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.example1.Student;

public class ExampleApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewConfig1.xml");
		Student s1 = (Student) context.getBean("stu");
		s1.display();

	}

}
