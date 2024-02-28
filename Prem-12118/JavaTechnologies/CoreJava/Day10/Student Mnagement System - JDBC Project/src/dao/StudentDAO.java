package com.sms.dao;

import java.sql.*;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student stud) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getCity());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(Student stud) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update student set name=?, city=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setInt(3, stud.getId());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findStudent(int id1) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT name, city FROM Student WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id1);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				String city = rs.getString("city");
				System.out.println("Name: " + name + ", City: " + city);
				n = 1;

			} else {
				System.out.println("Student not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public int findAllStudent(String tableName) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT * FROM " + tableName;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				n = 1;

				System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
