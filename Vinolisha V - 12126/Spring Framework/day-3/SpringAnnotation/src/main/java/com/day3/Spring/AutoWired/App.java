package com.day3.Spring.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AutoWiredAppConfig.class);
        		
        		Student s1=(Student) context.getBean("Student",Student.class);
        		
        		s1.getDetails().setFatherName("Vijaya Kumar G");
        		s1.getDetails().setMotherName("Shahila Y");
        		
        		System.out.println(s1);
        		System.out.println(s1.getDetails());
        		
    }
}
