package com.day2.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");
		Book book = (Book) ac.getBean("book");
		System.out.println(book);
		Book book2 = (Book) ac.getBean("book");
		book2.setAuthor("Alex Michaelides");
		System.out.println(book2);
	
	}

}
