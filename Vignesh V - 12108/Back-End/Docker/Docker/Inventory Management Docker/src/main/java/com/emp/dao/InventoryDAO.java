package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.emp.bean.*;
import com.emp.util.*;


public class InventoryDAO {
	
	public int insertStudent(Inventory inv) {
		int n=0;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="insert into details values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, inv.getItemId());
			ps.setString(2, inv.getItemName());
			ps.setString(3, inv.getQuantityStock());
			ps.setString(4, inv.getManufacturer());
			ps.setString(5, inv.getMfgDate());
			ps.setFloat(6, inv.getPrice());
			
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;	
	}
	
	public Inventory findInventory(int id) {
		Inventory inv=null;
		ResultSet rs;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="select * from details where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			//rs.first();
			if(rs.next()) {
				inv=new Inventory();
				inv.setItemId(rs.getInt(1));
				inv.setItemName(rs.getString(2));
				inv.setQuantityStock(rs.getString(3));
				inv.setManufacturer(rs.getString(4));
				inv.setMfgDate(rs.getString(5));
				inv.setPrice(rs.getFloat(6));
				
			}
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return inv;
		
	}
	
	@SuppressWarnings("unused")
	public LinkedList<Inventory> findAllInventory() {
		int n=0;
		LinkedList<Inventory> list=new LinkedList<Inventory>();
		
		Inventory inv=null;
		try {
			
			Connection con=InventoryUtil.getDBConnection();
			String sql="select * from details";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()) {
				inv=new Inventory();
				inv.setItemId(rs.getInt(1));
				inv.setItemName(rs.getString(2));
				inv.setQuantityStock(rs.getString(3));
				inv.setManufacturer(rs.getString(4));
				inv.setMfgDate(rs.getString(5));
				inv.setPrice(rs.getFloat(6));
				
				list.add(inv);
			}
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return list;
	    }
	
	public int updateInventory(Inventory id) {
		int n=0;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="update details set item_name=? where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id.getItemName());
			ps.setInt(2, id.getItemId());
			
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;	
	}
	
	public int deleteInventory(int id) {
		int n=0;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="delete from details where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;	
	}
	
	
}
