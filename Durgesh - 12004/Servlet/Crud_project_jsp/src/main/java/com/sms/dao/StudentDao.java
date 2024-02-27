package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.SMSUtil;

public class StudentDao {
	//Insertion
	public int insertStudent(Student s1) {
		int r=0;
		try {
			Connection a = SMSUtil.getDBConnection();
			String q1 = "insert into student values (?,?,?);";
			PreparedStatement p1 = a.prepareStatement(q1);
			
			p1.setInt(1, s1.getSid());
			p1.setString(2, s1.getSname());
			p1.setString(3, s1.getScity());
			
						
			r = p1.executeUpdate();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return r;		
	}
	
	//Updation
	public int updateStudent(Student s2) {
		
		int r=0;
		try {
			Connection a = SMSUtil.getDBConnection();
			String q2 = "Update student set sname=?,scity =? where sid =? ; ";
			PreparedStatement p2 = a.prepareStatement(q2);
			
			p2.setString(1, s2.getSname());
			p2.setString(2, s2.getScity());
			p2.setInt(3, s2.getSid());
		
			
			r = p2.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return r;		
	}
	
	//Finding
	public Student searchStudent(int sid) {
		ResultSet rs;
//		Student s1 = new Student();
		Student s1=null;
		try {
			Connection a = SMSUtil.getDBConnection();
			String q3 = "select * from student where sid =? ; ";
			PreparedStatement p3 = a.prepareStatement(q3);
			
			p3.setInt(1, sid);

			rs = p3.executeQuery();
			
			if(rs.next()) {
				s1 = new Student();
				s1.setSid(rs.getInt(1));
				s1.setSname(rs.getString(2));
				s1.setScity(rs.getString(3));
			}		
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return s1;
	}
	
	//Deletion
	public  int deleteStudent(int id) {
		int r=0;
		try {
			Connection a = SMSUtil.getDBConnection();
			String q4 = "delete from student where sid =? ; ";
			PreparedStatement p4 = a.prepareStatement(q4);
			
			p4.setInt(1, id);
			
			r = p4.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return r;
	}
	
	//Display All employees payroll details
	public LinkedList<Student> searchAllStudent() {
		ResultSet rs;
		LinkedList<Student> list = new LinkedList<>();
		try {
			Connection a = SMSUtil.getDBConnection();
			String q5 = "select * from student ; ";
			PreparedStatement p5 = a.prepareStatement(q5);
			
			rs = p5.executeQuery();
			
			while(rs.next()) {
				Student s1  =new Student();
				s1.setSid(rs.getInt(1));
				s1.setSname(rs.getString(2));
				s1.setScity(rs.getString(3));
				list.add(s1);
			}			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
