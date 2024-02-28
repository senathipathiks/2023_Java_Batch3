package com.Spring.HibernateMapping.HibernateMapping;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction t=session.beginTransaction();
         
       
        Address a1=new Address();
        a1.setId(101);
        a1.setStreet("Villukuri");
        a1.setCity("Nagercoil");
        a1.setPincode(21980);
        
        Vehicle v1=new Vehicle();
        v1.setId(222);
        v1.setName("Car");
        
        Vehicle v2=new Vehicle();
        v2.setId(333);
        v2.setName("Bike");
        
        List<Vehicle> vehicle=new ArrayList<Vehicle>();
        vehicle.add(v2);
        vehicle.add(v1);
        
        User u1=new User();
        u1.setId(12126);
        u1.setName("Vino");
        u1.setAddress(a1);
        u1.setVehicle(vehicle);
        
        Mobile m1=new Mobile();
        m1.setId(2);
        m1.setBrand("Apple");
        m1.setModel("15");
        m1.setUid(u1);
        
        session.persist(u1);
        session.persist(m1);
        
         t.commit();
         session.close();
     
    }
}
