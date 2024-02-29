package com.spring.day1.Project1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      
      Vehicle v1=(Vehicle) context.getBean("c1");
      v1.run();
      
      Vehicle v2=(Vehicle) context.getBean("b1");
      v2.run();
    }
}
