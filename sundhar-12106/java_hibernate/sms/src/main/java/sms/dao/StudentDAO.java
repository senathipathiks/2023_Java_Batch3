package sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import sms.bean.Student;
import sms.util.DBUtility;

public class StudentDAO {

	static Session session = new DBUtility().getConnection();
	static Transaction t = null;

	public static int insert(Student s) {

		int n = 0;

		t = session.getTransaction();
		System.out.println(s);
		t.begin();
		n = (Integer) session.save(s);
		t.commit();
		return n;
	}

	public static int delete(Student s) {

		t = session.getTransaction();
		t.begin();

		if (s != null) {
			session.remove(s);
			t.commit();
			return 1;
		}
		t.commit();
		return 0;

	}

	public static Student getById(int id) {

		t = session.getTransaction();
		t.begin();
		Student s1 = session.find(Student.class, id);
		t.commit();
		return s1;

	}

	public static int update(Student s) {

		t = session.getTransaction();
		t.begin();
		Student  s1 = session.merge(s);
		System.out.println(s1);
		t.commit();
		
		if(s1 != null)
			return 1;
		return 0;

	}
	
	public static List<Student> getAll() {
		
		t = session.getTransaction();
		t.begin();
		List<Student> ls = session.createQuery("from Student", Student.class).list();
		System.out.println(ls);
		t.commit();
		return ls;	
	}
	
	public static int deleteAll() {
		
		t = session.getTransaction();
		t.begin();
		List<Student> ls = session.createQuery("delete from Student", Student.class).list();
		System.out.println(ls);
		t.commit();
		if(ls != null) {
			return 1;
		}
		return 0;
		
	}

}
