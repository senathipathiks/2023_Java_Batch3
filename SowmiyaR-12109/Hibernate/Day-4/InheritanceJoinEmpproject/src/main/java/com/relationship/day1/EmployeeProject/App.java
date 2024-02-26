package com.relationship.day1.EmployeeProject;

import java.util.ArrayList;

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
	public static void main(String[] args) {
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
     Transaction t=session.beginTransaction();
     
      
//     Department d1=new Department(001,"sales");
//     Department d2=new Department(002,"marketing");
//     
//    Employee e1=new Employee(005,"Charan",d1);
//    Employee e2=new Employee(006,"Sowmi",d1);
//    Employee e3=new Employee(007,"Hari",d2);
//    
//    session.persist(e1);
//    session.persist(e2);
//    session.persist(e3);
//    t.commit();
//    -----------------------------------------------------
    
     
     
     Employee1 e1=new RegularEmp(101,"Hari",10000.00f,1000);
     Employee1 e2=new ContractEmp(102,"Charan",1000.00f,"2 years");
     session.save(e1);
     session.save(e2);
     t.commit();
     System.out.println("Success");
}
}
