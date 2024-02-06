package com.nanba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nanba.bean.Nanba;
import com.nanba.util.DBUtil;



public class NanbaDAO {

	
	public int insertIssue(Nanba nan) {
		
        int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "Insert into otms_tbl values(?,?,?,?,?,?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, nan.getTicket_id());
			pst.setString(2, nan.getCategory());
			pst.setString(3, nan.getSubject());
			pst.setString(4, nan.getDesc());
			pst.setString(5, nan.getPriority());
			pst.setString(6, nan.getRaised_by());
			pst.setString(7, nan.getAssigned_to());
			pst.setString(8, nan.getStatus());

			n = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		    
		
		return n;
		
		
	}
	
	
	public int deleteIssue(int id) {
		
		 int n =0;
			
			try {
				Connection con = DBUtil.getConnection();

				String query = "delete from otms_tbl where ticket_id = ?";

				PreparedStatement pst = con.prepareStatement(query);

				pst.setInt(1, id);
			
			     n = pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return n;
	}
	
	
	public int updateIssue(Nanba nan) {
		
		 int n =0;
			
			try {
				
				Connection con = DBUtil.getConnection();

				String query = "UPDATE `otms_db`.`otms_tbl` SET `category` = ?, `subject` = ?, `desc` = ?, `priority` = ?, `raised_by` = ?, `assigned_to` = ?, `status` = ? WHERE (`ticket_id` = ?)";
				
				//update inia_tbl set issuer=?,description=?,assigned_to=?,status=? where ticket_id=?

				PreparedStatement pst = con.prepareStatement(query);

				pst.setString(1, nan.getCategory());
				pst.setString(2, nan.getSubject());
				pst.setString(3, nan.getDesc());
				pst.setString(4, nan.getPriority());
				pst.setString(5, nan.getRaised_by());
				pst.setString(6, nan.getAssigned_to());
				pst.setString(7, nan.getStatus());
				pst.setInt(8, nan.getTicket_id());

				n = pst.executeUpdate();
				
				System.out.println(n);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return n;
			
			
	}
	
     public int findIssue(int id2) {
		
        int n =0;
		
		try {
			Connection con = DBUtil.getConnection();

			String query = "select*from otms_tbl where ticket_id=?";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, id2);
			

		     ResultSet rs = pst.executeQuery();
		     
		     while(rs.next()) {
		    	 
		    	 System.out.println("Ticket id : "+ rs.getInt(1)+
		    			 "\nCategory Name : "+rs.getString(2)+
		    			 "\nSubject : "+rs.getString(3)+
		    			 "\nDescription : "+rs.getString(4)+
		    			 "\nPriority : "+rs.getString(5)+
		    			 "\nRaised By : "+rs.getString(6)+
		    			 "\nAssigned To : "+rs.getString(7)+
		    			 "\nStatus : "+rs.getString(8));
		    	 n++;
		     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
		
	}	
     
     public int findAll() {
 		
         int n=0;
 		
 		try {
 			Connection con = DBUtil.getConnection();

 			String query = "select*from otms_tbl";

 			PreparedStatement pst = con.prepareStatement(query);

 			

 		     ResultSet rs = pst.executeQuery();
 		     
 		     while(rs.next()) {
 		    	 
 		    	 System.out.println("Ticket id : "+ rs.getInt(1)+
 		    			 "\nCategory Name : "+rs.getString(2)+
 		    			 "\nSubject : "+rs.getString(3)+
 		    			 "\nDescription : "+rs.getString(4)+
 		    			 "\nPriority : "+rs.getString(5)+
 		    			 "\nRaised By : "+rs.getString(6)+
 		    			 "\nAssigned To : "+rs.getString(7)+
 		    			 "\nStatus : "+rs.getString(8));
 		    	 n++;
 		    	 
 		    	 System.out.println("***************************************************");
 		     }
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 		return n;
 			
 	}
     
     public boolean deleteAll() {
 		
    	 boolean n1= true;
 		
 		try {
 			Connection con = DBUtil.getConnection();

 			String query = "truncate table otms_tbl;";

 			PreparedStatement pst = con.prepareStatement(query);

 			
 			 n1 = pst.execute();
 			
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 		
		return n1;
 		
 		
 		
 	}
}
