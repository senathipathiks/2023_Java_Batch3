package com.hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hms.bean.Staff;
import com.hms.util.HMSUtil;

public class StaffDao {

	public int insertStaff(Staff s1) {
		int n=0;
		try {
			Connection a = HMSUtil.getDBConnection();
			String q = "insert into staff values(?,?,?);";
			PreparedStatement p = a.prepareStatement(q);
			
			p.setInt(1, s1.getSid());
			p.setString(2, s1.getSname());
			p.setString(3, s1.getSrole());
			
			n = p.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int updateStaff(Staff s1) {
		int n=0;
		try {
			Connection a = HMSUtil.getDBConnection();
			String q2 = "update staff set s_role=? where s_id=? ;";
			PreparedStatement p1 = a.prepareStatement(q2);
			p1.setInt(2, s1.getSid());
			p1.setString(1, s1.getSrole());
			
			n = p1.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return n;
	}
	
	public int deleteStaff(int s_id) {
		int n=0;
		try {
			Connection a = HMSUtil.getDBConnection();
			String q1 = "delete from staff where s_id=? ;";
			PreparedStatement p2 = a.prepareStatement(q1);
			
			p2.setInt(1, s_id);
			
			n = p2.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int findStaff(int s_id) {
		int n=0;
		try {
			Connection a = HMSUtil.getDBConnection();
			String q3 = "Select * from staff where s_id=?";
			PreparedStatement p3 = a.prepareStatement(q3);
			
			p3.setInt(1, s_id);
			
			ResultSet rs = p3.executeQuery();

			while (rs.next()) {
				System.out.println("Staff ID: " + rs.getInt(1) + " \nStaff Name: " + rs.getString(2) + " \nStaff Role: "+rs.getString(3));
				n = 1;
			}			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
}



