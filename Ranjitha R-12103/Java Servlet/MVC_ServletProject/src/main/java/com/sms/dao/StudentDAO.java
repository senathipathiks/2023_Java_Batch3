package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {
	public int insertStudents(Student stud) {

		int n = 0;
		try {
			Connection con = com.sms.util.DBUtil.getDBConnection();
			String sql = "insert into sms_tbl values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stud.getS_id());
			ps.setString(2, stud.getS_name());
			ps.setString(3, stud.getS_city());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}


	public int updateStudents(Student stud) {

		int n = 0;
		try {
			Connection con = com.sms.util.DBUtil.getDBConnection();
			String sql = "update sms_tbl set sname=?,scity=? where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, stud.getS_name());
			ps.setString(2, stud.getS_city());
			ps.setInt(3, stud.getS_id());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}
	
	
	public int deleteStudents(int S_id) {
		int n = 0;
		try {
			Connection con = com.sms.util.DBUtil.getDBConnection();
			String sql = "delete from sms_tbl where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, S_id);
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public Student findStudents(int sid) {
		Student stud = null;
		ResultSet rs;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select*from sms_tbl where sid=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, sid);
			rs = ps.executeQuery();
			if (rs.next()) {
				stud = new Student();
				stud.setS_id(rs.getInt(1));
				stud.setS_name(rs.getString(2));
				stud.setS_city(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stud;
	}

	public LinkedList<Student> findAllStudent() {
		ResultSet rs;

		LinkedList<Student> list = new LinkedList<Student>();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select*from sms_tbl";
			PreparedStatement ps = con.prepareStatement(sql);

			rs = ps.executeQuery();
			while (rs.next()) {
				Student stud = new Student();
				stud.setS_id(rs.getInt(1));
				stud.setS_name(rs.getString(2));
				stud.setS_city(rs.getString(3));
				list.add(stud);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	
}
