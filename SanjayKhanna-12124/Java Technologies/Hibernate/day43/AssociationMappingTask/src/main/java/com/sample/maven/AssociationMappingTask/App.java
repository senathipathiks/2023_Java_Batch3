package com.sample.maven.AssociationMappingTask;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.bean.Address;
import com.sample.bean.Mobile;
import com.sample.bean.UserDetails;
import com.sample.bean.Vehicle;

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
       Transaction tr = session.getTransaction();
       
       UserDetails user1 = new UserDetails();
       user1.setUserId(1);
       user1.setUsername("Sanjay Khanna");
       UserDetails user2 = new UserDetails();
       user2.setUserId(2);
       user2.setUsername("Sam");
       
       Address ad1 = new Address(1, "Chennai", "Thiruvanmiyur");
       Address ad2 = new Address(2, "Chennai", "Adyar");
       
       Mobile m1 = new Mobile(1, "Samsung", "F54");
//       m1.setUser(user1);
       Mobile m2 = new Mobile(2, "Vivo", "Y200");
//       m2.setUser(user2);
       Mobile m3 = new Mobile(3, "OnePlus", "Nord 3");
//       m3.setUser(user1);
       Mobile m4 = new Mobile(4,"Oppo","k10");
//       m4.setUser(user2);
       
       Vehicle v1 = new Vehicle(1, "Bike");
       Vehicle v2 = new Vehicle(2,"Car");
       
       List<Mobile> mList = new ArrayList<Mobile>();
       mList.add(m1);
       mList.add(m2);
       mList.add(m3);
       List<Mobile> m1List = new ArrayList<Mobile>();
       m1List.add(m3);
       m1List.add(m4);
       
       List<Vehicle> vList = new ArrayList<Vehicle>();
       vList.add(v1);
       vList.add(v2);
       
//       UserDetails user1 = new UserDetails(1, "Sanjay khanna", ad1, mList, vList);
//       UserDetails user2 = new UserDetails(2, "Sam", ad2, m1List, vList);
       user1.setAddress(ad1);
       user1.setmList(mList);
       user1.setvList(vList);
       user2.setAddress(ad2);
       user2.setmList(m1List);
       user2.setvList(vList);
       
       tr.begin();
       session.persist(user1);
       session.persist(user2);
       tr.commit();
    }
}
