package com.day3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
   // Person p =(Person) context.getBean("person1");
    Customer c=(Customer) context.getBean("c1");
    c.display();
    context.close();
    }
}
