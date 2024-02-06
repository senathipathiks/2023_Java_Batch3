package com.iniapro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import com.iniapro.bean.IniaPro;
import com.iniapro.util.DBUtil;

public class IniaProDAO {
	
	
	public int insertIssue(IniaPro inia, int r) {
		
          int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "Insert into inia_tbl values(?,?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, inia.getTicketId());
			pst.setString(2, inia.getIssuer());
			pst.setString(3, inia.getDesc());
			pst.setString(4, inia.getAssinedTo());
			pst.setString(5, inia.getStatus());
			pst.setInt(6, r);

			n = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		    
		
		return n;
		
		
	}
	
	public static int deleteIssue(int id) {
		
      int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "delete from inia_tbl where ticket_id = ?";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, id);
			

		     n = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	
	public static int updateIssue(IniaPro inia) {
		
        int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "update inia_tbl set issuer=?,description=?,assigned_to=?,status=? where ticket_id=?";

			PreparedStatement pst = con.prepareStatement(query);

			
			pst.setString(1, inia.getIssuer());
			pst.setString(2, inia.getDesc());
			pst.setString(3, inia.getAssinedTo());
			pst.setString(4, inia.getStatus());
			pst.setInt(5, inia.getTicketId());

			n = pst.executeUpdate();
			
			//System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	
	public static int findIssue(int id1) {
		
        int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "select*from inia_tbl where ticket_id=?";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, id1);
			

		     ResultSet rs = pst.executeQuery();
		     
		     while(rs.next()) {
		    	 
		    	 System.out.println("Ticket id : "+ rs.getInt(1)+
		    			 "\nIssuer Name : "+rs.getString(2)+
		    			 "\nDescription : "+rs.getString(3)+
		    			 "\nAssigned To : "+rs.getString(4)+
		    			 "\nStatus : "+rs.getString(5)+
		    			 "\nBooking Id : "+rs.getInt(6));
		    	 n++;
		     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
		
		
		
	}
	
	public static int findAll() {
		
		int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "select*from inia_tbl ";

			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				System.out.println("Ticket id : " + rs.getInt(1) + "\nIssuer Name : " + rs.getString(2)
						+ "\nDescription : " + rs.getString(3) + "\nAssigned To : " + rs.getString(4) + "\nStatus : "
						+ rs.getString(5)+"\nBooking Id : "+rs.getInt(6));
				n++;
				System.out.println("******************************************************");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
		
		return n;
	     
		
	}
	
	public static int deleteAll() {
		
		int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "truncate table inia_tbl;";

			PreparedStatement pst = con.prepareStatement(query);

			
			n = pst.executeUpdate();
			
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
		
		
	}
	
	public int generateConfirmationNumber() {
	    // Generate a random 6-digit confirmation number
	   
		Random rand = new Random();
	   
		
		return rand.nextInt(900000) + 100000;
	  }
	

}
