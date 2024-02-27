package com.hibernate.day2.My_demohb_project;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Product p1 = new Product();
    	
    	p1.setpName("Kanchipuram Silk Saree");
    	p1.setpPattern("Mithari pattern");
    	p1.setPrice(55050);
    	
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	
    	//Update
//    	Product p = s.find(Product.class, 1);
//    	p.setPrice(60000);
//    	s.update(p);
    	
    	
    	//Delete
//    	Product temp = s.find(Product.class, 1);
//    	s.delete(temp);
    	
//    	s.save(p1);
//    	t.commit();
//    	
//    	t.begin();
//    	
//    	Product p2 = new Product();
//    	p2.setpName("Anarkali Chudi");
//    	p2.setpPattern("Kalamkari");
//    	p2.setPrice(1500);
//    	
//    	s.save(p2);
//    	t.commit();
    	
    	List<Product> proList= s.createQuery("from Product").list();
    	for(Product p:proList) {
    		System.out.println(p);
    	}
    	System.out.println("Done");
    }
}
