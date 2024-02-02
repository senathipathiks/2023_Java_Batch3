package com.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hotel.bean.*;
import com.hotel.main.*;

import com.hotel.util.*;

public class Hoteldao {

	public int insertHotel(Hotel ht1) throws SQLException {
		
		int n=0;
		
		Connection con = DBUtil.getDBConnection();
		
		String sql = "insert into hotel values(?,?,?,?)";
		
		PreparedStatement p = con.prepareStatement(sql);
		
		p.setInt(1, ht1.getId() );
		p.setString(2, ht1.getName());
		p.setString(3, ht1.getPhno());
		p.setString(4, ht1.getLocation());
		
		n=p.executeUpdate();
		
		return n;
	}
	
	public int deleteHotel(int id) throws SQLException {
		
		int n=0;
		
		Connection con = DBUtil.getDBConnection();
		
		String sql = "delete from hotel where custid = ?";
		
		PreparedStatement p = con.prepareStatement(sql);
		
		p.setInt(1,id);
		
		n=p.executeUpdate();
		
		return n;
		
	}
	
	public int updateHotel(Hotel ht2) throws SQLException {
		int n=0;
		
		Connection con = DBUtil.getDBConnection();
		
		String sql = "update hotel set custname=?,custloc=? where custid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ht2.getName());
		ps.setString(2, ht2.getLocation());
		ps.setInt(3, ht2.getId());
		
		n=ps.executeUpdate();
		
		return n;
		
	}
	
	public ResultSet findHotel(int it) throws SQLException {
		int n=0;
		
		Connection con = DBUtil.getDBConnection();
		
		String sql = "select * from hotel where custid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, it);
		
		ResultSet rs = ps.executeQuery();
		
		return rs;
		
	}
	
	public ResultSet findAllHotel() throws SQLException {
		
		Connection con = DBUtil.getDBConnection();
		
		String sql = "select * from hotel";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
