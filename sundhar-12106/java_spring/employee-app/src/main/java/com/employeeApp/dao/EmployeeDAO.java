package com.employeeApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employeeApp.dto.Employee;
import com.employeeApp.util.DBUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class EmployeeDAO {

	@Autowired
	DBUtil util;

	// save Employee
	public int saveEmployee(Employee emp) {

		int n = 0;
		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		if (emp != null) {

			et.begin();
			em.persist(emp);
			et.commit();
			n = 1;
		}

		return n;
	}

	// fetch all id list
	public List<Integer> idList() {

		List<Integer> ls = new ArrayList<Integer>();

		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Query q = em.createQuery("select e.eid from Employee e");
		ls = q.getResultList();
		et.commit();

		System.out.println(ls);

		return ls;

	}

	public Employee fetchById(Employee employee) {

		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		et.begin();
		employee = em.find(Employee.class, employee.getEid());
		et.commit();

		return employee;
	}

	public Employee updateById(Employee employee) {

		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		et.begin();
		employee = em.merge(employee);
		et.commit();

		return employee;
	}

	public int deleteEmp(Employee emp) {

		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		if (emp != null) {
			et.begin();
			emp = em.find(Employee.class, emp.getEid());
			em.remove(emp);
			et.commit();
			return 1;
		}

		return 0;
	}

	public List<Employee> fetchAll() {

		EntityManager em = util.getConnection();
		EntityTransaction et = em.getTransaction();

		List<Employee> empls = new ArrayList<Employee>();

		et.begin();
		empls = em.createQuery("select e from Employee e").getResultList();
		et.commit();

		System.out.println(empls +"from dao");
		return empls;
	}
}
