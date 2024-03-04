package com.spring.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spirng.util.HibernateUtil;
import com.spring.bean.Library;

public class LibraryDAO {
	

	public int insertLibrary(Library lib) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			n=(Integer)session.save(lib);
			t.commit();
			session.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}
	public List<Integer> idList() { // for auto populate
		Session session=HibernateUtil.opensession();
		Transaction t=session.beginTransaction();
		
		Query q=session.createQuery("select bid from Library");
		List<Integer> list=q.list();
		session.close();
		return list;
		}
	public void deleteLibrary(Library bean) {
		
			Session session=HibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			
			session.delete(bean);
			t.commit();
			session.close();
	}	
	public void updateLibrary(Library bean) {
		
		Session session=HibernateUtil.opensession();
		Transaction t=session.beginTransaction();
		
		session.update(bean);
		t.commit();
		session.close();
}	
     public Library findLibrary(Library bean) 
     {
    	 Library l=null;
		
		Session session=HibernateUtil.opensession();
		Transaction t=session.beginTransaction();
		l=session.find(Library.class,bean.getBid() );
		System.out.println(l);
		t.commit();
		session.close();
		return l;
}	
    @SuppressWarnings("unchecked")
	public List<Library> findallLibrary() 
     {
		
		Session session=HibernateUtil.opensession();
		Transaction t=session.beginTransaction();
		List<Library> list=session.createQuery("from Library").list();
		t.commit();
		session.close();
		return list ;
}	
}
