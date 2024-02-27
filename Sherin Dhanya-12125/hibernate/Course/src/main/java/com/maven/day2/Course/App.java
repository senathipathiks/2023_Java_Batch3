package com.maven.day2.Course;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maven.day2.Course.Course;

public class App 
{
	public static void main( String[] args )
    {

        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.getTransaction();
        
        Scanner sc= new Scanner(System.in);
        
        do {
        	System.out.println("Enter the option\n 1. Add values \n 2. Delete values \n 3.Update values \n 4.Search values \n 5.View all data");
        	int val = sc.nextInt();
        	switch(val) {
        	case 1:{
        		System.out.println("Enter  Course Id , Course name,  Course Type");
        		Course cor =new Course(sc.nextInt(), sc.next(), sc.next());
        		t.begin();
        		session.save(cor);
        		t.commit();
        		System.out.println("Inserted Successfully");
        		
        	}
        	case 2:{
        		System.out.println("Enter the Course Id to delete");
        		int id=sc.nextInt();
        		cor=session.find(Course.class, id);
        		session.delete(cor);
        		t.commit();
        			
        		}																										
        		
        	}
        	case 3:{
        		System.out.println("Enter the");
        	}
        	}
        }while(true);
        
}
}