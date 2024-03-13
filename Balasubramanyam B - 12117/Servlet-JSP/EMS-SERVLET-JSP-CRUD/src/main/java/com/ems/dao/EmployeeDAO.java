package com.ems.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {

	int n=0;
	private List<Employee> list ;
	private Connection con = DBUtil.getDBConnection();
	
	public int insertEmployee(Employee emp) {
		
		try {
			String q = "insert into Employee value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setInt(3, emp.getEmpAge());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
public int deleteEmployee(int id) {
		
		try {
			String q = "delete from Employee where id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public int updateEmployee(Employee emp) {
		
		try {
			String q = "update Employee set name = ?, age = ? where id =?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1,emp.getEmpName());
			ps.setInt(2, emp.getEmpAge());
			ps.setInt(3, emp.getEmpId());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return n;
	}
	
	public Employee searchEmployee(int id) {
		ResultSet rs;
		
		try {
			String q = "select * from Employee where id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next())
				return new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Employee> viewAll(){
		ResultSet rs;
		
		try {
			list = new ArrayList<Employee>();
			String q = "select * from Employee";
			PreparedStatement ps = con.prepareStatement(q);
			rs=ps.executeQuery();
			while(rs.next())
				list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
