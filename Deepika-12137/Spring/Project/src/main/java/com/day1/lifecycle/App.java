package com.day1.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 
	public static void main (String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		context.close();
	}
}
