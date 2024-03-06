package com.ems.dao;

import java.sql.*;
import java.util.ArrayList;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	private static ArrayList<Employee> list;
	private static ArrayList<Integer> idList;
	
	public int insertEmployee(Employee emp) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "insert into tbl_employee value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setFloat(3, emp.getEmpSalary());
			n=ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public ArrayList<Integer> getIds(){
		idList = new ArrayList<Integer>();
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "select emp_id from tbl_employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while(rs.next())
				idList.add(rs.getInt(1));
			st.close();
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return idList;
	}
	
	public int updateEmployee(Employee emp) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "update tbl_employee set emp_name = ? , emp_salary = ? where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(3, emp.getEmpId());
			ps.setString(1, emp.getEmpName());
			ps.setFloat(2, emp.getEmpSalary());
			n=ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	
	
	public boolean deleteEmployee(int id) {
		
			if(id==0)
				return false;
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "delete from tbl_employee where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Employee searchEmployee(int id) {
		
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "select * from tbl_employee where emp_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs =  ps.executeQuery();
			if(rs.next())
				return new Employee(rs.getInt(1), rs.getString(2), rs.getFloat(3));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Employee> veiwAll(){
		list = new ArrayList<Employee>();
		
		try {
			Connection con = DBUtil.getDBCconnection();
			String q = "select * from tbl_employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while(rs.next()) {
				list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getFloat(3)));
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}

