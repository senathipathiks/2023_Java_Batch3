package com.spring.annot2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		
		   // Office o    =  (Office) c.getBean("office");
		   
		
		Staff s = c.getBean(Staff.class);
		     
		    s.display();
		    
		    System.out.println(s);
		   

	}

}
