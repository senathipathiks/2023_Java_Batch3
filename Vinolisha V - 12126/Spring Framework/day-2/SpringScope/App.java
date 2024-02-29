package com.day7.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configScope.xml");
		Student s1=(Student)context.getBean("student");
		s1.setScity("Chennai");//single type--only one instance will be created in the container
		System.out.println(s1);
		Student s2=(Student)context.getBean("student");
		System.out.println(s2);//prototype it will check in the ico container if it available display the pre defined values
				
	}
}
