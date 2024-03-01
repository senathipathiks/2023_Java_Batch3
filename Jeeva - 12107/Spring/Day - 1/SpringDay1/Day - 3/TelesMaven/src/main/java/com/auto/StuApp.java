package com.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StuApp {

	public static void main(String[] args) {
		
	
	 ApplicationContext	context= new AnnotationConfigApplicationContext(StudentConfig.class);
    
	 Student s1=(Student)context.getBean("stu",Student.class);
	 s1.getDeatils().setFatherName("Appa");
	 s1.getDeatils().setMotherName("Amma");
	
	 System.out.println(s1.getDeatils());
	 
	}
}
