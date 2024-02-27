package com.hib.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.hib.bean.UserClass;

import com.hib.main.HibernateCRUD.UserMain;



public class UserClassDAO {

	
	     Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session s = factory.openSession();
		 Transaction t = s.getTransaction();
		
	     public int insertUser(UserClass u) {
		
	    	  if(u!=null) {
	    		  t.begin();
	    		  s.save(u);
	    		  t.commit();
	    		  return 1;
	    	  }
		   
	
        	return 0;
		
	}
	   
	     public int deleteUser(int id) {
	    	 
	    	 UserClass u=s.get(UserClass.class, id);
	    	
	    	 if(u != null) {
	    		t.begin();
	    		s.delete(u);
	    		t.commit();
	    		return 1;
	    	 }
			return 0;
	    	 
	     }
	

	     public int UpdateUser(UserClass u) {
		  
	    	 
	    	 UserClass u1=s.find(UserClass.class, u.getUid());
	    	 
	    	  if(u1!=null) {
	    		  u1.setUname(u.getUname());
	    		  u1.setUcity(u.getUcity());
	    		  t.begin();
	    		  s.merge(u1);;
	    		  t.commit();
	    		  return 1;
	    	  }
		   
	
        	return 0;
		

	     }
	     
	     public UserClass searchUser(int id) {
	    	 
	    	 UserClass u=s.get(UserClass.class, id);
	    	
	    	 
	    		return u;
	     }
	  
	   @SuppressWarnings("unchecked")
	public  ArrayList<UserClass> findAll(){
			
		ArrayList<UserClass> l=(ArrayList<UserClass>) s.createQuery("from user").list();
	    for (UserClass em1 : l) {
		     System.out.println(em1);
		    
		}
		return null;
	   }
	   
	
	}
	

