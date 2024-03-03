package com.spring.DAO;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.mysql.cj.Query;
import com.spring.bean.Student;
import com.spring.util.HibernateUtil;


public class StudentDAO {

	
	
	public int insertUser(Student stud) throws SQLException{
	    
		   
    	int n = 0;
    	
    	System.out.println(stud);
    	Session s = HibernateUtil.opensession();
    	
    	org.hibernate.Transaction t =  s.beginTransaction();
    	
    	s.persist(stud);
    	n=1;
    	t.commit();
    	
		
    	return n;
    }
	
	
	public List<Integer>idList(){
		
		Session s = HibernateUtil.opensession();
		org.hibernate.Transaction t = s.beginTransaction();
		
	 org.hibernate.query.Query q = s.createQuery("select id from Student");
		
		List<Integer>list = q.list();
		s.close();
		return list;
	}
	
	
	 public int deleteUser(Student bean) throws SQLException {
		    
		   
	    	int n = 0;
	    	Session s = HibernateUtil.opensession();
	    	
	    	org.hibernate.Transaction t = s.beginTransaction();
	   

			if (bean != null) {
				s.remove(bean);
				n++;
				t.commit();
				System.out.println("Emp value is Deleted !!!");
				s.close();

			} else {
				System.out.println("Emp table id Empty / If entered value is Wrong !!");
			}    
	 		   
		   return n;
		    
	    }
	 
	 public int editUser(Student stud) throws SQLException {
		    
		   
	    	int n = 0;
	    	Session s = HibernateUtil.opensession();
	    	
	    	org.hibernate.Transaction t = s.beginTransaction();
	    	
	    	
	    	Student stu = s.find(Student.class, stud.getId());
	    	
	    	stu.setName(stud.getName());
	    	stu.setEmail(stud.getEmail());
	    	stu.setPhone(stud.getPhone());

			if (stu != null) {
				s.merge(stu);
				n++;
				t.commit();
				System.out.println("Emp value is Updated !!!");

			} else {
				System.out.println("Emp table id Empty / If entered value is Wrong !!");
			}    
	 		   
		   return n;
		    
	    }
	 
	 
	 public Student searchUser(Student stud) throws SQLException {
		    
		   
	    	int n = 0;
	    	Session s = HibernateUtil.opensession();
	    	
	    	org.hibernate.Transaction t = s.beginTransaction();
	    	
	    	int stu = stud.getId();
	    	
	    	Student student = s.find(Student.class, stu);
	    	
	 		System.out.println(student);
	    	
		   return student;
		    
	    }
	 
	 public List<Integer>ListAll(){
			
			Session s = HibernateUtil.opensession();
			org.hibernate.Transaction t = s.beginTransaction();
			
		 org.hibernate.query.Query q = s.createQuery("from Student");
			
			List<Integer>list = q.list();
			s.close();
			return list;
		}
}
