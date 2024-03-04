package com.day1.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    		   
       Student s1=(Student) context.getBean("student", Student.class);
       
       s1.getDetails().setFatherName("Suresh");
       s1.getDetails().setMotherName("Gomathi");
       
       System.out.println(s1);
       System.out.println(s1.getDetails());
    }
}
