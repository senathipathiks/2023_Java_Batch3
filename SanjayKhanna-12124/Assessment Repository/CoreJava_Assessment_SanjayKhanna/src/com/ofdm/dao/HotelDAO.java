package com.ofdm.dao;

import java.sql.*;
import java.util.*;

import com.ofdm.bean.Hotel;
import com.ofdm.util.DBUtil;

public class HotelDAO {
	
	private static Connection con = DBUtil.getDBConnection();
	private static List<Hotel> list;
	private static final String password = "sanjay@42";

	public int insertHotel(Hotel h) {
		
		int n = 0;
		
		try {
			String q = "insert into hotel_tbl value(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, h.getHotelId());
			ps.setString(2, h.getHotelName());
			ps.setString(3, h.getAddress());
			ps.setString(4, h.getPhoneNo());
			ps.setString(5, h.getEmail());
			ps.setFloat(6, h.getRating());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public int deleteHotel(int id) {
		int n=0;
		
		try {
			String q = "delete from hotel_tbl where hotel_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public Hotel searchHotel(int id) {
		
		try {
			String q = "select * from hotel_tbl where hotel_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return new Hotel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int updateHotel(Hotel h) {
		int n = 0;
		
		try {
			String q = "update hotel_tbl set hotel_name = ?, address = ?, phone_no = ?, email = ?, rating = ? where hotel_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, h.getHotelName());
			ps.setString(2, h.getAddress());
			ps.setString(3, h.getPhoneNo());
			ps.setString(4, h.getEmail());
			ps.setFloat(5, h.getRating());
			ps.setInt(6, h.getHotelId());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;	
	}
	
	public List<Hotel> viewAllHotel(){
		
		list = new ArrayList<Hotel>();

		try {
			String q = "select * from hotel_tbl";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
				list.add(new Hotel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean deleteAllHotel(String pass) {
		boolean flag = false;
		
		try {
			String q ="delete from hotel_tbl";
			Statement st = con.createStatement();
			if(password.equals(pass))
				flag = st.execute(q);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
