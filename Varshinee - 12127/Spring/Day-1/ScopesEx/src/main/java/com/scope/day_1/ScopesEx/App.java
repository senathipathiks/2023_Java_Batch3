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
       Student s1=(Student)context.getBean("student");
       s1.setScity("Chennai");
       System.out.println(s1);
       Student s2=(Student)context.getBean("student");
       System.out.println(s2);
       
    }
}
