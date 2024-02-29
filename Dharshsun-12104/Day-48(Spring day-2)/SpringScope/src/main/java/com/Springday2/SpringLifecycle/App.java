package com.Springday2.SpringLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Springday2.SpringScope.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//    	Student3 s = (Student3)context.getBean("Student3");
//    	System.out.println(s2);
    	ApplicationContext context = new ClassPathXmlApplicationContext("Employeeconfig.xml");
    	Employee e = (Employee)context.getBean("employee");
    	e.display();
    }
}
