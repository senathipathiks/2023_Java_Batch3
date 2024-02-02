package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.bean.*;
import com.sms.util.*;


public class StudentDAO {

	public int insertStudent(Student stud) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into student values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getAge());
			ps.setString(4, stud.getGender());
			ps.setString(5, stud.getLocation());
			n=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteStudent(int id) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from student where stdid = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			
			n=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;

}
	
	public int updateStudent(Student stud) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update student set stdname=?  where stdid = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,stud.getName());
			ps.setInt(2, stud.getId());
			
			n=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	public ResultSet findStudent(int st3) throws SQLException {
		
		int  id = st3;
		int n=0;
		
		
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from student where stdid=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		
		//System.out.println("ID: "+rs.getInt(1)+"stdName: "+rs.getString(2)+"stdAge: "+rs.getString(3)+"stdGender: "+rs.getString(4)+"stdLocation: "+rs.getString(5));
		
		//ps.executeUpdate();
		
		return ps.executeQuery();
		
		
		
	}
	
      public ResultSet findAllStudent() throws SQLException {
		
		
		
		
		
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from student";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		return ps.executeQuery();
}
}