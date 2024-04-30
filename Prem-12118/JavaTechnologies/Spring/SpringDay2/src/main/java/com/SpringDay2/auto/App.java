package com.SpringDay2.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Student s1 = (Student) context.getBean("student");
    	//s1.setScity("Chennai");
    	System.out.println(s1);
    	
    }
}
