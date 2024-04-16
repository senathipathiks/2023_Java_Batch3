package com.Spring.Day1.Example1ForSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//        BeanFactory context=new ClassPathXmlApplicationContext("Config.xml");
          Student obj1=(Student)context.getBean("s1");
          System.out.println(obj1);
       
          Student obj2=(Student)context.getBean("s2");
          System.out.println(obj2);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


