package com.Employee.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

         
       
         
         User user=new User();
 		User user2=new User();
 		user2.setUserName("Dev");
 		user.setUserName("Ankit");
 		
 		Address address= new Address();
 		address.setStreet("sector 15");
 		address.setCity("noida");
 		Address address2=new Address();
 		address2.setCity("Muzaffarpur");
 		address2.setStreet("sahebganj");
 		
 		
 		Vehicle veh=new Vehicle();
 		veh.setName("car");
 		Vehicle vehicle=new Vehicle();
 		vehicle.setName("jeep");
 		Vehicle vehicle2= new Vehicle();
 		vehicle2.setName("Bike");
 		Vehicle vehicle3= new Vehicle();
 		vehicle3.setName("Bus");
 		Vehicle vehicle4=new Vehicle();
 		vehicle4.setName("cycle");
 		Vehicle vehicle5= new Vehicle();
 		vehicle5.setName("Truck");
 		
 		Mobile mobile =new Mobile();
 		mobile.setBrand("sony");
 		mobile.setModel("xperia z3");
 		Mobile mobile2 = new Mobile();
 		mobile2.setBrand("Redmi");
 		mobile2.setModel("Note 5 pro");
 		Mobile mobile3 = new Mobile();
 		mobile3.setBrand("Nokia");
 		mobile3.setModel("7 plus");
 		
 		user.setAddress(address);
 		user2.setAddress(address2);
 		address.setUser(user);
 		address2.setUser(user2);
 		
 		user.getMobile().add(mobile);
 		user.getMobile().add(mobile2);
 		mobile.setUser(user);
 		mobile2.setUser(user);
 		user2.getMobile().add(mobile3);
 		mobile3.setUser(user2);
 		
 		user.getVehicle().add(veh);
 		user.getVehicle().add(vehicle);
 		user.getVehicle().add(vehicle2);
 		veh.getUser().add(user);
 		vehicle.getUser().add(user);
 		vehicle2.getUser().add(user);
 		user2.getVehicle().add(vehicle3);
 		user2.getVehicle().add(vehicle4);
 		user2.getVehicle().add(vehicle5);
 		vehicle3.getUser().add(user2);
 		vehicle4.getUser().add(user2);
 		vehicle5.getUser().add(user2);
 		
 		
 		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

         
    }
}
