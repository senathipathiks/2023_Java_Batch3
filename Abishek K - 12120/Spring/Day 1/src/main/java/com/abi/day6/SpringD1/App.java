package com.abi.day6.SpringD1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); 
    	
//        Vehicle v1 = (Vehicle) context.getBean("b1");
//        v1.ride();
//        
//        Vehicle v2 = (Vehicle) context.getBean("c1");
//        v2.ride();
    	
//    	Student st = (Student) context.getBean("s1");
//    	System.out.println(st);
    	
    	Student st2 = (Student) context.getBean("s2");
    	System.out.println(st2);
    	
    	
    	
    	
        
    }
}
