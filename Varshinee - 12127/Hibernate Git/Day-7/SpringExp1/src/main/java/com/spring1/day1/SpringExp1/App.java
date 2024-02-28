package com.spring1.day1.SpringExp1;

import org.springframework.beans.factory.BeanFactory;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	BeanFactory context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student s1=(Student)context.getBean("s1");
    	System.out.println(s1);
    	
    	Student s2=(Student)context.getBean("s2");
    	System.out.println(s2);
    	
    	
    }
}

