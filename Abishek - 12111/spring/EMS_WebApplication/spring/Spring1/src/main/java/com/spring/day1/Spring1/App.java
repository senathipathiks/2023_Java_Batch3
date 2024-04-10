package com.spring.day1.Spring1;
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
    	
    	
        Vehicle v1 = (Vehicle)context.getBean("c1");
        v1.ride();
        Vehicle v2 =(Vehicle)context.getBean("b1");
        v2.ride();
    }
}
