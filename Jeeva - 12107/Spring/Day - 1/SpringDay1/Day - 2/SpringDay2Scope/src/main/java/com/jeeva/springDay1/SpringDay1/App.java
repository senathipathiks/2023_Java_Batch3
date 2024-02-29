package com.jeeva.springDay1.SpringDay1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext context= new ClassPathXmlApplicationContext("scope.cfg.xml");	
 
    Student student1=(Student)context.getBean("studentscope");
    
    student1.setStudentCity("Tokyo");
    System.out.println(student1);
    
    Student student2=(Student)context.getBean("studentscope");
    System.out.println(student2);
    
    
    }
}
