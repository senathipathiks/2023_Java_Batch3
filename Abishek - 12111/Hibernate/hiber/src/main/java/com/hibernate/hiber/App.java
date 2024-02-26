package com.hibernate.hiber;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
    	
    	String msg;
    	
    
    	
    	//Transaction t = session.beginTransaction();
    	
    	 
//--------------------------------------------------------------------------------------------    	
    	//Insert-Operation
    	
    	do {
    		System.out.println("1.Insert\n 2.Update\n 3.Delete\n 4.find\n 5.Find-All\n 6.Exit");
        	System.out.println("Enter Your Choice:");
        	Scanner sc = new Scanner(System.in);
        	int input = sc.nextInt();
        	
        	
        	
        	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        	SessionFactory factory = cfg.buildSessionFactory();
        	Session session = factory.openSession();
        	Transaction t = session.beginTransaction();
        	
        	

    	switch(input) {
    	
    	
    	case 1:
    	{	
    	
        Customer cus = new Customer();		
      	cus.setCustname("Alien");
     	cus.setCustphno("8");
   	    session.save(cus);
   	    t.commit();
   	    break;
   	    }
   	
   	
    	
 
    	
//-----------------------------------------------------------------------------------------    	
    	//Update - Method
    	
    	case 2:
    	{
    	Customer temp = session.find(Customer.class, 2);
    	temp.setCustname("Abizzzzz");
    	temp.setCustphno("3333333333");
    	session.update(temp);
    	t.commit();
    	break;
    	}
    	
    	
//------------------------------------------------------------------------------------------    	
    	
    	// Delete - Method
    	
    	case 3:
    	{
    	Customer temp = session.find(Customer.class, 4);
    	session.delete(temp);
        t.commit();
        break;
        }
    	
    	
    	
//--------------------------------------------------------------------------------------------    	
    	//Find-All Method
    	
    	case 5:
    		
    	{	
    	List<Customer> custList = session.createQuery("from Customer").list();
   	
    	for(Customer e : custList) {
    		System.out.println(e);
    	}
    	t.commit();
    	break;
    	}
    	
    	
    	
//-----------------------------------------------------------------------------------------    	
    	//Find - Operation
    	
    	case 4:
    	{
    		
    	Customer temp = session.find(Customer.class, 4);
    	System.out.println(temp);
    	t.commit();
    	break;
    	}
    	
    	case 6:
    	{
    		System.exit(0);
    		break;
    	}
    	
    	default:
    	{
    		System.out.println("Invalid Input");
    		break;
    	}
    	
    	
        
    	
    	}
    	System.out.println("Do You Want to Continue yes or no");
    	msg = sc.next();
    	}
    	while(msg.equals("yes"));
    	
    }
}