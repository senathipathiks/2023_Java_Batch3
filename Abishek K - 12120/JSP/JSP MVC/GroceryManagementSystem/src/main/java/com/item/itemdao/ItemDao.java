package com.item.itemdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.item.DBUtil.DBUtil;
import com.item.bean.Item;

public class ItemDao {

	
	private ResultSet rs;

	public int itemInsert(Item itm) {
		int n=0;
		try {
			Connection con = DBUtil.getDBConnection();
			
			String sql = "insert into item values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itm.getItemID());
			ps.setString(2,itm.getItemName());
			ps.setDouble(3, itm.getItemPrice());
			ps.setString(4, itm.getItemSeller());
			ps.setString(5, itm.getItemBuyer());
			ps.setString(6, itm.getItemStatus());
			
			n=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}
	
	public Item findItem(int id) {
		
		Item itm = null;
		ResultSet rs = null;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from item where itemId=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				itm = new Item();
				itm.setItemID(rs.getInt(1));
				itm.setItemName(rs.getString(2));
				itm.setItemPrice(rs.getDouble(3));
				itm.setItemSeller(rs.getString(4));
				itm.setItemBuyer(rs.getString(5));
				itm.setItemStatus(rs.getString(6));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return itm;
		
		
	}
	
	public ArrayList<Item> findAll(){
		
		ArrayList<Item> list = new ArrayList<Item>();
		ResultSet rs = null;
		Item itm= null;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "select * from item";
			PreparedStatement ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				itm = new Item();
				itm.setItemID(rs.getInt(1));
				itm.setItemName(rs.getString(2));
				itm.setItemPrice(rs.getDouble(3));
				itm.setItemSeller(rs.getString(4));
				itm.setItemBuyer(rs.getString(5));
				itm.setItemStatus(rs.getString(6));
				list.add(itm);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public int deleteItem(int id) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete from item where itemId=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			n=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public int updateItem(Item itm) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update item set itemName=?,itemPrice=?,itemSeller=?,itemBuyer=?,itemStatus=? where itemId=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itm.getItemName());
			ps.setDouble(2, itm.getItemPrice());
			ps.setString(3, itm.getItemSeller());
			ps.setString(4, itm.getItemBuyer());
			ps.setString(5, itm.getItemStatus());
			ps.setInt(6, itm.getItemID());
			
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
}
