package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.bean.Library;
import com.spring.util.SpringUtil;

public class LibraryDAO {
	public int insertBookDetails(Library lb) {

		int n = 0;
		try {
			Session session = SpringUtil.opensession();
			Transaction t = session.beginTransaction();
			n = (Integer) session.save(lb);
			t.commit();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}

	public List<Integer> idList() {
		Session session = SpringUtil.opensession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select bookid from Library");
		List<Integer> list = query.list();
		session.close();
		return list;
	}

	public void deleteBookDetails(Library bean) {
		Session session = SpringUtil.opensession();
		Transaction t = session.beginTransaction();
		session.delete(bean);
		t.commit();
		session.close();
	}


	public void updateBookDetails(Library bean) {
		Session session = SpringUtil.opensession();
		Transaction t = session.beginTransaction();
		session.update(bean);
		t.commit();
		session.close();
	}
	
	public Library FindBookDetails(Library bean) {
		Session session = SpringUtil.opensession();
		Transaction t = session.beginTransaction();
		Library lb=session.find(Library.class, bean.getBookid());
		t.commit();
		session.close();
		return lb;
		
	}
	
	public List<Library> FindAllBookDetails(){
		Session session = SpringUtil.opensession();
		Transaction t = session.beginTransaction();
		List<Library> lb=session.createQuery("from Library").list();
		t.commit();
		session.close();
		return lb;
	}
}
