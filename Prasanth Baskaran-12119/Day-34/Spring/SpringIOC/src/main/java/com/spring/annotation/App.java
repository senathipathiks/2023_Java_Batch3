package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		
		 Employee e1   = c.getBean(Employee.class);
		 
		 
		 System.out.println(e1);
		 
		 e1.getCompany().setCname("KD & Co");
		 
		 System.out.println(e1);
		
	}

}
