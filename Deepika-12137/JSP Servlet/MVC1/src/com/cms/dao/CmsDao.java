package com.Sms.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Sms.bean.*;
import com.Sms.util.*;
public class SmsDao {
		// TODO Auto-generated method stub
		
			public int insertstd(Sms std)
			{
				int n=0;
				try 
				{
					Connection con=CmsUtil.getDBConnection();
					String sql="insert into stdDetails values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1,std.getstdId());
					ps.setString(2,std.getstdName());
					ps.setString(3,std.getstdRole());
					n=ps.executeUpdate();			
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				
				return n;
			}
			
			public int deletestd(int id) {
				
				int n=0;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="delete from stdDetails Where stdId=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1, id);
					n=ps.executeUpdate();
					}
				catch (Exception e) 
				{
					System.out.println(e);
				}
				return n;
				
				
			}
			
			public int updatestd(Sms std) {
				int n=0;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="update stdDetails set stdName=? where stdId=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, std.getstdName());
					ps.setInt(2,std.getstdId());
					n=ps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return n;
			}
			
			public int findstd(int id) {
				int n=0;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="select *from stdDetails where stdId=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1, id);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						System.out.println("id:"+rs.getInt(1)+"\nName"+rs.getString(2)+"\nRole"+rs.getString(3));
						n=1;
						
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return n;
			}
			
			public int findAll() {
				int n=0;
				try {
					Connection con=SmsUtil.getDBConnection();
					String sql="select *from stdDetails";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					
					while (rs.next()) {
						System.out.println("id:"+rs.getInt(1)+"\nName : "+rs.getString(2)+"\tRole : "+rs.getString(3));
						n=1;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				System.out.println();
				return n;
			
		public int exit() {
			int n=0;
			
		}

	}

}
