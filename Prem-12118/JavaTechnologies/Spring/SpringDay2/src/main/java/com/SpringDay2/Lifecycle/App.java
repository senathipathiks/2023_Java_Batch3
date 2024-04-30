package com.SpringDay2.Lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		
   ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
   
   context.close();
	}

}
