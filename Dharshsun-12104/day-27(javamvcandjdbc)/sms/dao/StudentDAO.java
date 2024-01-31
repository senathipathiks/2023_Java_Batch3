package com.sms.dao;

import java.sql.*;

import com.sms.bean.Student;
import com.sms.util.DBUtuil;

public class StudentDAO {
	public int insertStudent(Student stud) {
		int n=0;
		try {
			Connection con=DBUtuil.getDBConnection();
			String sql = "insert into student values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getStudid());
			ps.setString(2, stud.getStudname());
			ps.setString(3, stud.getStudaddress());
			ps.setInt(4,stud.getStudphoneno());
			ps.setInt(5, stud.getDeptid());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int deleteStudent(int studid) {
		int n=0;
		try {
			Connection con=DBUtuil.getDBConnection();
			String sql="delete from student where studid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, studid);
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int updateStudent(Student stud) {
		int n=0;
		try {
			Connection con=DBUtuil.getDBConnection();
			String sql="update student set studname=?,studaddress=?,studphoneno=?,deptid=? where studid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, stud.getStudname());
			ps.setString(2, stud.getStudaddress());
			ps.setInt(3, stud.getStudphoneno());
			ps.setInt(4, stud.getDeptid());
			ps.setInt(5, stud.getStudid());
			n=ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
}
