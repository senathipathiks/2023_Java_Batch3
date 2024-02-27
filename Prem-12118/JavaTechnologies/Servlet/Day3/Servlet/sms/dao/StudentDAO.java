package com.sms.dao;

import java.sql.*;
import java.util.LinkedList;

import com.sms.bean.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

	public int insertStudent(Student stud) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getCity());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}


	public int updateStudent(Student stud) {
		int n =0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "Update student set Stud_name=?, Stud_city=? where Stud_id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, stud.getName());
			ps.setString(2, stud.getCity());
			ps.setInt(3, stud.getId());
			n = ps.executeUpdate();
			
			System.out.println(stud.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}

	public Student findStudent(int id) {
		Student stud = new Student();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT * FROM Student WHERE Stud_id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				stud.setId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setCity(rs.getString(3));

			} else {
				System.out.println("Student not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return stud;
	}

	public LinkedList<Student> findAllStudent() {

		LinkedList<Student> list = new LinkedList<Student>();
		//Student stud = new Student();
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "SELECT * FROM Student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			 while(rs.next()) {
	                Student stud=new Student();
	                stud.setId(rs.getInt(1));
	                
	                stud.setName(rs.getString(2));
	         
	                stud.setCity(rs.getString(3));
	                
	                list.add(stud);
	            }
	        }
	            catch(Exception e) {
	                System.out.println(e);
	            }
	        return list;
	    }
	public int deleteStudent(int id) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from student where Stud_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
}
