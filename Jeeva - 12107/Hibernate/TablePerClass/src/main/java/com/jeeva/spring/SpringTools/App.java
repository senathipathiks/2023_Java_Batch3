package com.jeeva.spring.SpringTools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();    	
    	
    	InheritEmp e1=new RegularEmp (50,"Allen",1030.0f,1070);
    	InheritEmp e2=new ContractEmp(60,"Eleven",1890.000f,"4 years");
    	//InheritEmp e3=new ContractEmp(70,"Stoowad",1077.00f,"4 years");
    	  
    	session.save(e1);
    	session.save(e2);
    	//session.save(e3);
    	t.commit();  
    	System.out.println("DuraiSingam");
    	
    	
    	
    	
    }
}
