package com.abi.mavenday5.AssociationMapProject;

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
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Address adr = new Address();
        adr.setAid(1);
        adr.setStreet("Nehru Nagar");
        adr.setCity("Namakkal");
        
        Vehicle vh = new Vehicle();
        vh.setVid(1);
        vh.setVname("Hero");
        
        Vehicle vh1 = new Vehicle();
        vh1.setVid(2);
        vh1.setVname("Honda");
        
        List<Vehicle> vlist = new ArrayList();
        vlist.add(vh);
        vlist.add(vh1);
        
        
        UserDetails ud = new UserDetails();
        ud.setUid(1);
        ud.setUname("Abishek");
        ud.setAdrs(adr);
        ud.setVlist(vlist);
        
        Mobile mb = new Mobile();
        mb.setMid(1);
        mb.setBrand("Samsung");
        mb.setModel("F54");
        mb.setUd(ud);
        
        session.persist(ud);
        session.persist(mb);
        t.commit();
        
    }
}
