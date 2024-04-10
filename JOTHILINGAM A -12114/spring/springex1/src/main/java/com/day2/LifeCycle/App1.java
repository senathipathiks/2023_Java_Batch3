package com.day2.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configpackgday2LifeCycle.xml");
		
		context.close();
	}
}
