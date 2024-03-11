package com.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.mvc.bean.Ticket;
import com.mvc.util.DBUtil;

public class Dao {
	
	
	 @SuppressWarnings("unchecked")
	public List<Integer> getIdList(){
			
	    	List<Integer> idList = new ArrayList<>();
			Session session = DBUtil.getSession();
			idList = (List<Integer>)session.createQuery("select ticketID from Ticket").list();
			session.close();
			
			return idList;	
		
	    }
	 
	 
	 public Ticket fetchMethod(int ticketID){
			
			Session session = DBUtil.getSession();
			@SuppressWarnings("unused")
			Transaction t = session.beginTransaction();		
			Ticket temp = session.find(Ticket.class,ticketID);		
			return temp;
		
		}

	public int insertTicket(Ticket tic) {
		int n=0;
		try {
		Session session=DBUtil.getSession();
		Transaction t=session.beginTransaction();
		session.persist(tic);
		t.commit();
		n++;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return n;		
	}
	
	
	public int deleteTicket(Ticket tic) {
		int n=0;
		try {
		Session session=DBUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.delete(tic);
		transaction.commit();
		session.close();
		n++;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	
	 public int updateTicket(Ticket tic){
	    	int n=0;
			try {
			Session session=DBUtil.getSession();		
			Transaction t=session.beginTransaction();
			session.update(tic);
			t.commit();
			session.close();
			n++;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return n;
		}
	 
	 public Ticket findTicket(Ticket tic) {
			Session session=DBUtil.getSession();			
			Transaction t=session.beginTransaction();
			Ticket s=session.find(Ticket.class, tic.getTicketID());
			t.commit();
			session.close();
			return s;
		}
		
		public List<Ticket> findAll(){
			
			List<Ticket> l=new ArrayList<Ticket>();
			Session session=DBUtil.getSession();			
			l=(List<Ticket>)session.createQuery("from Ticket").list();
			return l;
			
		}
		
		
	
}
