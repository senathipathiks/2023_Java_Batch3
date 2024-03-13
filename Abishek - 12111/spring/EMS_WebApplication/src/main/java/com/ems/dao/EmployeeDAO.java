package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	public int insertEmployee(Employee employee)
	{
		
	int n = 0;
	try{
		
		Connection con=DBUtil.getDBConnection();
		String sql = "insert into tbl_employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getSalary());
		n = ps.executeUpdate();
		
	} 
	catch(Exception e)
	{
		System.out.println(e);
	}
	return n;
}
	public int UpdateEmployee(Employee employee)
	{
		
	int n = 0;
	try{
		
		Connection con=DBUtil.getDBConnection();
		String sql = "Update tbl_employee SET emp_name=?, emp_age=? where emp_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getSalary());
		ps.setInt(3, employee.getId());
		n = ps.executeUpdate();
		
	} 
	catch(Exception e)
	{
		System.out.println(e);
	}
	return n;
}
	
	public List<Integer> getIdList()
	{
		List<Integer> idList = new ArrayList<>();
		try
		{
	
		
		Connection con = DBUtil.getDBConnection();
		String sql = "select id from tbl_employee";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			idList.add(rs.getInt("id"));
		}
	rs.close();
	ps.close();
		
	} catch(Exception e)
		
	{
		System.out.println(e);
	}
	
	return idList;
	
	}
	
}