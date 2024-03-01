package com.day3.annoteg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
	  // for annotation based application we use this
	  AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
	  
//	  Person p1=(Person) context.getBean("person",Person.class);
//	  System.out.println(p1);

	  Customer c1=(Customer) context.getBean("cus",Customer.class);
	  
      c1.display();	  
	  
			  
}
	
}
