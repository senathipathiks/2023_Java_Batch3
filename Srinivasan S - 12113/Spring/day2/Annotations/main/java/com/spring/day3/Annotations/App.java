package com.spring.day3.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student s1=(Student)context.getBean("student",Student.class);
       
//        s1.getDetails().setFathername("Subramanian");
//        s1.getDetails().setMothername("Latha");
        
        System.out.println(s1);
        System.out.println(s1.getDetails());
       
    }
}
