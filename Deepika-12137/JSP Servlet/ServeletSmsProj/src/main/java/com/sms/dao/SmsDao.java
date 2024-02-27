package com.sms.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.sms.bean.*;
import com.sms.util.*;

public class SmsDao {
		// TODO Auto-generated method stub
		
			public int insertstd(Sms std)
			{
				int n=0;
				try 
				{
					Connection con=SmsUtil.getDBConnection();
					String sql="insert into stud_detail values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,std.getSId());
					ps.setString(2, std.getSName());
					ps.setString(3, std.getSCity());
					n=ps.executeUpdate();			
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				
				return n;
			}
			

			
			public int updateStudent(Sms id) {
				int n=0;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="update stud_detail set sname=?,scity=? where sid=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, id.getSName());
					ps.setString(2,id.getSCity());
					ps.setInt(3, id.getSId());
					
					n=ps.executeUpdate();
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return n;	
			}
			
			public Sms findstd(int id) {
				Sms stud=new Sms();
				ResultSet rs;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="select * from stud_detail where SId=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1, id);
					rs=ps.executeQuery();
					if (rs.next()) {
						stud.setSId(rs.getInt(1));
						stud.setSName(rs.getString(2));
						stud.setSCity(rs.getString(3));
					}
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return stud;
				
			}

		
	public LinkedList<Sms> findAllStudent(){
		int n=0;
		
		
		LinkedList<Sms> list=new LinkedList<Sms>();
		Sms stud=null;
		try {
			Connection con=SmsUtil.getDBConnection();
			String sql="select * from stud_detail";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				stud=new Sms();
				stud.setSId(rs.getInt(1));
				stud.setSName(rs.getString(2));
				stud.setSCity(rs.getString(3));
				list.add(stud);
			}

	}catch(Exception e) {
		System.out.println(e);
	}
return list;
}
	
	public int deleteStudent(int id) {
		int n=0;
		try {
			Connection con=SmsUtil.getDBConnection();
			String sql="delete from stud_detail where sid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
}