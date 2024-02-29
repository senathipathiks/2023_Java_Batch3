package com.Springday2.SpringScope;

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
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	Student s1 = (Student)context.getBean("Student");
    	s1.setScity("Chennai");
    	System.out.println(s1);
    	Student s2 = (Student)context.getBean("Student");
    	s2.setScity("Mumbai");
    	System.out.println(s2);
    	
    }
}
