package com.day1.springExample.SpringEg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	// we can use either ApplicationContext or BeanFactory
//    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 
    	
		BeanFactory context=new ClassPathXmlApplicationContext("config.xml");

    	
    	
//    	Vehicle v1=(Vehicle) context.getBean("b1"); // We use bean in our app using getBean method
//    	v1.run();
//    	Vehicle v2=(Vehicle) context.getBean("c1");
//    	v2.run();
//    	
    	
    	Student s1=(Student) context.getBean("s1");
    	System.out.println(s1);
    	
    	Student s2=(Student) context.getBean("c1");
    	System.out.println(s2); // it will call default empty constructor
    			
    	Student s3=(Student) context.getBean("c2");
    	System.out.println(s3); // it will call parameterized constructor
    			
    }
    
}
