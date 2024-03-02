package com.sample.maven.AnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.bean.Student;
import com.sample.resources.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Student s1 = context.getBean("Student",Student.class);
       s1.getDetials().setfName("Subramani A");
       s1.getDetials().setmName("Anandhi S");
       System.out.println(s1.toString());
       System.out.println(s1.getDetials().toString());
    }
}
