package com.jeeva.springDay1.SpringDay1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
 // this is for bike & car      
//    // here ApplicationContext reading the 	Config xml using ClassPathXmlApplicationContext
//    ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//    // the 12th line  is used to get the bean & use 
//    
//    // b1 & c1  is a bean 
//    Vehicle v1=(Vehicle) context.getBean("b1");	
//    v1.ride();
//    
//    Vehicle v2= (Vehicle) context.getBean("c1");
//    v2.ride();
//    
    
    	 // this is for Student   
    
   	 ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
  
   	 Student s2= (Student) context.getBean("c1");
	
   	 System.out.println(s2);
    	
    }
}
