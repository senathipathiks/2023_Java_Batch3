package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	
	public int insertEmployee(Employee employee){
		
		int n=0;
		try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into tbl_emp values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, employee.getEmpid());
		ps.setString(2, employee.getEmpname());
		ps.setString(3, employee.getEmpsalary());
		n=ps.executeUpdate();
		ps.close();
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
		
	}
	
	public List<Integer> getIdList(){
		
		List<Integer> list = new ArrayList();
		Connection con;
		try {
			con = DBUtil.getDBConnection();
			String sql = "select empid from tbl_emp";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(rs.getInt("empid"));
				
			}
			rs.close();
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int updateEmployee(Employee emp) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update tbl_emp set empname=?,empsalary=? where empid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,emp.getEmpname());
			ps.setString(2, emp.getEmpsalary());
			ps.setInt(3, emp.getEmpid());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public Employee getEmployee(int id) {
		
		Employee emp = null;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_emp where empid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp = new Employee(rs.getInt("empid"),rs.getString("empname"),rs.getString("empsalary"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public int deleteEmployee(int id) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from tbl_emp where empid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public List<Employee> findallEmployee(){
		
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from tbl_emp";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			Employee emp = new Employee(rs.getInt("empid"),rs.getString("empname"),rs.getString("empsalary"));
				list.add(emp);
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
}
