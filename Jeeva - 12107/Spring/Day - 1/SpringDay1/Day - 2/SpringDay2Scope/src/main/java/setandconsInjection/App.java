package setandconsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("injection.xml");
	
		AddStudent student=(AddStudent)context.getBean("Consinjection");
		
		student.display();
	
	}
}
