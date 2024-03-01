package com.day2.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("author.xml");
		
//		ac.close();
		
		Author a1 = (Author) ac.getBean("author1");
		a1.display();
	}

}
