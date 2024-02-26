package com.hibernate.day1;

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
    	
    	Scanner sc=new Scanner(System.in);
    	
    	Course c=new Course();
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Course.class);
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	
    	boolean task=true;
    	
    	while(task) {
    	
    	System.out.println("Welcome to Course Page");
    	System.out.println("1.Add \n2.Delete \n3.U-p-date \n4.View \n5.ViewAll \5Exit Applicatio*-");
    	System.out.println("Select your choice");
    	int choice=sc.nextInt();
    	
    	switch (choice) {
		case 1:
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the Address");
			String addr=sc.next();
			System.out.println("Enter the Salary");
			float sal=sc.nextFloat();
			c.setId(id);
			c.setName(name);
			c.setAddress(addr);
			c.setSalary(sal);
			session.save(c);
			t.commit();
			
			break;
		
		case 2:
			System.out.println("Enter the Id");
			int id1=sc.nextInt();
			c =session.find(Course.class, id1);
			session.delete(c);
			t.commit();
			
			break;
			
		case 3:
			System.out.println("Enter the Id");
			int id2=sc.nextInt();
			c=session.find(Course.class, id2);
			
			System.out.println("Enter the name");
			String name1=sc.next();
			System.out.println("Enter the Address");
			String addr1=sc.next();
			System.out.println("Enter the Salary");
			float sal1=sc.nextFloat();
			
			c.setName(name1);
			c.setAddress(addr1);
			c.setSalary(sal1);
			session.save(c);
			t.commit();
			
			break;
			
		case 4: //view details
			System.out.println("Enter the id want to view");
			int id3=sc.nextInt();
			c=session.find(Course.class, id3);
			System.out.println(c);
			
			break;
			
			
		case 5: //viewall details
	    	List<Course> courseList=session.createQuery("from Course").list();
	    	for(Course c1 : courseList) {
				System.out.println(c1);
			}
	    	
	    	break;
	    	
		case 6:
			System.out.println("Thanks for using the application");
			System.exit(0);
			task=false;

		default:
			System.out.println("Select the correct choice");
			break;
		}
    	
    	
    		
    	
    	
    	}
    	
    }
}
