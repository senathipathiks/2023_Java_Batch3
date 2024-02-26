package com.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bean.Library;
import com.hibernate.util.HibernateUtil;

public class LibraryDAO {

	public int insertLibrary(Library lib) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			n=(Integer)session.save(lib);
			t.commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}
	public int deleteLibrary(int id) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			
			Library temp=session.find(Library.class,id);
			session.delete(temp);
			n=1;
			t.commit();
			session.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}
	public int updateLibrary(int id, Library lib) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			Library temp=session.find(Library.class,id);
			if(temp!=null) {
			session.update(lib);
			n=1;
			t.commit();
			session.close();

			}

			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}
      public Library findLib(int id) {
		
		Library temp=null;
		Transaction t=null;
		try {
			Session session=HibernateUtil.opensession();
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

	
	

}
