package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.StudentUtil;

public class StudentDAO {
	
	public  int insertStudent(Student stud) {
		int n=0;
		
		try {
			Connection c=StudentUtil.getDBConnection();
			
			String sql="insert into student values(?,?,?)";
			PreparedStatement prs=c.prepareStatement(sql);
			
			prs.setInt(1,stud.getSid());
			prs.setString(2,stud.getSname());
			prs.setString(3,stud.getCity());
			n=prs.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int deleteStudent(int id) {
		int n=0;
		try {
			Connection c1=StudentUtil.getDBConnection();
			
			String sql1="DELETE FROM `student` WHERE (sid = ?)";
			PreparedStatement prs1=c1.prepareStatement(sql1);
			
			prs1.setInt(1, id);
			n=prs1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public  int updateStudent(Student stud) {	//updation
		int n=0;
		try {
			Connection c2=StudentUtil.getDBConnection();
			
			String sql2="UPDATE `student_management_sys`.`student` SET `sname` =?, `city` =?  WHERE (`sid` = ?);";
			
			PreparedStatement prs2=c2.prepareStatement(sql2);
						
			prs2.setString(1,stud.getSname());
			prs2.setString(2, stud.getCity());
			prs2.setInt(3, stud.getSid());
			n=prs2.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	
	public  Student findStudent(int id) {	//searching employee
		
		
		Student stud=null;
		try {
			
			Connection c3=StudentUtil.getDBConnection();
			
			String sql3="SELECT * from student where sid=?";
			
			PreparedStatement prs3=c3.prepareStatement(sql3);
			
			prs3.setInt(1, id);
			
			ResultSet rs=prs3.executeQuery();
//			while(rs.next()) {
//				System.out.println("Id : "+rs.getInt(1)+"\nName : "+rs.getString(2)+"\nCity : "+rs.getString(3));
//				
//			}
			if(rs.next()) {
				stud=new Student();
				stud.setSid(rs.getInt(1));
				stud.setSname(rs.getString(2));
				stud.setCity(rs.getString(3));
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Enter valid detail");
		}
		return stud;
	}
	
	
	public  LinkedList<Student> findallStudent() {
		LinkedList<Student> list=new LinkedList<Student>();
		try {
			Connection c4=StudentUtil.getDBConnection();
			
			String sql4="SELECT * from student";
			
			PreparedStatement psr4=c4.prepareStatement(sql4);
			
			ResultSet rs=psr4.executeQuery();
			
			while (rs.next()) {
				Student stud=new Student();
				
				stud.setSid(rs.getInt(1));
				stud.setSname(rs.getString(2));
				stud.setCity(rs.getString(3));
				
				list.add(stud);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
