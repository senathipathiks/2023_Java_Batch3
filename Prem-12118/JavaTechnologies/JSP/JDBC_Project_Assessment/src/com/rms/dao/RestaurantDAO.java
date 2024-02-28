package com.rms.dao;

import java.sql.*;
import com.rms.main.*;
import com.rms.util.*;
import com.rms.bean.*;

public class RestaurantDAO {

	public int insertRestaurant(Restaurant rms1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Restaurant values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, rms1.getRest_id());
			ps.setString(2, rms1.getRest_name());
			ps.setString(3, rms1.getRest_type());
			ps.setString(4, rms1.getAddress());
			ps.setString(5, rms1.getPhno());
			ps.setString(6, rms1.getEmail());
			ps.setFloat(7, rms1.getRate());
			ps.setString(8, rms1.getProp());

			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteRestaurant(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from Restaurant where  RestId=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateRestaurant(Restaurant rms2) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update student set RestID=? RestName=?, RestType=?,Address=?,PhoneNo=?,Email=?,Rating=?,Proprietor=? where RestID=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, rms2.getRest_id());
			ps.setString(2, rms2.getRest_name());
			ps.setString(3, rms2.getRest_type());
			ps.setString(4, rms2.getAddress());
			ps.setString(5, rms2.getPhno());
			ps.setString(6, rms2.getEmail());
			ps.setFloat(7, rms2.getRate());
			ps.setString(8, rms2.getProp());

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findRestaurant(int id1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT RestId, RestName,RestType,Address,PhoneNo,Email,Rating,Proprietor FROM Restaurant WHERE RestID = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id1);
			ResultSet rs = ps.executeQuery();
			String sql1 = "SELECT * FROM Restaurant";

			if (rs.next()) {

				int rest_id = rs.getInt("RestID");
				String rest_name = rs.getString("RestName");
				String rest_type = rs.getString("RestType");
				String address = rs.getString("Address");
				String phno = rs.getString("PhoneNo");
				String email = rs.getString("Email");
				Float rate = rs.getFloat("Rating");
				String prop = rs.getString("Proprietor");

				System.out.println("The Restaurant details are:\n");
				System.out.println("Restaurant ID: " + rest_id);
				System.out.println("Name: " + rest_name);
				System.out.println("Type: " + rest_type);
				System.out.println("Address: " + address);
				System.out.println("Phone Number: " + phno);
				System.out.println("Email: " + email);
				System.out.println("Rating: " + rate);
				System.out.println("Additional Properties: " + prop);

				System.out.println("After Restaurant the table updtaed");

				n++;

			}

			else {
				System.out.println("Restaurant not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findAllRestaurant(String tableName) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT * FROM " + tableName;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("\nThe Entire table details of Restaurant listd below:\n");
			while (rs.next()) {

				int rest_id = rs.getInt("RestID");
				String rest_name = rs.getString("RestName");
				String rest_type = rs.getString("RestType");
				String address = rs.getString("Address");
				String phno = rs.getString("PhoneNo");
				String email = rs.getString("Email");
				Float rate = rs.getFloat("Rating");
				String prop = rs.getString("Proprietor");

				System.out.println("Restaurant ID:" + rest_id);
				System.out.println("Name:" + rest_name);
				System.out.println("Type:" + rest_type);
				System.out.println("Address:" + address);
				System.out.println("Phone Number:" + phno);
				System.out.println("Email: " + email);
				System.out.println("Rating: " + rate);
				System.out.println("Additional Properties: " + prop);
				n++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
