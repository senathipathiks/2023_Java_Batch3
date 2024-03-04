package com.frame.Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
    	Student s1 = (Student) context.getBean("s1");
    	
    	System.out.println(s1);
    	
    	
    }
}
