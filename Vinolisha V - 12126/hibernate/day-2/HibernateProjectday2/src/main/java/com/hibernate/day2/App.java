package com.hibernate.day2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	StaffPojoClass staff= new StaffPojoClass(1,"vino","Attoor");
//    	StaffPojoClass staff1= new StaffPojoClass(2,"vinolisha","Chennai");
//    	StaffPojoClass staff2= new StaffPojoClass(3,"vinisha","Coimbatore");
//    	StaffPojoClass staff3= new StaffPojoClass(4,"Prabha","Nagercoil");
//    	StaffPojoClass staff4= new StaffPojoClass(5,"Priya","Punjab");
    	
    	Configuration cfg=new Configuration().configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	
//    	session.save(staff);
//    	session.save(staff1);
//    	session.save(staff2);
//    	session.save(staff3);
//    	session.save(staff4);
    	//t.commit();
    	
    	//update
//    	StaffPojoClass temp=session.find(StaffPojoClass.class, 4);
//    	temp.setName("Sherin");    	
//    	session.update(temp);
    	//t.commit();
    	
    	
    	//delete
//    	StaffPojoClass temp=session.find(StaffPojoClass.class, 4);
//    	session.delete(temp);
//    	
//    	t.commit();
    	
    	//view details
    	List<StaffPojoClass> staffList=session.createQuery("from StaffPojoClass").list();
    	for(StaffPojoClass s : staffList) {
			System.out.println(s);
		}
    	
    	System.out.println("Done");
    	
    	
    }
}
