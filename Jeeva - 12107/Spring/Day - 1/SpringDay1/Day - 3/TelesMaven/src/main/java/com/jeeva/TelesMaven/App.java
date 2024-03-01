package com.jeeva.TelesMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	 @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	  
       	 Vehicle s2= (Vehicle) context.getBean("bike");
    	
       	 s2.ride();
        	
      
    }
}
