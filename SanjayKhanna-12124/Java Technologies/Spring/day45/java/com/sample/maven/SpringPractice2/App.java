package com.sample.maven.SpringPractice2;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.lifecyce.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//        Student s1 = (Student) context.getBean("stu");
//        s1.setScity("Madurai");
//        System.out.println(s1.toString());
//        Student s2 = (Student) context.getBean("stu");
//        System.out.println(s2.toString());
        
        context.close();
        
    }
}
