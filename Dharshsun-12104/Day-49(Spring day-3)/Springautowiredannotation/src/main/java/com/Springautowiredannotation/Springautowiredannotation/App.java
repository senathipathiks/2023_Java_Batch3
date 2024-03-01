package com.Springautowiredannotation.Springautowiredannotation;

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
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Student s1 = (Student) context.getBean("student",Student.class);
    	s1.getDetails().setFatherName("Srinivasan");
    	s1.getDetails().setMotherName("Meerabai");
    	
    	System.out.println(s1);
    	System.out.println(s1.getDetails());
    }
}
