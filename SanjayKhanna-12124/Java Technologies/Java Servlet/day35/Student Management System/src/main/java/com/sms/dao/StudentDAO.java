package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {
	
	public int insertStudentDB(Student stu) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String q = "insert into tbl_student value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, stu.getStuId());
			ps.setString(2,stu.getStuName());
			ps.setString(3,stu.getStuCity());
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deleteStudentDB(int id) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String q = "delete from tbl_student where stu_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public boolean deleteAllStudentDB(String pass) {
		final String password = "sam@6383587926";
		boolean flag = true;
		try {
			Connection con = DBUtil.getDBConnection();
			String q = "delete from tbl_student";
			Statement st = con.createStatement();
			if(password.equals(pass))
				flag = st.execute(q);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public int updateStudentDB(Student stu) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String q = "update tbl_student set stu_name = ? , stu_city = ? where stu_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(3, stu.getStuId());
			ps.setString(1,stu.getStuName());
			ps.setString(2,stu.getStuCity());
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public Student searchStudentDB(int id) {
		ResultSet rs;
		try {
			Connection con = DBUtil.getDBConnection();
			String q = "select * from tbl_student where stu_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next())
				return(new Student(rs.getInt(1),rs.getString(2),rs.getString(3)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<Student> searchAllStudentDB() {
		ResultSet rs;
		List<Student> list = new ArrayList<Student>();
		
		try {
			Connection con = DBUtil.getDBConnection();
			Statement st = con.createStatement();
			rs = st.executeQuery("select * from tbl_student");
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
