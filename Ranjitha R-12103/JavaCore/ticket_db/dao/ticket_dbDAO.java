package com.ticket_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ticket_db.bean.ticket;
import com.ticket_db.util.ticket_dbUtil;

public class ticket_dbDAO {

	public int createticket(ticket t1) {
		int n = 0;
		try {
			Connection con = ticket_dbUtil.getDBConnection();
			String sql = "insert into ticket values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, t1.getT_id());
			ps.setString(2, t1.getDept());
			ps.setString(3, t1.getIssued_date());
			ps.setString(4, t1.getCategory());
			ps.setString(5, t1.getPriority());
			ps.setInt(6, t1.getPhone_no());
			n = ps.executeUpdate();
		} catch (Exception e) {

			System.out.println(e);
		}
		return n;
	}

	public int updateticket(int id,String dept) {
		int n = 0;
		try {
			Connection con = ticket_dbUtil.getDBConnection();
			String sql = "update ticket set dept=? where t_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(2, id);
			ps.setString(1, dept);
			
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteticket(int t_id) {
		int n = 0;
		try {
			Connection con = ticket_dbUtil.getDBConnection();
			String sql = "delete from ticket where t_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, t_id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findticket(int t_id) {
		int n = 0;
		try {
			Connection con = ticket_dbUtil.getDBConnection();
			String sql = "select*from ticket where t_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, t_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("t_id: " + rs.getInt(1) + " " + "\ndept: " + rs.getString(2) + " "
						+ "\nissued_date: " + rs.getString(3) + " " + "\ncategory: " + rs.getString(4) + " "
						+ "\npriority :" + rs.getString(5) + " " + "\nphone_no: " + rs.getString(6));
				n = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findallticket() {
		int n = 0;
		try {
			Connection con = ticket_dbUtil.getDBConnection();
			String sql = "select*from ticket";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("t_id: " + rs.getInt(1) + " " + "\ndept: " + rs.getString(2) + " "
						+ "\nissued_date: " + rs.getString(3) + " " + "\ncategory: " + rs.getString(4) + " "
						+ "\npriority :" + rs.getString(5) + " " + "\nphone_no: " + rs.getString(6));
				n = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
