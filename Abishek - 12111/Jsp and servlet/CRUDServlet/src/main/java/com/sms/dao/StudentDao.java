package com.sms.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DButil;

public class StudentDao {
	
	public int insertStudent(Student stud)
	{
		int n=0;
		try
		{
			Connection con=DButil.getDBConnection();
			String sql="insert into student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2,  stud.getName());
			ps.setString(3, stud.getCity());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}

	public int deleteStudent(int id) {
		// TODO Auto-generated method stub
		int n = 0;
		try 
		{
			Connection con=DButil.getDBConnection();
			String sql="delete from Student where id=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,  id);
					n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}

	public int updateStudent(Student stud) {
		int n=0;
		try
		{
			Connection con=DButil.getDBConnection();
			String sql="update student set Studname=?, Studcity=? where Id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2,  stud.getCity());
			ps.setInt(3, stud.getId());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}

	public Student showStudent(int id1) {
		// TODO Auto-generated method stub
		
		Student stud = null;
		try 
		{
			Connection con=DButil.getDBConnection();
			String sql="select * FROM Student WHERE Id=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,  id1);
					ResultSet rs =ps.executeQuery();
//					while(rs.next()) {
//						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//						n++;
					if(rs.next())
					{
						stud= new Student();
						stud.setId(rs.getInt(1));
						stud.setName(rs.getString(2));
						stud.setCity(rs.getString(3));
					}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return stud;
	}
	public LinkedList<Student> showallStudent() {
		// TODO Auto-generated method stub
		//int n = 0;
		ResultSet rs;
		LinkedList<Student> list = new LinkedList<Student>();
		try 
		{
			Connection con=DButil.getDBConnection();
			String sql="select * FROM Student";
					PreparedStatement ps=con.prepareStatement(sql);
					
					rs=ps.executeQuery();
					while(rs.next()) {
						Student stud = new Student();
						//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
