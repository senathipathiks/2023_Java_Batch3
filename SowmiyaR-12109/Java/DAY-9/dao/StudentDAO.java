package com.JDBC_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.JDBC_db.bean.Student;
import com.JDBC_db.util.DBUtill;

public class StudentDAO {
          
	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtill.getDBConnection();
			String sql="insert into Student values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
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
			String sql="delete from Student where studid=?";
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
	
	public int UpdateStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtill.getDBConnection();
			String sql="update Student  set studname=? where studid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(2, stud.getId());
			ps.setString(1, stud.getName());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(n);
		return n;
	}

}
