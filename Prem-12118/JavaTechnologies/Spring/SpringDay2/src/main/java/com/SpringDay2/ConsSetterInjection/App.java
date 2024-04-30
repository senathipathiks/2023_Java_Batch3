package com.SpringDay2.ConsSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class App {

	public static void main(String[] args) {

    	ApplicationContext context = new ClassPathXmlApplicationContext("ConsSetter.xml");
    	Student s1 = (Student) context.getBean("student");
    	 
    	s1.display();
    	 
    	 
    }


	}


