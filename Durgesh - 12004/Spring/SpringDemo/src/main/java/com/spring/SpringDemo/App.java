package com.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("vehicle.xml");
    	
    	
    	Vehicle v1 = (Vehicle) ac.getBean("b1");
    	v1.run();
    	
    	Vehicle v2 = (Vehicle) ac.getBean("c1");
    	v2.run();
    	
    	Book book1 = (Book) ac.getBean("book1");
    	System.out.println(book1);
    	
    }
}
