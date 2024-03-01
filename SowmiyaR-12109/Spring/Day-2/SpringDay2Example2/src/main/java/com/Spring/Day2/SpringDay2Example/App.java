package com.Spring.Day2.SpringDay2Example;

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
//    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//    	Student s1=(Student)context.getBean("student");
//    	s1.setScity("mumbai");
//    	System.out.println(s1);
//    	Student s2=(Student)context.getBean("student");
//    	System.out.println(s2);
    	
    	
//    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//    	Student2 s1=(Student2)context.getBean("student2");
//    	s1.display();
    	
//    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//    	Student3 s1=(Student3)context.getBean("Student3");
//    	s1.display();
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	mapStudentClass map=(mapStudentClass)context.getBean("map");
    	map.display();
    	
    }
}
