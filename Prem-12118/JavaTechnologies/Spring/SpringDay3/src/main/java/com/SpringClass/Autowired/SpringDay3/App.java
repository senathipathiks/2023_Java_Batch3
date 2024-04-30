package com.SpringClass.Autowired.SpringDay3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Customer c=(Customer) context.getBean("per1");
 c.display();
    }
}
