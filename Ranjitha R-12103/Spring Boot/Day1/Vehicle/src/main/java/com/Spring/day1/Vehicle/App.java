package com.Spring.day1.Vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        Vehicle obj=new Car();
//        obj.run();
//        Vehicle obj1 =new Bike();
//        obj1.run();

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Vehicle v1 = (Vehicle) context.getBean("bike");
		v1.run();
		Vehicle v2 = (Vehicle) context.getBean("car");
		v2.run();
	}
}
