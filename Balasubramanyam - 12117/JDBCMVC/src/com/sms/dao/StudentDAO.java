package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
 
 public Student findStudent(int id) {
		Student student = null;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from student where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}
 
 public Student[] findAllStudents() {
		List<Student> students = new ArrayList<>();
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select * from student";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return students.toArray(new Student[students.size()]);
	}
} 

