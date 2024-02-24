package com.hibernate.mavenday2.EmployeeEX;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
	  String msg=null;

//      ===========================Insert
//      Employee e1=new Employee();
//      
//      e1.setName("Magesh");
//      session.save(e1);
//      t.commit();
      
//      ==========================Update
//      Employee temp=session.find(Employee.class, 3);
//      temp.setName("Hari");
//      session.update(temp);
//         t.commit();

//      =====================Delete
//      Employee e2=session.find(Employee.class, 5);
//      session.delete(e2);
//      t.commit();
//      =============Shows table list
//      List<Employee> empList=session.createQuery("from Employee").list();
//      for(Employee e:empList)
//      {
//    	System.out.println(e);  
//      }
//      System.out.println("Done");
      
//      ===========================Switch
  	do {

    	  System.out.println("1.insert\n2.delete\n3.update\n4.select \n5.exit");
    	  Scanner sc= new Scanner(System.in);
    	  System.out.println("Enter your choice");
    	  int k=sc.nextInt();
    	
			
    	  switch(k) {
    	  case 1:
    		  System.out.println("Enter name: ");
    		  Employee e1=new Employee();
    		  String name=sc.next();
              e1.setName(name);
    	      session.save(e1);
    	      System.out.println("Inserted successfully"); 
    	     t.commit(); 
    	      break;
    	       
    	      
    	  case 2:
    		  System.out.println("Enter id:");
    		  int id1=sc.nextInt();
    		  Employee e2=session.find(Employee.class, id1);
    	      session.delete(e2);
    	      System.out.println("deleted successfully");
    	      t.commit();
    	      break;
    	  case 3:
    		  System.out.println("Enter id:");
    		  int id2=sc.nextInt();
    		  String name1=sc.next();
    		  Employee temp=session.find(Employee.class, id2);
    	       temp.setName(name1);
    	      session.update(temp);
    	      System.out.println("Updated successfully");
    	         t.commit();
    	         break;
    	  case 4:
    		  
    		  List<Employee> empList=session.createQuery("from Employee").list();
    	      for(Employee e:empList)
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

