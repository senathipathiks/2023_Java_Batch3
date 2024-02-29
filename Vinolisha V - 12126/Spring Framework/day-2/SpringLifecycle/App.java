package com.day7.SpringLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configLifecycle.xml"); // it is an 
		context.close(); //it is available in classpathapplicationcontext
	}

}
