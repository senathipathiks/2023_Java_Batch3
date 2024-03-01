package com.Spring.day2.Spring;

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
//        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Config.xml");
//        
//        context.close();
    	
//    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
//    	Student2 s2=(Student2)context.getBean("Student2");
//    	s2.display();
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	Student3 s3=(Student3)context.getBean("s3");
    	s3.display();
    }
}
