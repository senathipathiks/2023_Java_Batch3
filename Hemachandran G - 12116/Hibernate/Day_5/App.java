package com.tue.jpa.example1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.Query;

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

    	Random r = new Random();
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
//    	Transaction t = session.beginTransaction();
//    	
//    	for(int i = 1; i < 30; i++) {
//    		Employee emp = new Employee();
//    		emp.setEmpId(i);
//    		emp.setEmpName("Name"+i);
//    		emp.setSalary(r.nextFloat(20000));
//    		session.persist(emp);
//    	}
//    	
//    	t.commit();
    	
    	List<Employee> list = session.createQuery("from Employee ").list();
    	list.forEach((Employee t) -> System.out.println(t.toString()));
    	
    	// Aggregstr fn;
//    	Query query = session.createQuery("select count(empId) from Employee where salary>10000");
//    	List employee =(List) query.getResultList();
//    	
//    	for(Object count : employee) {
//    		System.out.println(count);
//    	}
    	
//    	Query query = session.createQuery("select sum(empId) from Employee ");
//    	Long employee =(Long) session.createQuery("select sum(empId) from Employee ").getSingleResult();
//    	System.out.println("Sum Of Employees"+employee);
//    	
//    	Query q = session.createQuery("update Employee set empname=:n where empId=:i");
//    	q.setParameter("n", "Heram");
//    	q.setParameter("i", 5);
//    	int status=q.executeUpdate();
//    	if (status>0) {
//    		System.out.println("Updated Successfully");
//    					
//		}
//    	else {
//    		System.out.println("Not Update !");
//    	}
//    	
//    	t.commit();
    	
    }
}
