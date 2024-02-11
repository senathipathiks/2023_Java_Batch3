package com.sms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {
	
	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into student value(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getCity());
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
	
	
	public int deleteStudent(int id)
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from student where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
	
 public int updateStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update student set name=?, city=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setInt(3, stud.getId());
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
 public Student findStudent(int id)
	{
		Student stud=null;
		ResultSet rs;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from student where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
			stud=new Student();
			stud.setId(rs.getInt(1));
			stud.setName(rs.getString(2));
			stud.setCity(rs.getString(3));}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
return stud;
}
 
 public LinkedList<Student> findAllStudent()
	{
		//Student stud=new Student();
		ResultSet rs;
		LinkedList<Student> list=new LinkedList<Student>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from student";
			PreparedStatement ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
			Student stud=new Student();
			stud.setId(rs.getInt(1));
			
			stud.setName(rs.getString(2));
			
			stud.setCity(rs.getString(3));
			
			list.add(stud);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
return list;
}
}

