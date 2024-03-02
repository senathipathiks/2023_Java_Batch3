package com.sample.maven.AnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.bean.Customer;
import com.sample.resources.CustomerConfig;
import com.sample.resources.PersonConfig;

public class CustomerApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
//		Customer c = context.getBean(Customer.class);
//		c.setCustomerId(17);
//		c.display();
		Customer c1 = (Customer) context.getBean("c1");
		c1.display();

	}

}
