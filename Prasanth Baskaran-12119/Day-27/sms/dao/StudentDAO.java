package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sms.bean.Students;
import com.sms.util.DDUtil;

public class StudentDAO {

	public int insertStudent(Students stud) {
		
		int n=0;
		
		try {
			Connection con = DDUtil.getDBConnection();

			String sql = "insert into sms_tbl values(?,?,?)";

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, stud.getId());
			pst.setString(2, stud.getName());
			pst.setString(3, stud.getCity());
			
			n=pst.executeUpdate();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		return n;
	}

	
	public int deleteStudent(int id) {
		
		int n=0;
		
		try {
			Connection con = DDUtil.getDBConnection();

			String sql = "delete from sms_tbl where stud_id = ?";

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, id);

			n = pst.executeUpdate();
		} catch (Exception e) {
	
			
		    System.out.println(e);
		}
		
		return n;
		
		
		
	}
	
	public int UpdateStudent(Students stud) {
		
		int n =0;
		
		try {
			Connection con = DDUtil.getDBConnection();

			String sql = "update sms_tbl set stud_name=?,stud_city=? where stud_id=?";

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, stud.getName());
			pst.setString(2, stud.getCity());
			pst.setInt(3, stud.getId());

			n = pst.executeUpdate();
		} catch (Exception e) {
			
		}
		 
		 
		
		return n;
		
	}
	
	public int  FindStudent(int id) {
		
		int n =0;
		try {
			Connection con = DDUtil.getDBConnection();

			String sql = "select*from sms_tbl where stud_id =?";

			PreparedStatement pst = con.prepareStatement(sql);
			
		     pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				
				System.out.println("Student id :"+rs.getInt(1)+" Student Name : "+rs.getString(2)+
						" Student City :"+rs.getString(3));
				n++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
		
	}
	
	public int FindAllStudent() {
		
		int n=0;
		
		try {
			Connection con = DDUtil.getDBConnection();

			String sql = "select*from sms_tbl";

			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				System.out.println("Student id :" + rs.getInt(1) + "\nStudent Name : " + rs.getString(2)
						+ "\nStudent City :" + rs.getString(3));
			} 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		n=1;
		
		return n;
		
	}


	
	
	
	
	
	
	
}
