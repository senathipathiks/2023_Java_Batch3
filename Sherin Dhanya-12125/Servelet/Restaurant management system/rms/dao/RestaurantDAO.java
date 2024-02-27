package com.rms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rms.bean.restaurant_tbl;
import com.rms.util.DBUtill;

public class RestaurantDAO {
	public int insertRestaurant(restaurant_tbl rm) {
		int n = 0;
		try {
			Connection con = DBUtill.getDBConnection();
			String sql = "insert into restaurant_tbl values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, rm.getRestId());
			ps.setString(2, rm.getRestName());
			ps.setString(3, rm.getRestType());
			ps.setString(4, rm.getAddress());
			ps.setInt(5, rm.getPhoneNo());
			ps.setString(6, rm.getEmail());
			ps.setInt(7, rm.getRating());
			ps.setString(8, rm.getProprietor());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;
	}

	// delete the value
	public int deleteRestaurant(int RestID) {
		int n = 0;
		try {
			Connection con = DBUtill.getDBConnection();
			String sql = "delete from restaurant_tbl where RestID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, RestID);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
		}
		return n;
	}

//update the value
	public int updateRestaurant(restaurant_tbl rm) {
		int n = 0;
		try {
			Connection con = DBUtill.getDBConnection();
			String sql = "update restaurant_tbl set RestName=? RestType=? Address=? PhoneNo=? E-mail=? Rating=? Proprietor=? where RestID=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, rm.getRestName());
			ps.setString(2, rm.getRestType());
			ps.setString(3, rm.getAddress());
			ps.setInt(4, rm.getPhoneNo());
			ps.setString(5, rm.getEmail());
			ps.setInt(6, rm.getRating());
			ps.setString(7, rm.getProprietor());
			ps.setInt(8, rm.getRestId());

			n = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return n;
	}

//find the value
	public int findRestaurant(int id) {
		int n = 0;
		try {
			Connection con = DBUtill.getDBConnection();// RETURN the connection object
			String sql = "select*from restaurant_tbl where RestID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("\nRestName:" + rs.getString(2) + "\nRestType:" + rs.getString(3) + "\nAddress:"
						+ rs.getString(4) + "\nPhoneNo:" + rs.getInt(5) + "\nE-mail:" + rs.getString(6) + "\nRating:"
						+ rs.getInt(6) + "\nProprieter:" + rs.getString(6));
				n = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	// display
	public int Display() {
		int n = 0;
		try {
			Connection con = DBUtill.getDBConnection();
			String q = "select * from restaurant_tbl";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
				System.out.println("RestID:" + rs.getInt(1) + "\nRestName:" + rs.getString(2) + "\nRestType:"
						+ rs.getString(3) + "\nAddress:" + rs.getString(4) + "\nPhoneNo:" + rs.getInt(5) + "\nEmail:"
						+ rs.getString(6) + "\nRating:" + rs.getInt(6) + "\nProprioter:" + rs.getString(6));
			n = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;

	}
}
