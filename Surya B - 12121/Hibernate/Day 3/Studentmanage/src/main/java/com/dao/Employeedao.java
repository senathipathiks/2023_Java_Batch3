package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.Employeeutil;

public class Employeedao {
	public int insertEmployee(Employee emp) {
		int n=0;
		try {
			Session session = Employeeutil.openSession();
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
