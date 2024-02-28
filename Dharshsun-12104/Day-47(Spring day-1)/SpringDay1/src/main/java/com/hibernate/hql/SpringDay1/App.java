package com.hibernate.hql.SpringDay1;

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
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//    	Vehicle v1 = new Car(); //reducing dependencies on car and bike by using Vehicle interface.
    	Vehicle v1 = (Vehicle)context.getBean("b1"); //getting spring from container.
    	v1.run();
//    	Vehicle v2 = new Bike();
    	Vehicle v2 = (Vehicle)context.getBean("c1");
    	v2.run();
    }
}
