package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext	context= new ClassPathXmlApplicationContext("autowiring.cfg.xml");
     
    Bike b= (Bike)context.getBean("bike");
    
    b.ride();
    
    }
}
