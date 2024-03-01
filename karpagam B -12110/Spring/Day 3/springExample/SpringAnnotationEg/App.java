package com.day3.springExample.SpringAnnotationEg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    
    Student s1=context.getBean("student",Student.class);
    
    s1.getDetails().setFatherName("Anand"); // here parent class is depend on student class, here autowired is used
    s1.getDetails().setMotherName("Selvi");
    
    System.out.println(s1);
    System.out.println(s1.getDetails());
    
    
    	
    }
}
