package com.day1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//       Vehicle v1= (Vehicle) context.getBean("b1");
//       v1.run();
//     
//       Vehicle v2= new 	Car();
//       v2.run();
    	
    	Student s1=(Student) context.getBean("Student");
    }
}
