package com.scope.day_1.ScopesEx;

import javax.management.InvalidApplicationException;

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
//       Student s1=(Student)context.getBean("student");
//       s1.setScity("Chennai");
//       System.out.println(s1);
//       Student5 s3=(Student5)context.getBean("student5");
//       s3.display();
       ApplicationContext context1=new ClassPathXmlApplicationContext("Config.xml");
   	Student5 map=(Student5)context1.getBean("map");
   	map.display();
    }
}
