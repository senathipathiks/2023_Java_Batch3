package com.relatioship.day1.EmployeeProject;



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
       
//       Department d1=new Department(1,"Sales");
//       Department d2=new Department(142,"Marketing");
//       
//       Employee e1=new Employee(201,"Appu",d1);
//       Employee e2=new Employee(203,"Samu",d1);
//       Employee e3=new Employee(204,"Maha",d2);
//       session.persist(e1);
//       session.persist(e2);
//       session.persist(e3);
       
       Employee1 e1=new RegularEmp(10,"Varshie",10000.00f,1000);
       Employee1 e2=new ContractEmp(20,"Kamali",1000.00f,"2 years");
       session.save(e1);
       session.save(e2);
       
       t.commit();
       System.out.println("Success");
    }
}
