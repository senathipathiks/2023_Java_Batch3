package com.ms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ms.bean.VehicleClass;
import com.ms.util.VehicleUtil;

public class VehicleDAO {

	
public int insertVehicle(VehicleClass vehi) {
		
		int n=0;
		try {
			Connection c = VehicleUtil.getDBConnection();
			String sql="insert into Vehicle values(?,?,?,?)";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, vehi.getNo());
			ps.setString(2, vehi.getBrandName());
			ps.setFloat(3, vehi.getPrice());
			ps.setString(4, vehi.getType());
			n=ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return n;
		
	}

public int  deleteVehicle(int id) {
	
	int n=0;
	
	 try {
         Connection con=VehicleUtil.getDBConnection();
         String sql="delete from vehicle where No=?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1, id);
         n=ps.executeUpdate();
             
     } catch (Exception e) {
		// TODO: handle exception
    	 
    	 System.out.println(e);
	}
	
	
	
	return n;
	
}

public int updateVehicle(VehicleClass vehi) {
	
	int n=0;
	
	 try {
         Connection con=VehicleUtil.getDBConnection();
         String sql="update vehicle set brandName=?, price=?, type=? where No=?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setString(1, vehi.getBrandName());
         ps.setFloat(2, vehi.getPrice());
         ps.setString(3, vehi.getType());
         ps.setInt(4, vehi.getNo());
         n=ps.executeUpdate();
             
     }catch (Exception e) {
		// TODO: handle exception
    	 System.out.println(e);
	}
	
	return n;
	
}

public int findVehicles(int id1) {
	// TODO Auto-generated method stub
	int n=0;
	try {
		 Connection con = VehicleUtil.getDBConnection();
	        String sql = "select * from Vehicle where no=?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, id1);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            System.out.println("No:" + rs.getInt(1) + " \nName: " + rs.getString(2) + " \nPrice: " + rs.getFloat(3)+ "\nType: " +rs.getString(4));
	             n = 1;
	        }
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	return n;
}


public int viewAllDetails() {
	int n=0;
	
	
		 try {
	            Connection con = VehicleUtil.getDBConnection();
	            String sql = "SELECT * FROM Vehicle";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                System.out.println("No:" + rs.getInt(1) + " \nName: " + rs.getString(2) + " \nPrice: " + rs.getFloat(3)+ "\nType: " +rs.getString(4));
	                n = 1;
	            }
	} catch (Exception e) {
		// TODO: handle exception
	}
	return n;
	



	

}

}
