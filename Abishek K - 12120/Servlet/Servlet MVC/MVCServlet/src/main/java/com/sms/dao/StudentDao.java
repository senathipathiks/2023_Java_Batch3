package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.sms.util.*;
import com.sms.util.DBUtil;
import com.sms.bean.*;

public class StudentDao {
	
	public int insertStudent(Student stud) {
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConecction();
			String sql = "insert into student values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,stud.getStudId());
			ps.setString(2, stud.getStudName());
			ps.setString(3, stud.getStudCity());
			
			n=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public Student findStudent(int id){
		
		Student stud = null;
		ResultSet rs;
		
		try {
		Connection con = DBUtil.getDBConecction();
		
		String sql = "select * from student where stdid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		rs=ps.executeQuery();
		
		if(rs.next()) {
			stud=new Student();
			stud.setStudId(rs.getInt(1));
			stud.setStudName(rs.getString(2));
			stud.setStudCity(rs.getString(3));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return stud;
	}
	
	public LinkedList<Student> findAllStudent(){
		
		ResultSet rs;
		LinkedList<Student> list = new LinkedList<Student>();
		
		try {
			Connection con = DBUtil.getDBConecction();
			
			String sql = "select * from student";
			PreparedStatement ps = con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				Student stud = new Student();
				stud.setStudId(rs.getInt(1));
				stud.setStudName(rs.getString(2));
				stud.setStudCity(rs.getString(3));
				list.add(stud);
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	
	public int deleteStudent(int id1) {
		
		int n=0;
		
		try {
			
			Connection con = DBUtil.getDBConecction();
			
			String sql = "delete from student where stdId=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id1);
			n=ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
		
	}
	
	public int updateStudent(Student std) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConecction();
			
			String sql = "update student set stdName=?,stdCity=? where stdId=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, std.getStudName());
			ps.setString(2, std.getStudCity());
			ps.setInt(3, std.getStudId());
			
			n= ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return n;
		
	}
}
