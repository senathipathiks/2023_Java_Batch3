package com.pms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.PropertyManagementSystem;
import com.pms.util.DBUtil;
public class PMSDAO {
	int n=0;
	private List<PropertyManagementSystem> list ;
	private Connection con = DBUtil.getDBConnection();
	
	public int insertPropertyManagementSystem(PropertyManagementSystem pms) {
		
		try {
			String q = "insert into PropertyManagementSystem value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, pms.getId());
			ps.setString(2, pms.getName());
			ps.setInt(3, pms.getOwnedBuy());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
public int deletePropertyManagementSystem(int id) {
		
		try {
			String q = "delete from PropertyManagementSystem where id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public int updatePropertyManagementSystem(PropertyManagementSystem pms) {
		
		try {
			String q = "update PropertyManagementSystem set name = ?, ownedBuy = ? where id =?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1,pms.getName());
			ps.setInt(2, pms.getOwnedBuy());
			ps.setInt(3, pms.getId());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return n;
	}
	
	public PropertyManagementSystem searchPropertyManagementSystem(int id) {
		ResultSet rs;
		
		try {
			String q = "select * from PropertyManagementSystem where id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next())
				return new PropertyManagementSystem(rs.getInt(1),rs.getString(2),rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<PropertyManagementSystem> viewAll(){
		ResultSet rs;
		
		try {
			list = new ArrayList<PropertyManagementSystem>();
			String q = "select * from PropertyManagementSystem";
			PreparedStatement ps = con.prepareStatement(q);
			rs=ps.executeQuery();
			while(rs.next())
				list.add(new PropertyManagementSystem(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

