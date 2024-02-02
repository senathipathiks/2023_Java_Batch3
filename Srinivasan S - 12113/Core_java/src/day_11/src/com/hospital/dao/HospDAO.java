package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hospital.bean.Hospital;

import com.hospital.util.DbUtilHosp;

public class HospDAO {

	public static int insert(Hospital hosp) {
		
		int n=0;
		
		try {
			Connection c=DbUtilHosp.getDBConnection();
			
			String q="insert into hospital values(?,?,?,?)";
			
			PreparedStatement prs=c.prepareStatement(q);
			
			prs.setInt(1, hosp.getPid());
			prs.setString(2, hosp.getPname());
			prs.setInt(3, hosp.getDid());
			prs.setString(4, hosp.getDname());
			
			n=prs.executeUpdate();
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public static int delete(int id) {
		int n=0;
		
		try {
			
			Connection c=DbUtilHosp.getDBConnection();
			
			String q="DELETE FROM `hospital` WHERE (pId = ?)";
			
			PreparedStatement prs=c.prepareStatement(q);
			prs.setInt(1,id);
			n=prs.executeUpdate();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
		
	}
	
	public static int update(Hospital hosp) {
		int n=0;
		
		try {
			Connection c=DbUtilHosp.getDBConnection();
			
			String q="UPDATE `hospital_management`.`hospital` SET `pName` = ?, `dId` = ?, `dname` = ? WHERE (`pId` = ?);";
			
			PreparedStatement prs=c.prepareStatement(q);
			
			prs.setString(1, hosp.getPname());
			prs.setInt(2, hosp.getDid());
			prs.setString(3, hosp.getDname());
			prs.setInt(4, hosp.getPid());
			
			n=prs.executeUpdate();
			c.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return n;
		
	}
	
	public static int find(int id) {
		int n=0;
		
		try {
			Connection c=DbUtilHosp.getDBConnection();
			
			String q="SELECT * from hospital where (pId = ?)";
			
			PreparedStatement prs=c.prepareStatement(q);
			
			prs.setInt(1,id );
			
			ResultSet rs=prs.executeQuery();
			while(rs.next()) {
				System.out.println("Patient Id : "+rs.getInt(1)+"\nPatient Name : "+rs.getString(2)+"\nDoctor Id : "+rs.getString(3)+"\nDoctor Name : "+rs.getString(4));
				n++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public static int findAll() {
		
		int n=0;
		try {
			Connection c=DbUtilHosp.getDBConnection();
			
			String q="SELECT * from hospital";
			
			PreparedStatement prs=c.prepareStatement(q);
			
			ResultSet rs=prs.executeQuery();
			while (rs.next()) {
				System.out.println("Patient Id : "+rs.getInt(1)+"\nPatient Name : "+rs.getString(2)+"\nDoctor Id : "+rs.getString(3)+"\nDoctor Name : "+rs.getString(4));
				n++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
}
