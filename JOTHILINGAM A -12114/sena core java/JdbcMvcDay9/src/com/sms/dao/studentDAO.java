package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.bean.student;
import com.sms.util.DBUtil;

public class studentDAO {

	public int insertStudent (student stud) {
		
		Connection con=DBUtil.getDBConnection();
		String sql="insert into student values(?,?,?)";
		int n=0;
		try {
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1, stud.getId());
			p.setString(2, stud.getName());
			p.setString(3, stud.getCity());
			n=p.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;		

	}
	
	public int deleteStudent(int id) {
        int n=0;
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="delete from student where sid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            n=ps.executeUpdate();
        }
        catch (Exception e) {
			System.out.println(e);
		}
        return n;

}
	
	public int updateStudent(student stud) {
        int n=0;
        try {
            Connection con=DBUtil.getDBConnection();
            String sql="UPDATE `student1`.`student` SET `sname` = ?, `scity` = ? WHERE (`sid` =? );";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, stud.getName());
            ps.setString(2, stud.getCity());
            ps.setInt(3, stud.getId());
            n=ps.executeUpdate();
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        return n;

}
	 public int fetchstudent(int id) {
		 int n=0;
		
		 try {
			 Connection con=DBUtil.getDBConnection();
			 String sql="select * from student where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			 ps.setInt(1, id);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 System.out.println("Student Id: "+rs.getInt(1)+"\nStudent Name: "+rs.getString(2)+"\nCity: " +rs.getString(3));
			 }
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		return n;
		 
	 }
	 public int fetchAll() {
		 int n=0;
		  
		 try {
			 Connection con=DBUtil.getDBConnection();
			 String sql="select * from student1.student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				 System.out.println("Student Id: "+rs.getInt(1)+"\nStudent Name: "+rs.getString(2)+"\nCity: " +rs.getString(3));
				 System.out.println("--------------------------------------------------------------------");
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
		 
	 }
}
