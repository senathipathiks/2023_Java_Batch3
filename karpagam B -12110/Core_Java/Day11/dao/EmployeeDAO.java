package com.stu_db.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.stu_db.bean.Employee;
import com.stu_db.util.DBUtil;

public class EmployeeDAO {

		public int insertEmployee(Employee emp) {

		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="insert into employee_tbl values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getLocation());
			ps.setInt(4, emp.getSalary());
			n=ps.executeUpdate();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;

	}
		public int deleteEmployee(int id) {

			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();// RETURN the connection object
				String sql="delete from employee_tbl where empId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,id);
				n=ps.executeUpdate();
				}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;

		}
		public int updateEmployee(Employee emp) {

			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();// RETURN the connection object
				String sql="update employee_tbl set empName=?,empLocation=?,empSalary=? where empId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, emp.getName());
				ps.setString(2, emp.getLocation());
				ps.setInt(3, emp.getSalary());
				ps.setInt(4,emp.getId());
				n=ps.executeUpdate();
				}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;
}
		public int findEmployee(int id) {

			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();// RETURN the connection object
				String sql="select*from employee_tbl where empId=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("empID:"+rs.getInt(1)+"\nempName:"+rs.getString(2)+"\nempLocation:"+rs.getString(3)+"\nempSalary:"+rs.getInt(4));
					n=1;
				}
				}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;

		}
		public int findAllEmployee() {
			int n=0;
			try {
				
				Connection con=DBUtil.getDBConnection(); // RETURN the connection object
				String sql="SELECT * FROM employee_tbl;";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
	            while(rs.next()) {
	        	System.out.println("empID:"+rs.getInt(1)+"\nempName:"+rs.getString(2)+"\nempLocation:"+rs.getString(3)+"\nempSalary:"+rs.getInt(4));
	        	n=1;
	         }
	    	}
			catch(Exception e) {
				System.out.println(e);
			}
			return n;

		}
}
			
		


