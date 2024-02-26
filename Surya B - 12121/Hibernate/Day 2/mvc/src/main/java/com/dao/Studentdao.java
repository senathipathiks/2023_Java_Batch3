package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.bean.Student;

import com.util.Util;

public class Studentdao {
	
	
	public int insertEmployee(Student emp) {
		int n=0;
		try {
			Session session = Util.openSession();
			Transaction t = session.beginTransaction();
			n = (Integer)session.save(emp);
			System.out.println("Hello");
			t.commit();
			
		}
		catch(Exception e) {
			System.out.println();
		}
		return n;
	}
}
