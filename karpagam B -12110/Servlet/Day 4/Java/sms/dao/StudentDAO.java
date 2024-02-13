package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student stud) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="insert into student_tbl values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getCity());
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
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="delete from student_tbl where Student_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
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
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="update student_tbl set Student_name=? ,Student_city=? where Student_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setInt(3,stud.getId());

			n=ps.executeUpdate();
						
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;

	}
	
	public Student findStudent(int id) {
		Student stud=null;
		try {
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="select*from student_tbl where Student_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				stud=new Student();
				stud.setId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setCity(rs.getString(3));
				}
		}
	
		catch(Exception e) {
			System.out.println(e);
		}
		return stud;
}
	
	public LinkedList<Student> findAllStudent(){   
		
		LinkedList<Student> list=new LinkedList<Student>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="Select*from Student_tbl";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student stud=new Student();
				stud.setId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setCity(rs.getString(3));
				
				list.add(stud);
				}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	
		
	}




}
