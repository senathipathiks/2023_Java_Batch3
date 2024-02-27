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
        
        Department d1=new Department(123,"sales");
        Department d2=new Department(124,"Finance");
        Employee e1=new Employee(107,"vinitha",d2);
        Employee e2=new Employee(108,"kaviya",d1);
        Employee e3=new Employee(109,"jovika",d1);
        
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        t.commit();


        
        

        
            }
}
