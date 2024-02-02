package com.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vms.bean.Vehicle;
import com.vms.util.VMSUtil;

public class VehicleDao {

		public int insertVehicle(Vehicle v1) {
			int g = 0;
			try {
				Connection a = VMSUtil.getDBConnection();
				String q = "insert into vehicle values(?,?,?,?,?,?);";
				PreparedStatement p = a.prepareStatement(q);
				
				p.setInt(1, v1.getV_id());
				p.setString(2, v1.getV_name());
				p.setString(3, v1.getBrand());
				p.setInt(4, v1.getPrice());
				p.setInt(5, v1.getB_id());
				p.setInt(6, v1.getS_id());
				
				g = p.executeUpdate();
				
				System.out.println(g);
				
			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
			return g;						
	}
		public int updateVehicle(int price, int v_id) {
			int g = 0;
			try {
				Connection a = VMSUtil.getDBConnection();
				String q2 = "Update vehicle set price=? where v_id=?";
				PreparedStatement p1 = a.prepareStatement(q2);
				
				p1.setInt(1, price);
				p1.setInt(2, v_id);
				
				g=p1.executeUpdate();
				System.out.println(g);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return g;
		}
		
		public int findVehicle(int v_id) {
			int g=0;
			try {
				Connection a = VMSUtil.getDBConnection();
				String q3 = "Select * from vehicle where v_id =? ;";
				PreparedStatement p2 = a.prepareStatement(q3);
				
				p2.setInt(1, v_id);
				
				ResultSet rs = p2.executeQuery();

				while (rs.next()) {
					System.out.println("Vehicle ID: " + rs.getInt(1) + " \nVehicle Name: " + rs.getString(2) + " \nVehicle Brand: "+rs.getString(3)+
							"\nVehicle Price: " +rs.getInt(4)+ "\nVehicle Buyer ID: "+rs.getInt(5)+ "\nVehcile Seller ID: " +rs.getInt(6));
					g = 1;
				}
			}
			catch (Exception e) {
				System.out.println(e);
				}
			return g;
			}
		
		public int deleteVehicle(int v_id) {
			int g=0;
			try {
				Connection a = VMSUtil.getDBConnection();
				String q4 = "delete from vehicle where v_id=?;";
				PreparedStatement p3 = a.prepareStatement(q4);
				
				p3.setInt(1, v_id);
				
				p3.executeUpdate();				
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return g;
	}
		
}

