package com.day1.Scope;

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
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Student3.xml");
//        Student s1=(Student)context.getBean("Student");
//        s1.setCity("chennai");
//        System.out.println(s1);
//        Student s2=(Student)context.getBean("Student");
//        System.out.println(s2);
    	
//    	Student2 ss1=(Student2)context.getBean("ss1");
//    	ss1.display();
//    	
    	Student3 ss1=(Student3)context.getBean("ss1");
    	ss1.display();
    	
    }
}
