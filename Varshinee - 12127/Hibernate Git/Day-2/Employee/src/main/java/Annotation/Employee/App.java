package Annotation.Employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		session.save(s3);
//		t.commit();
		
		//Insert
//		Employee s2=new Employee();
//		Employee s2=new Employee();
//		s2.setEname("Sandy");
//		s2.setEsal("80,000");
//        s3.setEname("Meena");
//        s3.setEsal("50,000");
		
 	    //Delete
//		session.save(s2);
//		Employee temp=session.find(Employee.class, 3);
//		temp.setEname("Appu");
//		session.delete(temp);
//		t.commit();
		
		//Update
//		Employee temp=session.find(Employee.class, 2);
//		temp.setEname("Appu Kuttan");
//		session.update(temp);
//		t.commit();
		
		List<Employee> empList=session.createQuery("from Employee").list();
	    	for(Employee e:empList) {
	    		System.out.println(e);
	    	}
	    	System.out.println("Done");
		
    }
}
