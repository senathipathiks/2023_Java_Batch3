package com.day1.spring.Springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    
    
    Student s = (Student) context.getBean("s2");
    
    System.out.println(s.toString());
    
    
    
    
    
    
    
    
    
//    Vehicle v1 =( Vehicle )context.getBean("v1");
//    v1.run();
//    Vehicle v2 =( Vehicle )context.getBean("v2");
//    v2.run();
//    	
//    	
//    	
//    	
//        Car v1=new Car();
//        v1.run();
//        Bike v2=new Bike();
//        v2.run();
    }
}
