package com.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// Here y we did't use applicationcontext beacuse close is not available in applicationcontext
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("lifecyclecfg.xml");
		StudentLifecycle st=(StudentLifecycle) context.getBean("studentlifecycle");
		System.out.println(st);
		context.close();
		// The Close will call The Destroy
		
	}
}
