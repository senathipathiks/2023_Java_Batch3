package com.sample.maven.AnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.bean.Person;
import com.sample.resources.PersonConfig;

public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p1 = context.getBean("p1",Person.class);
		System.out.println(p1);
		

	}

}
