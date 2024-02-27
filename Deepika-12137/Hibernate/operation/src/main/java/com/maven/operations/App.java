package com.maven.operations;
 
import java.util.List;
import java.util.Scanner;

import javax.naming.ConfigurationException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


 
 

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
	  String msg=null;
 
  	do {
 
    	  System.out.println("1.insert\n2.delete\n3.update\n4.select \n5.exit");
    	  Scanner sc= new Scanner(System.in);
    	  System.out.println("Enter your choice");
    	  int k=sc.nextInt();

    	  switch(k) {
    	  case 1:
    		  System.out.println("Enter name: ");
    		  Operation e1=new Operation();
    		  String name=sc.next();
              e1.setMovieName(name);
    	      session.save(e1);
    	      System.out.println("Inserted successfully"); 
    	     t.commit(); 
    	      break;

    	  case 2:
    		  System.out.println("Enter id:");
    		  int id1=sc.nextInt();
    		  Operation e2=session.find(Operation.class, id1);
    	      session.delete(e2);
    	      System.out.println("deleted successfully");
    	      t.commit();
    	      break;
    	  case 3:
    		  System.out.println("Enter Ticketid:");
    		  int id2=sc.nextInt();
    		  String name1=sc.next();
    		  Operation temp=session.find(Operation.class, id2);
    	       temp.setMovieName(name1);
    	      session.update(temp);
    	      System.out.println("Updated successfully");
    	         t.commit();
    	         break;
    	  case 4:
    		  List<Operation> empList=session.createQuery("from Employee").list();
    	      for(Operation e:empList)
    	      {
    	    	System.out.println(e);  
    	      }
    	      System.out.println("Done");
    	      break;
    	  case 5:
    		  System.out.println("Exit");
    		  break;
    	  }
    	  System.out.println("do you want to continue[yes/no]");
    	  msg=sc.next();
		}while (msg.equals("yes"));
  	    System.out.println("Terminated");

      }
    }
 
