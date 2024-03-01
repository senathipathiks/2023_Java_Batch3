package com.Spring.Day2.SpringDay2LifeCycleBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	context.close();
    }
}
