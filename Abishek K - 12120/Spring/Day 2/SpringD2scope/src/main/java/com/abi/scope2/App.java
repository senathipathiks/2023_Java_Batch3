package com.abi.scope2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student st = new Student();
		st.app();
		
		 context.close();   //It is used to destroy the container. Before the destroy the container it will call the destroy method.
		

	}

}
