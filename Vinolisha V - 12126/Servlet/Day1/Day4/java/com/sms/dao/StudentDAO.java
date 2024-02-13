package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;


public class StudentDAO {
	
	public int insertStudent(Student stud) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into studenttbl values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getNo());
			ps.setString(4, stud.getCity());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}



	public int deleteStudent(int id) { //delete value
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from studenttbl where studentId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	
	}
	
	//update value
	
	public int updateStudent(Student stud) { 
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update studenttbl set  studentName=? ,address=?, phoneNo=?  where studentId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setString(3, stud.getNo());
			ps.setInt(4,  stud.getId());
			
			
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
		
	
	
		//find values
		
	public Student findStudent(int id) {
		Student stud=new Student();
		ResultSet rs;
		
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select*from studenttbl where studentId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			if(rs.next()) {
				stud.setId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setNo(rs.getString(3));
				stud.setCity(rs.getString(4));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return stud;
		
	}
	
	//find all

	public LinkedList<Student> findAllStudent() {
		//Student stud=new Student();
		ResultSet rs;
		LinkedList<Student> list=new LinkedList<Student>();
		
		try{
			Connection con=DBUtil.getDBConnection();
			String sql="select* from studenttbl;";
			PreparedStatement ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				Student stud=new Student();
				stud.setId(rs.getInt(1));
				
				stud.setName(rs.getNString(2));
				
				stud.setNo(rs.getNString(3));
				
				stud.setCity(rs.getNString(4));
				
				list.add(stud);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		return list;
	}



	

}
