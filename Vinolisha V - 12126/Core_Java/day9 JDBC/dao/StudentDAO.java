package com.sms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	public static void main(String[] args) {
		

	}

	public static int deleteStudent(int id) { //delete value
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
	
	public static int updateStudent(Student stud) { 
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
		
	

	public int findStudent(int id) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select*from studenttbl where studentId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("studentName:"+rs.getString(2)+"\nphoneNo:"+rs.getString(3)+"\naddress:"+rs.getString(4));
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
		try{
			Connection con=DBUtil.getDBConnection();
			String sql="select* from studenttbl;";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("studentId: " + rs.getInt(1) + " studentName: "+rs.getString(2)+" phoneNo: "+rs.getString(3)+" address: "+rs.getString(4));
				n=1;
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		return n;
	}
	

}
