package com.ems.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ems.bean.Employee;
import com.ems.util.HibernateUtil;

public class EmployeeDAO {
	// writing code for insert
	static int n = 0;

	public int insertEmployee(Employee emp) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			session.persist(emp);
			t.commit();
			n = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}

	//
	public ArrayList<Integer> getId() {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		Session session = HibernateUtil.getSession();
		idList = (ArrayList<Integer>) session.createQuery("select empid from Employee").list();
		session.close();
		return idList;

	}

	public boolean deleteEmployee(Employee emp) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			session.remove(emp);
			t.commit();
			session.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	
	//to write method for update 
	
	public boolean updateEmployee(Employee emp) {
		Session session = HibernateUtil.getSession();
		Employee e=session.get(Employee.class, emp.getEmpid());
		if(e !=null) {
		Transaction t = session.beginTransaction();
		e.setEmpName(emp.getEmpName());
		e.setEmpSalary(emp.getEmpSalary());
		session.update(e);
		t.commit();
		return true;
			
		}
		return false;
	}
	
	//to fetch
	public Employee getEmployee(Employee emp){
	try{
		Session session=HibernateUtil.getSession();
		Employee empl=session.get(Employee.class,emp.getEmpid());
		session.close();
		return empl;
	} catch(Exception e){
		e.printStackTrace();
		
	}
	return emp;

}
	
	//for findall
	public ArrayList<Employee> getEmployeeList(){
		ArrayList<Employee> list=new ArrayList<Employee>();
		Session session=HibernateUtil.getSession();
		list=(ArrayList<Employee>)session.createQuery("from Employee").list();
		session.close();
		return list;
		
	}
}
