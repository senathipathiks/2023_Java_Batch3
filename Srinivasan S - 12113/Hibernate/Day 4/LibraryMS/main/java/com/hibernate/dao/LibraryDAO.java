package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bean.Library;
import com.hibernate.util.Libraryutil;

public class LibraryDAO {

	public int insertLib(Library lib) {
		int n=0;
		
		try {
			
			Session session=Libraryutil.opensession();
			Transaction t=session.beginTransaction();
			n=(int) session.save(lib);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
		
	}
	
	public int deleteLib(int id) {
		int n=0;
		try {
			Session session=Libraryutil.opensession();
			Transaction t=session.beginTransaction();
			
			Library temp=session.find(Library.class, id);
			if(temp!=null) {
				n=1;
				session.remove(temp);
				
			t.commit();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public Library findLib(int id) {
		
		Library temp=null;
		Transaction t=null;
		try {
			Session session=Libraryutil.opensession();
			 t=session.beginTransaction();
			
			 temp=session.find(Library.class, id);
			
			System.out.println(temp);
			
			if(temp !=null) {
			    t.commit();
			    System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			if(t != null) {
				t.rollback();
			}
		}
		return temp;
		
	}
	
	public Library updateLib(Library lib) {
		
		Transaction t=null;
		
		try {
			Session session=Libraryutil.opensession();
			t=session.beginTransaction();
			
			Library temp=session.find(Library.class, lib);
			
			System.out.println(lib);
			System.out.println(temp);
			if(temp !=null) {
			
			
			System.out.println(temp);
			
			session.update(temp);
			t.commit();
			}
			
		} catch (Exception e) {
			if(t != null) {
				t.rollback();
			}
		}
		return lib;
	}
}
