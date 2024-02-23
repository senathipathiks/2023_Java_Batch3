package com.hibernate.mavenday1.AnnotationStudent;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.mavenday1.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	do {
    		System.out.println("1.insert 2.update 3.delete 4.findall 5.find");
    		System.out.println("enter operation number:");
    		int operation = sc.nextInt();
    	
    	switch(operation) {
    	case 1:
    		Employee s1 = new Employee(107, "Vignesh");
        	session.persist(s1);
        	t.commit();	
//        	System.out.println("done");
        	break;
    	case 2:
    		Employee s2 = new Employee();
        	Employee temp = session.find(Employee.class,106);
        	System.out.println(temp);
        	temp.setName("Surya");
        	session.update(temp);
        	t.commit();
        	break;
    	case 3:
    		Employee s3 = new Employee();
    		Employee temp1 = session.find(Employee.class,105);
        	session.delete(temp1);
        	t.commit();
        	break;
    	case 4:
    		List<Employee> empList=session.createQuery("from Employee").list(); //here Employee is class name
        	for(Employee e:empList)
        	{
        		System.out.println(e);
        	}
        	break;
    	case 5:
    		Employee temp2 = session.find(Employee.class,106);
        	System.out.println(temp2);
    	break;
    		
    	}
    	}while(true);
//    	Employee s1 = new Employee(106, "Prem");
//    	Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
//    	SessionFactory factory=cfg.buildSessionFactory();
//    	Session session=factory.openSession();
//    	Transaction t=session.beginTransaction();
//    	session.persist(s1);
//    	t.commit();
//    	Employee s1 = new Employee();
//    	Employee temp = session.find(Employee.class,105);
//    	System.out.println(temp);
//    	temp.setName("Bala");
//    	session.update(temp);
//    	t.commit();
    	
//    	Employee temp = session.find(Employee.class,105);
//    	session.delete(temp);
//    	t.commit();
//    	List<Employee> empList=session.createQuery("from Employee").list(); //here Employee is class name
//    	for(Employee e:empList)
//    	{
//    		System.out.println(e);
//    	}
    	
    }
  
}
