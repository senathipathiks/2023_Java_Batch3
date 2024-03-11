package com.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmpDao {
	
	public int insertEmployee(Employee emp) {
		
		int n=0;
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		n=(int) session.save(emp);
		t.commit();
		session.close();
		return n;
	}
	
	public List<Integer> idList(){
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select eid from Employee");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
		
	}
	
	public Employee fetchMethod(int id){
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		Employee temp = session.find(Employee.class,id);
	
		
		return temp;
	
	}
	
	public void updateEmployee(Employee emp) {
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		session.update(emp);
		t.commit();
		session.close();
		
	}
	
	public void deleteEmployee(Employee emp) {
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(emp);
		t.commit();
		session.close();
		
	}
	
	public List<Employee> findallEmployee(){
		
		Session session = DBUtil.openSession();
		Transaction t = session.beginTransaction();
		List<Employee> list = new ArrayList();
		Query query = session.createQuery("from Employee");
		list = query.list();
		
		t.commit();
		session.close();
		return list;
	}
	


}
