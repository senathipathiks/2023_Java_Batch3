package com.spring.day5.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.day5.scopes.Student;

public class App {
	public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
        context.close();
      
}
}
