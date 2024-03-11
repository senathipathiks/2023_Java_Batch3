package com.abi.day3.SpringD3Annto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Exmp1 s1 = (Exmp1) context.getBean("student", Exmp1.class);
        
        s1.getDetails().setFatherName("Kumar");
        s1.getDetails().setMotherName("Maha");
        
        System.out.println(s1);
        System.out.println(s1.getDetails());
    }
}
