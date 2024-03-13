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
			String q = "insert into tbl_employee value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getAge());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
public int deleteEmployee(int id) {
		
		try {
			String q = "delete from tbl_employee where emp_id = ?";
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
			String q = "update tbl_employee set emp_name = ?, emp_age = ? where emp_id =?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1,emp.getName());
			ps.setInt(2, emp.getAge());
			ps.setInt(3, emp.getId());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return n;
	}
	
	public Employee searchEmployee(int id) {
		ResultSet rs;
		
		try {
			String q = "select * from tbl_employee where emp_id = ?";
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
			String q = "select * from tbl_employee";
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