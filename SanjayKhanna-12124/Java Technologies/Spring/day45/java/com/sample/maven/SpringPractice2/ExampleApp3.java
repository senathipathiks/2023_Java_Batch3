package com.sample.maven.SpringPractice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.example2.Employee;

public class ExampleApp3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");
		Employee e1 = (Employee) context.getBean("emp");
		e1.setEpmId(3);
		e1.setEmpName("Sanjai");
		e1.display();
		Employee e2 = (Employee) context.getBean("emp");
		e2.setEpmId(2);
		e2.display();
		

	}

}
