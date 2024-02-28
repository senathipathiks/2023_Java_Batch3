package com.ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ims.util.*;
import com.ims.bean.*;

public class InventoryDAO {

	public int insertProduct(Inventory inv) {
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
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
	
	public int updateProduct(Inventory inv) {
		int n=0;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="update details set price=? where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setFloat(1, inv.getPrice());
			ps.setInt(2, inv.getItemId());
			
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
	
	public int deleteProduct(int id) {
		int n=0;
		try {
			Connection con=InventoryUtil.getDBConnection();
			String sql="delete from details where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;	
	}
	
	public int findProduct(int id) {
		int n = 0;
		try {
			
			Connection con=InventoryUtil.getDBConnection();
			String sql="select * from details where item_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			
			 while(rs.next()) {
				 System.out.println("Product id : "+rs.getInt(1)+"\nProduct Name : "+rs.getString(2)
	                +"\nQuantity in Stock : "+rs.getString(3)
	                +"\nManufacturer : "+rs.getString(4)
	                +"\nMFG Date : "+rs.getString(5)
	                +"\nPrice : "+rs.getFloat(6));	               
				 
				 n=1;
	            }
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        return n;
	}
	
	public int findAllProduct() {
		int n = 0;
		try {
			
			Connection con=InventoryUtil.getDBConnection();
			String sql="select * from details";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			
			 while(rs.next()) {
				 System.out.println("Product id : "+rs.getInt(1)+"\nProduct Name : "+rs.getString(2)
	                +"\nQuantity in Stock : "+rs.getString(3)
	                +"\nManufacturer : "+rs.getString(4)
	                +"\nMFG Date : "+rs.getString(5)
	                +"\nPrice : "+rs.getFloat(6)
	                +"\n ");	               
				 
				 n=1;
	            }
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
		System.out.println();
	        return n;
	    }
	
	
	    
	
	
}
