package com.abi.mavenday4.HibMapping;

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
       
       Employee e1 = new RegularEmp(101, "Abishek",100000.0f,1000);
       Employee e2 = new ContractEmp(104,"Arun",20000.0f,"2-years");
       session.save(e1);
       session.save(e2);
       t.commit();
    }
}
