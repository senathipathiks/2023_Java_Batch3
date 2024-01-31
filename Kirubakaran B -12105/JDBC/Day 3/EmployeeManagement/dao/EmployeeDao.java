package com.emp.dao;

import java.sql.*;

import com.emp.bean.Employee;
import com.emp.util.DBUtil;

public class EmployeeDao {
	
	public int insertEmployee(Employee e1) {
		int n=0;
		try {
		Connection c=DBUtil.getDBConnection();
		String q="insert into emp values(?,?,?)";
		
		PreparedStatement ps=c.prepareStatement(q);
		ps.setInt(1, e1.getId());
		ps.setString(2, e1.getName());
		ps.setString(3, e1.getCity());
		n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return n;
		
	}
	public int deleteEmployee(int id) {
		int n=0;
		try {
		Connection c=DBUtil.getDBConnection();
		String q="delete from emp where empid=?";
		
		PreparedStatement ps=c.prepareStatement(q);
		ps.setInt(1, id);
		
		n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return n;
		
	}
	public int updateEmployee(Employee e2) {
		int n=0;
		try {
		Connection c=DBUtil.getDBConnection();
		String q="update emp set empname=?,empcity=? where empid=?";
		
		PreparedStatement ps=c.prepareStatement(q);
		ps.setString(1,  e2.getName());
		ps.setString(2,e2.getCity());
		ps.setInt(3, e2.getId());
		n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return n;
		
	}
	public int findEmployee(int e3) {
		int n=0;
		try {
		Connection c=DBUtil.getDBConnection();
		String q="select * from emp where empid=? ";
		
		PreparedStatement ps=c.prepareStatement(q);
		ps.setInt(1, e3);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		n=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
		
	}
	public int findAllEmployee() {
		int n=0;
		try {
		Connection c=DBUtil.getDBConnection();
		String q="select * from emp ";
		
		PreparedStatement ps=c.prepareStatement(q);
		
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		n=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
		
	}
	
	
	

}
