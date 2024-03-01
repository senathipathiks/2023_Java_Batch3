package com.day5.controller;

import java.util.ArrayList;
import java.util.List;

import com.day5.bean.Address;
import com.day5.bean.Mobile;
import com.day5.bean.User;
import com.day5.bean.Vehicle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		List<Vehicle> vl = new ArrayList<Vehicle>();
		List<Mobile> ml = new ArrayList<Mobile>();
		List<User> ul = new ArrayList<User>();
		
		Mobile m1 = new Mobile();
		m1.setBrand("Vivo");
		m1.setModel("V23");
		Mobile m2 = new Mobile();
		m2.setBrand("Iphone");
		m2.setModel("15");
		
		Vehicle v1 = new Vehicle();
		v1.setVname("Hero");
		Vehicle v2 = new Vehicle();
		v2.setVname("Bajaj");
		
		
		
		Address a1 = new Address();
		a1.setCity("New York");
		a1.setStreet("wellington");
		
		User u1 = new User();
		u1.setUname("Prasanth");
		u1.setAddress(a1);
		u1.setMobile(ml);
		u1.setVehicles(vl);
		
		
		m1.setUser(u1);
		m2.setUser(u1);
		
		v1.setUser(ul);
		v2.setUser(ul);
		
		ul.add(u1);
		
		vl.add(v1);
		vl.add(v2);
		
		ml.add(m1);
		ml.add(m2);
		
		
		t.begin();
		em.persist(u1);
		t.commit();
		
		
	}
}
