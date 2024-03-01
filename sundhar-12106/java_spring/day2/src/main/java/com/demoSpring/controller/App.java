package com.demoSpring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demoSpring.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student s1 = (Student) context.getBean("s1");
//        System.out.println(s1);
//        s1.setAddress("Chennai");
//        System.out.println(s1);
//        Student s2 = (Student) context.getBean("s1");
//        System.out.println(s2);
       
        ((AbstractApplicationContext) context).close();
    }
}
