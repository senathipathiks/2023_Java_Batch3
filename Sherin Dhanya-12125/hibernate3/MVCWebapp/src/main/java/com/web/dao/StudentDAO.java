package com.web.dao;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.web.bean.Student;
import com.web.util.DBUtil;
 
 
public class StudentDAO {
 
	public int insertStudent1(Student b) {
		int n=0;
		try {
			Session s=DBUtil.opensession();
			Transaction t= s.beginTransaction();
			n=(Integer)s.save(b);
			t.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int delete(int id) {
		int n=0;
		try {
			Session s=DBUtil.opensession();
			Transaction t= s.beginTransaction();
		
			
			Student b=s.find(Student.class,id);
			s.delete(b);
			n=1;
			t.commit();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	
	
}
	public int insertStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}}
 