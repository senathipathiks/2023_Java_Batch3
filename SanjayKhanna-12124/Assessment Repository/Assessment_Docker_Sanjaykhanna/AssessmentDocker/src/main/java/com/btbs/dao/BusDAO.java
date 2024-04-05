package com.btbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import com.btbs.bean.Bus;
import com.btbs.util.DBUtil;



public class BusDAO {
	
	private static Connection con = DBUtil.getDBConnection();
	private static LinkedList<Bus> list;
	
	public  int insertBooking(Bus b) {
		int n=0;
		try {
			String q = "insert into tbl_bus value(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, b.getTicketId());
			ps.setString(2, b.getBoarding());
			ps.setString(3, b.getDestination());
			ps.setFloat(4,b.getPrice());
			ps.setInt(5, b.getNoOfSeat());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int updateBooking(Bus b) {
		int n=0;
		try {
			String q = "update tbl_bus set boarding = ?, destination = ?, price = ?, no_of_seat = ? where ticket_id = ? ";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(5, b.getTicketId());
			ps.setString(1, b.getBoarding());
			ps.setString(2, b.getDestination());
			ps.setFloat(3,b.getPrice());
			ps.setInt(4, b.getNoOfSeat());
			n= ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int deleteBooking(int id) {
		int n=0;
		try {
			String q = "delete from tbl_bus where ticket_id=?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  boolean deleteAllBooking(String password) {
		boolean flag= true;
		try {
			String q = "delete from tbl_bus";
			Statement st = con.createStatement();
			if(DBUtil.password.equals(password))
				flag = st.execute(q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public  Bus searchBooking(int id) {
		
		try {
			String q = "select * from tbl_bus where ticket_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return new Bus(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public  LinkedList<Bus> veiwAllBooking(){
		list = new LinkedList<Bus>();
		try {
			String q = "select * from tbl_bus";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
				 list.add(new Bus(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}

}
