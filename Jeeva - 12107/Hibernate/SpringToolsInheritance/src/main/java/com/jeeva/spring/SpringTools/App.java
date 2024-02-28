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
    	
    	InheritEmp e1=new RegularEmp (100,"Suriya",1000.0f,1000);
    	InheritEmp e2=new ContractEmp(200,"Steve",1000.000f,"2 years");
    	InheritEmp e3=new ContractEmp(300,"SteveBalu",10.000f,"2 years");
    	  
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	t.commit();  
    	System.out.println("DuraiSingam");
    	
    	
    	
    	
    }
}
