package com.emp_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.emp_db.bean.Employee;
import com.emp_db.util.DBUtil;

public class EmployeeDAO {

	public int insertEmployee(Employee emp1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Employee values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, emp1.getEmp_no());
			ps.setString(2, emp1.getEmp_name());
			ps.setString(3, emp1.getEmp_dept());
			ps.setString(4, emp1.getEmp_address());
			n = ps.executeUpdate();
		} catch (Exception e) {

			System.out.println(e);
		}
		return n;
	}

	public int updateEmployee(Employee emp1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update Employee set emp_name=?,emp_dept=?,emp_address=? where emp_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, emp1.getEmp_name());
			ps.setString(2, emp1.getEmp_dept());
			ps.setString(3, emp1.getEmp_address());
			ps.setInt(4, emp1.getEmp_no());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteEmployee(int emp_no) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from Employee where emp_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, emp_no);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findEmployee(int emp_no) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select*from Employee where emp_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, emp_no);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("Emp_no: " + rs.getInt(1) + " " + "\nEmp_name: " + rs.getString(2) + " "
						+ "\nEmp_dept: " + rs.getString(3) + " " + "\nEmp_address: " + rs.getString(4));
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
			String sql = "select*from Employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("Emp_no: " + rs.getInt(1) + " " + "\nEmp_name: " + rs.getString(2) + " "
						+ "\nEmp_dept: " + rs.getString(3) + " " + "\nEmp_address: " + rs.getString(4));
				n = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
