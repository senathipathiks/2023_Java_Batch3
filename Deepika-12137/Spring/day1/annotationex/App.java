package com.day1.annotationex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	
       
//       Person p= (Person) context.getBean("per");
       
       Customer c= (Customer)context.getBean("c1");
       
        c.display();
    }
}
