package com.sms.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sms.bean.Student;
import com.sms.util.DButtil;

public class StudentDAO {
//insert the value
	public int insertStudent(Student stud) {
int n=0;
try {
	Connection con=DButtil.getDBConnection();
	String sql= "insert into student values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, stud.getId());
	ps.setString(2, stud.getName());
	ps.setString(3, stud.getCity());
	n=ps.executeUpdate();
}
catch(Exception e) {
	System.out.println(e);
}
return n;
	}
//delete the value
	public int deleteStudent(int id) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();
			String sql= "delete from student where idstud=?";
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
			Connection con=DButtil.getDBConnection();
			String sql= "update  student set namestud=? citystud=? where idstud=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setInt(3, stud.getId());
			n=ps.executeUpdate();
}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	//find value
	public int findStudent(int id) {
		int n=0;
		try {
			Connection con=DButtil.getDBConnection();// RETURN the connection object
			String sql="select*from student where stuId=?";
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
}public int FindAll() {
	int n=0;
	try {
		
		Connection con=DButtil.getDBConnection(); // RETURN the connection object
		String sql="SELECT * FROM student;";
		PreparedStatement ps=con.prepareStatement(sql);ResultSet rs=ps.executeQuery();
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
