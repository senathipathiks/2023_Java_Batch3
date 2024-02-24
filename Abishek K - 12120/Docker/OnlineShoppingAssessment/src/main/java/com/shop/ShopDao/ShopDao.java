package com.shop.ShopDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.shop.DBUtil.DBUtil;
import com.shop.bean.Shop;



public class ShopDao {

public int shopInsert(Shop htl) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into shop values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,htl.getShopID());
			ps.setString(2,htl.getShopName());
			ps.setString(3, htl.getShopLoc());
			ps.setString(4, htl.getShopPh());
			
			n=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}
public Shop shopFind(int id) {
	
	Shop htl = null;
	int n=0;
	ResultSet rs = null;
	
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from shop where shopID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		
		rs=ps.executeQuery();
		while(rs.next()) {
			htl = new Shop();
			htl.setShopID(rs.getInt(1));
			htl.setShopName(rs.getString(2));
			htl.setShopLoc(rs.getString(3));
			htl.setShopPh(rs.getString(4));
			
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return htl;
	
}

public ArrayList<Shop> shopFindall(){
	
	ArrayList<Shop> list = new ArrayList<Shop>();
	Shop htl = null;
	ResultSet rs = null;
	
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from shop";
		PreparedStatement ps = con.prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			htl = new Shop();
			htl.setShopID(rs.getInt(1));
			htl.setShopName(rs.getString(2));
			htl.setShopLoc(rs.getString(3));
			htl.setShopPh(rs.getString(4));
			list.add(htl);
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
}

public int shopUpdate(Shop htl) {
	
	int n=0;
	
	Connection con;
	try {
		con = DBUtil.getDBConnection();
		String sql = "update shop set shopName=?,shopLoc=?,shopPh=? where shopID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(4,htl.getShopID());
		ps.setString(1,htl.getShopName());
		ps.setString(2, htl.getShopLoc());
		ps.setString(3, htl.getShopPh());
		n=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
	
}

public int shopDelete(int id) {
	
	int n=0;
	
	try {
		Connection con = DBUtil.getDBConnection();
		String sql = "delete from shop where shopID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		n=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
	
	
}


	
}
