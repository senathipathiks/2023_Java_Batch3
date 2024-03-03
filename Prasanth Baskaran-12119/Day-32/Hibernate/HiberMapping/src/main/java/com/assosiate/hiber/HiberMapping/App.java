package com.assosiate.hiber.HiberMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        LaptopBean l1 = new LaptopBean(121, "Lenovo");
     
        s.persist(l1);
        EmployeeBean e = new EmployeeBean(102,"Prashanth",l1);
        
        s.persist(e);
        t.commit();
        
    }

	
}
