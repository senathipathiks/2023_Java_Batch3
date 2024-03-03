package com.assosiate.hiber3.Many_To_Many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.getTransaction();
        
		//user class
		
		User u = new User();
		User u2 = new User();
		
		u.setUserName("Prasanth");
		u2.setUserName("Surya");
		
		//Address
		
		Address a = new Address();
		a.setStreet("TTP");
		a.setCity("TVR");
		
		Address a1 = new Address();
		
		a1.setStreet("Arani");
		a1.setCity("Tmalai");
		
		
		//Mobile
		
		Mobile m = new Mobile();
		m.setBrand("Redmi");
		m.setModel("Note 10");
		
		Mobile m1 = new Mobile();
		
		m1.setBrand("Vivo");
		m1.setModel("V 19");
		
		
		//Vehicle
		
		Vehicle v = new Vehicle();
		v.setName("Honda");
		
		Vehicle v1 = new Vehicle();
		v1.setName("Pulsur");
		
		//user - add
		
		u.setAddress(a);
		u2.setAddress(a1);
		a.setUser(u);
		a1.setUser(u2);
		
		// user - mobile
		
		u.getMobile().add(m);
		u2.getMobile().add(m1);
		
		m.setUser(u);
		m1.setUser(u2);
		
		// user - vehicle
		
		u.getVehicle().add(v);
		u2.getVehicle().add(v1);
		
		v.getUser().add(u);
		v1.getUser().add(u2);
		
		
		t.begin();
		s.persist(u);
		
		s.persist(u2);
		t.commit();
		s.close();

	}
}
