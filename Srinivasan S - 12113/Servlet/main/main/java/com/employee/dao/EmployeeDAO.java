package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.employee.bean.Employee;
import com.employee.util.EmpDb;

public class EmployeeDAO {

	public int addEmployee(Employee emp) {		//add employee
		int n=0;
		try {
			Connection c=EmpDb.getDBConnection();
			
			String query="insert into employee values(?,?,?,?)";
			
			PreparedStatement prs=c.prepareStatement(query);
			
			prs.setInt(1,emp.getEmpId());
			prs.setString(2, emp.getEmpName());
			prs.setString(3, emp.getEmail());
			prs.setString(4, emp.getCity());
			n=prs.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deleteEmployee(int id) {		//delete employee
		int n=0;
		try {
			Connection c=EmpDb.getDBConnection();
			
			String query="DELETE FROM `employee` WHERE (empid = ?) ";
			
			PreparedStatement prs=c.prepareStatement(query);
			
			prs.setInt(1,id);
			n=prs.executeUpdate();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int updateEmployee(Employee emp) {		//update employee
		int n=0;
		try {
			
			Connection c=EmpDb.getDBConnection();
			
			String query="UPDATE `ems_db`.`employee` SET `empName` = ?, `empEmail` = ?, `empCity` = ? WHERE (`empId` = ?)";
					
			PreparedStatement prs=c.prepareStatement(query);
			
			prs.setString(1, emp.getEmpName());
			prs.setString(2, emp.getEmail());
			prs.setString(3, emp.getCity());
			prs.setInt(4,emp.getEmpId());
			n=prs.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public Employee searchEmployee(int id) {
		
		Employee emp=null;
		try {
			Connection c=EmpDb.getDBConnection();
			
			String query="SELECT * from employee where empId=?";
			
			PreparedStatement prs=c.prepareStatement(query);
			prs.setInt(1,id);
			
			ResultSet rs=prs.executeQuery();
			
			if (rs.next()) {
				emp=new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setCity(rs.getString(4));
			}
			
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return emp;
		}
	
	public LinkedList<Employee> ReadAll() {
		LinkedList<Employee>list=new LinkedList<Employee>();
		
		try {
			Connection c=EmpDb.getDBConnection();
			
			String query="SELECT * from employee";
			
			PreparedStatement prs=c.prepareStatement(query);
			ResultSet rs=prs.executeQuery();
			
			while(rs.next()) {
				Employee emp=new Employee();
				
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setCity(rs.getString(4));
				
				list.add(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
