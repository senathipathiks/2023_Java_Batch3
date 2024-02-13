package com.sms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDao {
	

	public int insertStudent(Student stud)  {
	Scanner sc=new Scanner(System.in);
		int n=0;
		try {
		Connection con=DBUtil.getDBConnection();
		String sql="insert into studenttable values (?,?,?)";
		PreparedStatement pt=con.prepareStatement(sql);
		pt.setInt(1, stud.getsId());
		pt.setString(2,stud.getsName());
		pt.setString(3, stud.getsCity());
		n=pt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}

	

	public int deleteStudent(int id) {
		int n=0;
		try {
		Connection con=DBUtil.getDBConnection();
		String query="delete from studenttable where sId=?";
		PreparedStatement pt=con.prepareStatement(query);
		pt.setInt(1,id);
		n=pt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	



	public int updateStudent(Student uId) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String query="Update studenttable set sName=?,sCity=? where sId=?";
			PreparedStatement pt=con.prepareStatement(query);
			
			pt.setString(1, uId.getsName());
			pt.setString(2, uId.getsCity());
			pt.setInt(3, uId.getsId());			
			n=pt.executeUpdate();
			}catch(Exception e) {
				System.out.println(e);
			}
			return n;
		
	}


	public LinkedList<Student> findAllStudent() {
		
		ResultSet rs;
		LinkedList<Student>  list=new LinkedList<Student>();
		try {
		Connection con=DBUtil.getDBConnection();
		 String query = "select * from studenttable";
		 PreparedStatement st=con.prepareStatement(query);
		 rs=st.executeQuery();
	    while(rs.next()) {
	    	Student s=new Student();
	    	s.setsId(rs.getInt(1));
	    	s.setsName(rs.getString(2));
	    	s.setsCity(rs.getString(3));
	    	list.add(s);
	    }
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	
	public static Student findStudent(int id) {
		
		Student s=null;
		
		  try {
	             Connection con=DBUtil.getDBConnection();
	             String sql="select * from studenttable where sId=?";
	            PreparedStatement ps = con.prepareStatement(sql);
	             ps.setInt(1, id);
	             ResultSet rs=ps.executeQuery();
	             if(rs.next()) {
	            	 s=new Student();
	            	 s.setsId(rs.getInt(1));
	            	 s.setsName(rs.getString(2));
	            	 s.setsCity(rs.getString(3));
	                
	             }
	        } catch (SQLException e) {
	            
	            System.out.println(e);
	        }
	        return s;
	         	
	}

}
