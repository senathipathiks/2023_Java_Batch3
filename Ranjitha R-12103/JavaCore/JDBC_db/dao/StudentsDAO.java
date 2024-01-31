package com.JDBC_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.JDBC_db.bean.Students;
import com.JDBC_db.util.DBUtil;

public class StudentsDAO {

	public int insertStudents(Students stud) {

		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into Students values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stud.getNo());
			ps.setString(2, stud.getName());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudents(int no) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from Students where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateStudents(Students stud) {

		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update Students set name=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setInt(2, stud.getNo());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}

	public int findStudents(int no) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from Students where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("no:" + rs.getInt(1) + " \nname: " + rs.getString(2));
				n = 1;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public int findallStudents() {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select*from Students";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("no: " + rs.getInt(1) + "\nname: " + rs.getString(2));
				n = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
