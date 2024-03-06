package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

import jakarta.servlet.RequestDispatcher;

public class EmployeeDAO {
public int insertEmployee(Employee emp) {
	int n=0;
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into tbl_employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp.getEid());
		ps.setString(2,emp.getEname());
		ps.setInt(3, emp.getEage());
		n = ps.executeUpdate();
	}catch(Exception e) {
		System.out.println(e);
	}
	return n;
}
public int UpdateEmployee(Employee emp) {
	int n=0;
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into tbl_employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, emp.getEid());
		ps.setString(2,emp.getEname());
		ps.setInt(3, emp.getEage());
		n = ps.executeUpdate();
		ps.close();
		con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	return n;
}
public List<Integer> getIdList(){
	List<Integer> idList = new ArrayList<>();
	try {
	Connection con = DBUtil.getDBConnection();
	String sql = "select empId from tbl_employee";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		idList.add(rs.getInt("empId"));
	}
	rs.close();
	ps.close();
	con.close();
}catch(Exception e) {
	System.out.println(e);
}
	return idList;


}
public Employee getEmployee(int eid) {
	Employee emp = null;
	try {
	Connection con = DBUtil.getDBConnection();
	String sql = "select * from tbl_employee where empId=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, eid);
	ResultSet rs = ps.executeQuery();
	if(rs.next()) {
		emp = new Employee(rs.getInt("empId"),rs.getString("empName"),rs.getInt("empAge"));
	}
	}catch(Exception e) {
		System.out.println(e);
	}
	return emp;
}

public int updateEmployee(Employee emp) {
	int n=0;
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "update tbl_employee set empName=?,empAge=? where empId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(3, emp.getEid());
		ps.setString(1,emp.getEname());
		ps.setInt(2, emp.getEage());
		n = ps.executeUpdate();
	}catch(Exception e) {
		System.out.println(e);
	}
	return n;
}

public int deleteEmployee(int eid) {
	int n=0;
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete from tbl_employee where empId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, eid);
		n = ps.executeUpdate();
		ps.close();
		con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	return n;
}
}

