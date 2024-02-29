package com.day2.Beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		 ApplicationContext context =new ClassPathXmlApplicationContext("Addconf.xml");
		 
		 
//		 Student2 s=(Student2) context.getBean("student");
//		   
//		 //context.close();
//		 s.display();
//		 System.out.println(s);
		 
		 
		 Student3 s=(Student3) context.getBean("add1");
		 
		 System.out.println(s);
//		   
		 
		 
	}

}
