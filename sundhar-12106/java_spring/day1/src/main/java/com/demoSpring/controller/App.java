package com.demoSpring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demoSpring.bean.Laptop;
import com.demoSpring.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("laptop.xml");
        
//        Laptop l = (Laptop) con.getBean("laptop");
//        Laptop l1 = (Laptop) con.getBean("laptop1");
//        
//        l.display();
//        l1.display();
        
        Student s1 = (Student) con.getBean("student");
        System.out.println(s1);
        
        Student s2 = (Student) con.getBean("s1");
        System.out.println(s2);
    }
}
