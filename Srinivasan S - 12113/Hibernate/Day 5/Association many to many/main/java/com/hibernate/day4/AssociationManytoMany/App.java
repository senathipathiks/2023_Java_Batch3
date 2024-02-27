package com.hibernate.day4.AssociationManytoMany;

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
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        Employee emp1=new Employee();
        emp1.setEroll(113);
        emp1.setName("Sundar");
       
        Project proj1=new Project();
        proj1.setpId(002);
        proj1.setpName("Hospital Management System");
        
     // employee can work on two projects, Add project references in the employee
        emp1.getProjects().add(proj1);
        
     // Add employee reference in the projects
        proj1.getEmp().add(emp1);
        
        session.persist(emp1);
        session.persist(proj1);
        
        t.commit();
        session.close();
        		
    }
}
