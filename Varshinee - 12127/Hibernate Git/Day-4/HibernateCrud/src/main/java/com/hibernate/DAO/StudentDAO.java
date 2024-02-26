package com.hibernate.DAO;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bean.Student;
import com.hibernate.util.hibernateUtil;

public class StudentDAO {
	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Session session=hibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			n=(Integer)session.save(stud);
			t.commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	public int updateStudent(Student stud1)
	{
		int n=0;
		try {
			Session session=hibernateUtil.opensession();
			Transaction t=session.beginTransaction();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	

}
