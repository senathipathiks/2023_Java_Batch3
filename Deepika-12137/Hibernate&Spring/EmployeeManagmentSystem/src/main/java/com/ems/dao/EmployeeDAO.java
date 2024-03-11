package com.ems.dao;
 
import org.hibernate.Transaction;
 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
 
import com.ems.bean.Employee;
import com.ems.util.HibernateUtil;
 
public class EmployeeDAO {
	public int InsertEmployee(Employee emp) {
		int n = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction tran = session.beginTransaction();
			session.persist(emp);
			tran.commit();
			n = 1;
 
		} catch (Exception e) {
 
			e.printStackTrace();
		}
		return n;
	}
 
	public ArrayList<Integer> getIds() {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		Session session = HibernateUtil.getSession();
		idList=(ArrayList<Integer>) session.createQuery("select empId from Employee").list();
		Transaction t=session.beginTransaction();
		session.close();
		return idList;
	}
	
	public boolean deleteEmployee(Employee emp) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tran = session.beginTransaction();
			session.delete(emp);
			tran.commit();
			session.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateEmployee(Employee emp) {
		
		Session session = HibernateUtil.getSession();
		Employee e = session.get(Employee.class, emp.getEmpId());
		if(e != null) {
			Transaction tran = session.beginTransaction();
			e.setEmpName(emp.getEmpName());
			e.setEmpSalary(emp.getEmpSalary());
			session.update(e);
			tran.commit();
			return true;
		}
		
		return false;
	}
	
	public Employee getEmployee(Employee e) {
		try {
			Session session = HibernateUtil.getSession();
			Employee emp=session.get(Employee.class, e.getEmpId());
			session.close();
			return emp;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return e;
	}
 
	public List<Employee> getEmployeeList(){
		
		Session session = HibernateUtil.getSession();
	    Transaction t = session.beginTransaction();
	  Query q = session.createQuery("from Employee");
	  List<Employee>list = q.list();
	  System.out.println(list);
	  
	    return list;
	}
}
