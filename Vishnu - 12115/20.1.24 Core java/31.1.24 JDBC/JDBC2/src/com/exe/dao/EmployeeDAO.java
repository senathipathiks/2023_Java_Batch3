package com.exe.dao;

import java.sql.*;

import com.exe.bean.EmployeeModel;
import com.exe.util.EmployeeUtil;

public class EmployeeDAO {
	
	public int insertEmployeeModel(EmployeeModel epy) {
		
		int n=0;
		try {
			Connection con=EmployeeUtil.getDBConnection();
			String sql="insert into employee values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,epy.getId());
			ps.setString(2,epy.getName());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
public int deleteEmployeeModel(int id) {
		
		int n=0;
		try {
			Connection con=EmployeeUtil.getDBConnection();
			String sql="delete into employee values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}


}
