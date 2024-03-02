package com.day3.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       
//    	Person p=(Person) context.getBean("per1");
    	Customer c=(Customer) context.getBean("c2");
    	c.display();
    	
    	
    	
    	
       
    }
}
