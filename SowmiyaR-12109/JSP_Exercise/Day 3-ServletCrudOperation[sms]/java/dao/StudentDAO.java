package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtill;


public class StudentDAO {
          
	

	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtill.getDBConnection();
			String sql="insert into Student values(?,?,?)";
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
			Connection con=DBUtill.getDBConnection();
			String sql="delete from Student where id=?";
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
//	
	public int UpdateStudent(Student stud1)
	{
		int n=0;
		try {
			Connection con=DBUtill.getDBConnection();
			String sql="update Student  set name=?,city=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud1.getName());
			ps.setString(2, stud1.getCity());
			ps.setInt(3, stud1.getId());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(n);
		return n;
	}
//	
	public Student FindStudent(int id)
	{
//		Student stud=new Student();
		Student stud=null;
		ResultSet rs;
		try {
			Connection con=DBUtill.getDBConnection();
		    String sql="Select * from Student where id=?";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setInt(1, id);
		    rs=ps.executeQuery();
		    if(rs.next()) {
		    	stud=new Student();
		    	stud.setId(rs.getInt(1));
		    	stud.setName(rs.getString(2));
		    	stud.setCity(rs.getString(3));
		    }}
		    catch(Exception e)
		{
			System.out.println(e);
		}
	return stud;
	}
	

	public LinkedList<Student> FindallStudent()
	{
		 ResultSet rs;
		 LinkedList<Student> list=new LinkedList<Student>();
		try {
			Connection con=DBUtill.getDBConnection();
			 String sql="Select * from Student";
			 PreparedStatement ps=con.prepareStatement(sql);
			 rs=ps.executeQuery();
			 
			 while(rs.next())
			 {
				 Student stud=new Student();
				 stud.setId(rs.getInt(1));
				 stud.setName(rs.getString(2));
				 stud.setCity(rs.getString(3));
				 list.add(stud);
			 }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
//	
}

