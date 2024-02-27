package com.user_details.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.user_details.util.DButil;
import com.user_details.bean.*;

public class user_detailsDAO {

	public int insertUser(Customer us) {
		int n=0;
		
		try {
			Connection con=DButil.getDBconnection();
			String sql="insert into customer values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, us.getUid());
			ps.setString(2, us.getUname());
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteUser(int id) {
		int n=0;
		
		try {
			Connection con=DButil.getDBconnection();
			String sql="delete from customer Where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
}}
