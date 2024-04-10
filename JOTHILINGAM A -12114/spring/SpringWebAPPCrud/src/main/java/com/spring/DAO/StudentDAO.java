package com.spring.DAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import com.spring.bean.Student;
import com.spring.utill.HibernateUtill;

@Component
public class StudentDAO {
	public int insert(Student stud) {
		int n = 0;
		System.out.println(stud);
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		// n=(Integer) session.save(stud);
		n = 1;
		session.persist(stud);
		t.commit();
		return n;
}
	public List<Integer> idList() {
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		Query query = (Query) session.createQuery("select sid from Student");
		List<Integer> list = query.list();
		session.close();
		return list;
	}
	public void delete(Student bean) {
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		session.delete(bean);
		t.commit();
		session.close();
	}
	public void update(Student stud) {
		int n = 0;
		
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		session.update(stud);
		t.commit();
}
	public static Student search(Student bean) {
		
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		Student stud=session.find(Student.class, bean.getSid());
		System.out.println(stud);
		
		return stud;
		
	}
public static Student searchAll(Student bean) {
		
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		return bean;
		
	}
}