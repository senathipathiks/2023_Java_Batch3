package Mapinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setandconsInjection.AddStudent;

public class App {

	public static void main(String[] args) {
		
	
	ApplicationContext context= new ClassPathXmlApplicationContext("map.xml");
	
	EmpAdd ea=(EmpAdd) context.getBean("empadd");
	
	ea.Display();
	
	
	}

}
