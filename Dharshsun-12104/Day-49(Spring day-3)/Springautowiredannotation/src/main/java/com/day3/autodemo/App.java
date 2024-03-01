package com.day3.autodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	Customer c=(Customer)context.getBean("c1");
    	c.display();

    }
}
