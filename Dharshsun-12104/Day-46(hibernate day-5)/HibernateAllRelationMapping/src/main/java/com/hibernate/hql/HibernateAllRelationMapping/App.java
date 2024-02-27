package com.hibernate.hql.HibernateAllRelationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t=session.beginTransaction();
    	
    		User user=new User();
    		User user2=new User();
    		user2.setUserName("Dharshsun");
    		user.setUserName("Srinivasan");
    		
    		Address address= new Address();
    		address.setStreet("Ambedthkar street-A");
    		address.setCity("Chennai");
    		Address address2=new Address();
    		address2.setStreet("Thiripura");
    		address2.setCity("Nellur");
    		
    		
    		
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
    		mobile2.setModel("Note 12 pro");
    		Mobile mobile3 = new Mobile();
    		mobile3.setBrand("vivo");
    		mobile3.setModel("y36");
    		
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
    		session.save(user);
    		session.save(user2);
    		
    	t.commit();
    }
}
