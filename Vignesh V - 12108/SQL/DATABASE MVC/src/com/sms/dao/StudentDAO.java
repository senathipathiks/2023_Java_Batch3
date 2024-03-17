package com.sms.dao;

import java.sql.*;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {
	
	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into student values(?,?,?)";
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
}
