package com.jeeva.annotations;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Confi.class);
	// it will create container (11)
	
	//Person p=(Person) context.getBean("per1");
	
//	Customer c=(Customer)context.getBean(Customer.class);//  execution time turn class in to bean and assign to customer
	Customer c=(Customer)context.getBean("cus1");
	// in the 17th line y we are not give customer.class like 16h line because we created bean in config so it will think it duplicate
	c.totring();
	
	}
}
