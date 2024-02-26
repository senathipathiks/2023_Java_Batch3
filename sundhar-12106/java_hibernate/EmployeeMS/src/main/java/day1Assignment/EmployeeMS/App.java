package day1Assignment.EmployeeMS;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import day1Assignment.bean.Employee;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session sess = sf.openSession();

		Transaction t = sess.getTransaction();
        
//        Employee e1 = new Employee();
//        e1.setEid(100);
//        e1.seteName("Sundhar Raj S");
//        e1.seteDesig("Developer");
//        e1.setEsal(25000);
//        e1.setePhone(9884436865l);
        

//		Employee e1 = sess.find(Employee.class, 100);
//		System.out.println(e1);
////		e1.setEid(101);
//		e1.seteName("hemachandran");
//		t.begin();
//		System.out.println(e1);
//		sess.merge(e1);
//		t.commit();
		
//		Query q = sess.createQuery("select eName from Employee");
//		
//		List<Employee> ls = q.list();6
//		
//		System.out.println(ls);
		

	}
}
