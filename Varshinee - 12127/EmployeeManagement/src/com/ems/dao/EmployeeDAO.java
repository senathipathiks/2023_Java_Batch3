package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {

	public int insertEmployee(Employee emp) {
		int n=0;
		try {
		Connection con=DBUtil.getDBConnection();
		String sql="insert into Employee values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, emp.getId());
		ps.setString(2, emp.getName());
		ps.setInt(3, emp.getDeptid());
		ps.setString(4, emp.getDeptname());
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
			Connection con=DBUtil.getDBConnection();
			String sql="Delete from Employee where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int updateEmployee(Employee emp1) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="Update  Employee set name=?, deptid=?, deptname=?  where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emp1.getName());
			ps.setInt(2, emp1.getDeptid());
			ps.setString(3,emp1.getDeptname());
			ps.setInt(4,emp1.getId());
			n=ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int findEmployee(int id1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Employee where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id1);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("id:" + rs.getInt(1) + " \nname: " + rs.getString(2) + " \ndeptid: " + rs.getInt(3) + "\ndeptname:" + rs.getString(4));
				n = 1;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public int findallEmployee() {
		 int n = 0;
		    try {
		        Connection con = DBUtil.getDBConnection();
		        String sql = "SELECT * FROM Employee";
		        PreparedStatement ps = con.prepareStatement(sql);
		        ResultSet rs = ps.executeQuery();

		        while (rs.next()) {
		            System.out.println("id:" + rs.getInt(1) + " \nname: " + rs.getString(2) + " \ndeptid: " + rs.getInt(3) + "\ndeptname:" + rs.getString(4));
		            n = 1;
		        }
		    } catch (Exception e) {
		        System.out.println(e);
		    }
		    return n;
	
	}
	
}
