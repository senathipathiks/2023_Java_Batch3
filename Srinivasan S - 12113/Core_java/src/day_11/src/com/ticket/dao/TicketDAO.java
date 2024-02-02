package com.ticket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ticket.bean.Ticket;
import com.ticket.util.DbTickUtil;

public class TicketDAO {

		public static int insert(Ticket tic) {
			int n=0;
			try {
				Connection c=DbTickUtil.getDBconnection();
				String q="insert into ticket values(?,?,?,?,?)";			
				PreparedStatement prs=c.prepareStatement(q);
				
				prs.setInt(1, tic.getTicketId());
				prs.setString(2, tic.getDesc());
				prs.setInt(3, tic.getIssuer());
				prs.setString(4, tic.getAssignedTo());
				prs.setString(5, tic.getStatus());
				
				n=prs.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;	
		}
		
		public static int delete(int id) {
			int n=0;
			try {
				Connection c=DbTickUtil.getDBconnection();
				String q="DELETE from ticket where ticketId=?";
				PreparedStatement prs=c.prepareStatement(q);
				
				prs.setInt(1, id);
				n=prs.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public static int update(Ticket tic) {
			int n=0;
			try {
				Connection c=DbTickUtil.getDBconnection();
				String q="UPDATE `ticket_raising_system`.`ticket` SET `desc` = '?', `issuer` = '?', `assigned To` = '?', `status` = '?' WHERE (`ticketId` = '?');";
				PreparedStatement prs=c.prepareStatement(q);
				
				prs.setString(1, tic.getDesc());
				prs.setInt(2, tic.getIssuer());
				prs.setString(3, tic.getAssignedTo());
				prs.setString(4, tic.getStatus());
				prs.setInt(5, tic.getTicketId());
				
				n=prs.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public static int find(int id) {
			int n=0;
			try {
				Connection c=DbTickUtil.getDBconnection();
				String q="SELECT * from ticket where ticketId=?";
				PreparedStatement prs=c.prepareStatement(q);
				
				ResultSet rs=prs.executeQuery();
				while (rs.next()) {
					System.out.println("Ticket id :"+rs.getInt(1)+"\nDescription : "+rs.getString(2)+
							"\nIssuer id : "+rs.getInt(3)+"\nAssigned to : "+rs.getString(4)+"\nStatus : "+rs.getString(5));
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public static int findall() {
			int n=0;
			try {
				Connection c=DbTickUtil.getDBconnection();
				String q="SELECT * from ticket";
				PreparedStatement prs=c.prepareStatement(q);
				
				ResultSet rs= prs.executeQuery();
				while (rs.next()) {
					System.out.println("Ticket id :"+rs.getInt(1)+"\nDescription : "+rs.getString(2)+
							"\nIssuer id : "+rs.getInt(3)+"\nAssigned to : "+rs.getString(4)+"\nStatus : "+rs.getString(5));
					n++;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
}
