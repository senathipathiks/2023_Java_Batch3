package com.day1;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Student s1 = (Student) context.getBean("s1");
        System.out.println(s1);
        Student s2 = (Student) context.getBean("s2");
        System.out.println(s2);
        Student s3 = (Student) context.getBean("s3");
        System.out.println(s3);
        Student s4 = (Student) context.getBean("s4");
        System.out.println(s4);
	}

}
