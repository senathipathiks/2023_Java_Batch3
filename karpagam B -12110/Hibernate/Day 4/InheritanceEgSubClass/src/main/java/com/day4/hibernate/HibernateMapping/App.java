package com.day4.hibernate.HibernateMapping;



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
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        

        Employee e2=new RegularEmp(101,"Kamini",2000.00f,1000);
        Employee e3=new ContractEmp(102,"Pavi",500.00f,"1 Years");

        
      session.save(e2);
      session.save(e3);
      t.commit();
      System.out.println("Done !!");

        
        
        
    }
}
