package com.day1.spring.Basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
       
//       Vehicle v1=(Vehicle) context.getBean("b1");
//       v1.run();
//       
//       Vehicle v2=new Car();
//       v2.run();
       
//       Student2 s1=(Student2) context.getBean("student2");
//       s1.display();

//       Student3 s3=(Student3) context.getBean("student");
//       s3.display();
       
//       Student4 s4=(Student4) context.getBean("student");
//       s4.display();
 
       Student5 s5=(Student5) context.getBean("student");
       s5.display();
       
    }
}
