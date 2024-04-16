package com.day3.Annotations.SpringAnnotations;

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
       ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
       
       Student s1=context.getBean("student",Student.class);
       
       s1.getDetails().setFatherName("Ashokkumar");
       s1.getDetails().setMotherName("Sangeetha");
       
       System.out.println(s1);
       System.out.println(s1.getDetails());
       
    }
}
