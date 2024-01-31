package com.stu_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import com.stu_db.bean.Student;
import com.stu_db.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student stud) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="insert into student_details values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getInitial());
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
			String sql="delete from student_details where stuId=?";
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
			String sql="update student_details set stuName=? ,stuInitial=? where stuId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getInitial());
			ps.setInt(3,stud.getId());

			n=ps.executeUpdate();
						
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;

	}
	public int findStudent(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();// RETURN the connection object
			String sql="select*from student_details where stuId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("StuName:"+rs.getString(2)+"\nStuInitial:"+rs.getString(3));
				n=1;
			}
	}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	
	public int findAllStudent() {
		int n=0;
		try {
			
			Connection con=DBUtil.getDBConnection(); // RETURN the connection object
			String sql="SELECT * FROM student_details;";
			PreparedStatement ps=con.prepareStatement(sql);


			
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
        	System.out.println("StuId:"+rs.getInt(1)+"\nStuName:"+rs.getString(2)+"\nStuInitial:"+rs.getString(3));
        	n=1;
         }
    			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;

	}
	

}
