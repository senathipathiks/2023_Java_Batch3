package com.sms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.sms.bean.Nanba;
import com.sms.util.DButtil;
public class NanbaDAO {
//insert the value
	
	public int insertNanba(Nanba emp) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql="insert into myticket values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emp.getDepartment());
			ps.setString(2, emp.getCategory() );
			ps.setInt(3, emp.getMobileno() );
			ps.setString(4, emp.getLocation() );
			ps.setString(5, emp.getPriority() );
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
//delete the value
	public int deleteNanba(String department) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql= "delete from myticket where department=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, department);
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		return n;
	}
//update value
	public int updateNanba(Nanba emp) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql= "update myticket set category=? , mobileno=? ,location=? ,priority=? where department=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,emp.getCategory());
			ps.setInt(2, emp.getMobileno());
			ps.setString(3, emp.getLocation());
			ps.setString(4, emp.getPriority());
			ps.setString(5,emp.getDepartment());

			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
//find value
	public int findNanba(String department) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql= "select * from myticket where department=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, department);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.println("Department:"+rs.getString(1)+"\nCategory:"+rs.getString(2)+"\nMobileNo:"+rs.getInt(3)+"\nLocation:"+rs.getString(4)+"\npriority:"+rs.getString(5));
	n=1;
			}
			}
		catch(Exception e) {
			System.err.println(e);
		}
		return n;
	}
	public int FindAll() {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql= "select * from myticket ";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.println("Department:"+rs.getString(1)+"\nCategory:"+rs.getString(2)+"\nMobileNo:"+rs.getInt(3)+"\nLocation:"+rs.getString(4)+"\npriority:"+rs.getString(5));
				n=1;
			}
		}
		catch(Exception e) {
			System.err.println(e);
		}
		return n;
	
	}
	}


