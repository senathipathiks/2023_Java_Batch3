package com.spring.day1.SpringEx;

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
    	
//    	Vehicle v1=new Car();
//        v1.run();
//        Vehicle v2=new Bike();
//        v2.run();
        
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Vehicle v1=(Vehicle) context.getBean("b1");
        v1.run();
        Vehicle v2=(Vehicle) context.getBean("c1");
        v2.run();
        
    }
}
