package com.sample.maven.SpringPractice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.example1.*;

public class ExampleApp {
		
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewConfig.xml");
		StudentClass s1 = (StudentClass) context.getBean("stu");
		s1.display();
	}
	

}
