package com.revision.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.revision.bean.Library;
import com.revision.util.LibraryUtil;

public class LibraryDAO {
	
	public int insertLib(Library lib) {
	
		try {
			
			Session session=LibraryUtil.openSession();
			Transaction t=session.beginTransaction();
			session.save(lib);
			t.commit();
			session.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	public List<Integer> listId(){
		Session session=LibraryUtil.openSession();
		Transaction t=session.beginTransaction();
		
		Query q=session.createQuery("select lid from Library");
		List<Integer> list=q.list();
		
		session.close();
		return list;
	}
	
	public void deleteLib(Library bean) {
		Session session=LibraryUtil.openSession();
		Transaction t=session.beginTransaction();
        session.delete(bean);
		t.commit();
		session.close();
		
	}
	
	public Library getLib(Library bean) {
		System.out.println("bean "+bean);
		Session session=LibraryUtil.openSession();
		Transaction t=session.beginTransaction();
		Library lib= session.get(Library.class, bean.getLid());
		System.out.println(lib +" after");
		session.close();
		return lib;
		
	}
	
	public Library updateLib(Library bean) {
		Session session=LibraryUtil.openSession();
		Transaction t=session.beginTransaction();
        session.update(bean);
        t.commit();
        session.close();
		return bean;
	}
	
	public List<Library> findallLib() {
		Session session=LibraryUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Library> lib=session.createQuery("from Library").list();
		System.out.println(lib);
		t.commit();
		session.close();
		return lib;
	}
}
