package com.day5.IntroHibernateMap;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
       Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory fact=cfg.buildSessionFactory();
       Session s=fact.openSession();
       Transaction t=s.beginTransaction();
       Employee e1=new RegularEmp(103,"hemz",12500.00f,1000);
       Employee e2=new ContractEmp(104,"sena",125.00f,"3 years");
       
       s.persist(e1);
       s.persist(e2);
       t.commit();
    }
}
