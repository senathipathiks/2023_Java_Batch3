package com.day6.Spring.Student;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
      Student s1=(Student) context.getBean("stud");   
      System.out.println(s1);
      
      Student s2=(Student) context.getBean("stud1");   
      System.out.println(s2);
      
      
    }
}
