package Hashset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("configpackgday2.xml");
		
		Student s1=(Student) context.getBean("Student");
		
		s1.setScity("Chennai");
		System.out.println(s1);
		
		Student s2=(Student) context.getBean("Student");
		System.out.println(s2);
		
		
	}
}
