package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.*;
import com.sms.util.*;

public class StudentDAO {
	public int insertStudent(Student std) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into user values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, std.getSid());
			ps.setString(2, std.getSname());
			ps.setString(3, std.getCity());
			
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
	
	public Student findStudent(int id) {
		Student std=null;
		ResultSet rs;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from user where sid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			//rs.first();
			if(rs.next()) {
				std=new Student();
				std.setSid(rs.getInt(1));
				std.setSname(rs.getString(2));
				std.setCity(rs.getString(3));
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return std;
		
	}
	
	public LinkedList<Student> findAllStudent() {
		int n=0;
		LinkedList<Student> list=new LinkedList<Student>();
		
		Student std=null;
		try {
			
			Connection con=DBUtil.getDBConnection();
			String sql="select * from user";
			PreparedStatement ps=con.prepareStatement(sql);
//			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()) {
				std=new Student();
				std.setSid(rs.getInt(1));
				std.setSname(rs.getString(2));
				std.setCity(rs.getString(3));
				
				list.add(std);
			}
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return list;
	    }
	
	
	
	public int updateStudent(Student id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update user set sname=? where sid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id.getSname());
			ps.setInt(2, id.getSid());
			
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
	
	public int deleteStudent(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from user where sid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
//	
//	


}
