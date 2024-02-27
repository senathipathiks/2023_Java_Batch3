package com.sampleofsat.mavenproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sampleofsat.mavenproj.Person;

public class App 
{
    public static void main( String[] args )
    {
    	 Person pe = new Person("Heram",22,7449027175l,"Chennai");
         Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction t=session.getTransaction();
         t.begin();
//         session.update(e);
         session.save(pe);
         t.commit();
    }
}
