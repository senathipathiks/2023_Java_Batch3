package com.day2.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("set.xml");
		
		Sport s1 = (Sport) ac.getBean("sport");
		s1.show();
		
	}

}
