package com.day3.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       
    	Student s1=(Student)context.getBean("student",Student.class);
       
    	s1.getDetails().setFatherName("Siva");
    	s1.getDetails().setMotherName("valli");
       
    	System.out.println(s1);
    	System.out.println(s1.getDetails());
    	
       
    }
}
