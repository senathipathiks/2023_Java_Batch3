package com.day5.ManyToOneMap;

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
       Department l1=new Department(121,"Marketing");
       Department l2=new Department(122,"sales");
       Employee e1 = new Employee(101,"kiruba",l1);
       Employee e2 = new Employee(102,"jothi",l1);
       Employee e3 = new Employee(103,"sundhar",l2);
       s.persist(e1);
       s.persist(e2);
       s.persist(e3);
       
       t.commit();
    }
}
