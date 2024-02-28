package com.day5.HibernateMapping.HibernateMappingAll;

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
        Session session =factory.openSession();
        Transaction t=session.beginTransaction();
        
        User user1=new User();
        User user2=new User();
        user1.setUserName("Kaviya");
        user2.setUserName("Sri");
        
        Address add1=new Address();
        add1.setStreet("Anna Nagar");
        add1.setCity("chennai");
        Address add2=new Address();
        add2.setStreet("kk nagar");
        add2.setCity("Nellai");
        
        //one to one relation -->one user having one address and one address having one user
        user1.setAddress(add1);
        user2.setAddress(add2);
        add1.setUser(user1);
        add2.setUser(user2);

 // -------------------------------------------------------------------
        
        Vehicle veh1=new Vehicle();
        veh1.setName("car");
        Vehicle veh2=new Vehicle();
        veh2.setName("bus");
        Vehicle veh3=new Vehicle();
        veh3.setName("Bicycle");
        Vehicle veh4=new Vehicle();
        veh4.setName("Bike");
        
        
        Mobile mob1=new Mobile();
        mob1.setBrand("Redmi");
        mob1.setModel("Redmi 9");
        Mobile mob2=new Mobile();
        mob2.setBrand("Galaxy");
        mob2.setModel("Galaxy S23 ultra");
        Mobile mob3=new Mobile();
        mob3.setBrand("OnePlus");
        mob3.setModel("note 7");
        
 //------------------------------------------------------------------------
        // one to many -->one user have multiple mobile
        user1.getMobile().add(mob1);
        user1.getMobile().add(mob2);
        
        //many to one -->multiple phone have same user
        mob1.setUser(user1);
        mob2.setUser(user1);
        
        user2.getMobile().add(mob3);
        mob3.setUser(user2);
        
       //many to many -->one user having multiple vehicle  && different vehicle having same user
        user1.getVehicle().add(veh1);
        user1.getVehicle().add(veh2);
        veh1.getUser().add(user1);
        veh2.getUser().add(user1);
        
        user2.getVehicle().add(veh3);
        user2.getVehicle().add(veh4);
        veh3.getUser().add(user2);
        veh4.getUser().add(user2);
        
        session.save(user1);
        session.save(user2);
        t.commit();
        session.close();
        
       }
}
