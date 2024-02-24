package com.nalan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.nalan.Util.DBUtil;
import com.nalan.bean.Nalan;

public class NalanDao {

	public int insertTicket(Nalan n1) throws SQLException {
		
		int n=0;
		Connection con = DBUtil.getDBConecction();
		
		String sql = "insert into ticket values(?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, n1.getTicid());
		ps.setString(2, n1.getTicby());
		ps.setString(3, n1.getTicto());
		ps.setString(4, n1.getTicstatus());
		
		n=ps.executeUpdate();
		return n;
		
	}
	
	public int deleteTicket(int id) throws SQLException {
		
		int n=0;
		
		Connection con = DBUtil.getDBConecction();
		
		String sql = "delete from ticket where ticid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		n=ps.executeUpdate();
		return n;
	}
	
	public int updateTicket() throws SQLException {
		
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Ticket ID to update");
		int it = sc.nextInt();
		
		System.out.println("Update Ticket Assignes To");
		String to = sc.next();
		
		System.out.println("Update Ticket Status");
		String sts = sc.next();
		
		Connection con = DBUtil.getDBConecction();
		
		String sql = "update ticket set ticto=?,ticstatus=? where ticid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,to);
		ps.setString(2, sts);
		ps.setInt(3, it);
		
		n=ps.executeUpdate();
		return n;
	}
	
	public ResultSet findTicket(int it1) throws SQLException {
		
		
		
		Connection con = DBUtil.getDBConecction();
		
		String sql = "select * from ticket where ticid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, it1);
		
		ResultSet rs =  ps.executeQuery();
		return rs;
		
	}
	
	public ResultSet findAllTicket() throws SQLException {
		
		Connection con = DBUtil.getDBConecction();
		
		String sql = "select * from ticket";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
