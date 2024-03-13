package com.spring2.day2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");
    	Student2 s2 = (Student2)context.getBean("s3");
    	s2.display();
    	
    }
}
 