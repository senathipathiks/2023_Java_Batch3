package com.maven.day2;

import java.util.*;

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
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	Employee e1=new Employee();
    	boolean decision=true;
    
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	      SessionFactory factory=cfg.buildSessionFactory();
	      Session session=factory.openSession();
	      Transaction t=session.getTransaction();
    	
	      do {
	      	System.out.println("1.Create a User\n2.Update User\n3.Delete User\n4.Find All User");
	      	int input=sc.nextInt();
	      	
	      	switch (input) {
	  		case 1:			
	  			System.out.print("Enter employee name : ");
	  			e1.setEmpname(sc.next());
	  			System.out.print("Enter Role : ");
	  			e1.setEmprole(sc.next());
	  			System.out.print("Enter Salary : ");
	  			e1.setSalary(sc.nextInt());
	  			t.begin();
	  			session.save(e1);
	  			t.commit();
	  			System.out.println("Done");
	  			
	  			break;
	  			
	  		case 2:
	  			System.out.println("Enter the Id you want to update");
	  			int ele=sc.nextInt();
	  			Employee e2=session.find(Employee.class, ele);
	  			System.out.print("Enter the Updated name : ");
	  			e2.setEmpname(sc.next());
	  			t.begin();
	  			session.update(e2);
	  			t.commit();
	  			
	  			
	  			break;
	  			
	  		case 3:
	  			System.out.println("Enter the Id you want to delete");
	  			int del=sc.nextInt();
	  			Employee e3=session.find(Employee.class, del);
	  			
	  			t.begin();
	  			session.delete(e3);
	  			t.commit();
	  			
	  			break;
	  			
	  		case 4:
	  			List<Employee> emplist=session.createQuery("from Employee").list();
	          for (Employee e : emplist) {
	 			System.out.println(e);
	 		}
	  			
	  			break;
	  			
	  		case 5:
	  			System.out.println("Thank you");
	  			decision=false;
	  			break;

	  		default:
	  			break;
	  		}
			
		} while (decision);
    	
    	
    	
    	
//    	 Employee e1=new Employee();
//         
//
//         e1.setEmpname("Sathya");
//         e1.setEmprole("Developer");
//         e1.setSalary(1400);
//
//         
//         Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//         SessionFactory factory=cfg.buildSessionFactory();
//         Session session=factory.openSession();
//         Transaction t=session.beginTransaction();
//         
//         Employee e2=session.find(Employee.class, 1);
//         e2.setEmpname("Deepika");
//         session.update(e2);        
////         session.delete(temp);
//        
////         session.save(e1);
////         t.commit();
//         
//         List<Employee> emplist=session.createQuery("from Employee").list();
//         for (Employee e : emplist) {
//			System.out.println(e);
//		}
//         
//         System.out.println("Done");
         
    }
}
