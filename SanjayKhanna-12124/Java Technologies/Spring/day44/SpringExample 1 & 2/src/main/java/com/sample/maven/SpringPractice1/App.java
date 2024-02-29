package com.sample.maven.SpringPractice1;

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
//       Vehicle v1 = new Car();
//       v1.ride();
//       Vehicle v2 = new Bike();
//       v2.ride();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
//    	Vehicle v1 = (Vehicle) context.getBean("b");
//    	v1.ride();
//    	
//    	Vehicle v2 = (Vehicle) context.getBean("c");
//    	v2.ride();
    	
//    	Student s1 = (Student) context.getBean("stu");
//    	System.out.println(s1.toString());
    	
    	Student s1 = (Student) context.getBean("stu");
    	System.out.println(s1.toString());
    }
}
