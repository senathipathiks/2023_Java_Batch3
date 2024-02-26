package com.mini.mini;

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
    	
    	 Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();
         Transaction t = session.beginTransaction();
         Student s1 = new Student();
         
       System.out.println("Welcome to Student Database");
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Select the Action to perform"
       		+ "/n1.Add 2.Update 3.Delete 4.Find 5.View All");
       
       int choice = sc.nextInt();
       
       switch (choice) {
	case 1:
		
        System.out.println("Enter the Name : ");
        String name = sc.next();
        System.out.println("Enter the City : ");
        String city = sc.next();
        
        s1.setSname(name);
        s1.setScity(city);
        
       
        session.save(s1);
        t.commit();
        
		break;
	
	case 2:
	
		System.out.println("Enter the Student ID to update : ");
		int id = sc.nextInt();
		
		
		
        Student temp = session.find(Student.class, id );
        
        
        System.out.println("enter the Name to Update :");
        String uname = sc.next();
        temp.setSname(uname);
       
        session.update(temp);
      
        t.commit();
        
	case 3 : 
		
		System.out.println("enter the ID to Delete");
		
		int did = sc.nextInt();
		
		Student del = session.find(Student.class, did);
		session.delete(del);
		t.commit();
		
	case 4 :
		
		System.out.println("Enter the ID : ");
		
		int fid = sc.nextInt();
		
		Student store = session.find(Student.class, fid);
		
		break;
	
	case 5 :
		
		System.out.println("All details in Database");
		
		 List<Student> listed = session.createQuery("from Student").list();
         for(Student e:listed)
         {
        	 System.out.println(e);
         }
        
	default:
		break;
	}
    }
}
