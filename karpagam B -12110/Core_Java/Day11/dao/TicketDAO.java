package com.stu_db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.stu_db.bean.Ticket;
import com.stu_db.util.DBUtil;

public class TicketDAO {

	public int insertTicket(Ticket tik){
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="insert into ticket_tbl values(?,?,?,?,?,?)";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setInt(1,tik.getId());
		    ps.setString(2,tik.getPriority());
		    ps.setString(3,tik.getLocation());
		    ps.setInt(4,tik.getMobNo());
		    ps.setString(5,tik.getCategory());
		    ps.setInt(6,tik.getLocationid());
		    n=ps.executeUpdate();
		    }
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	public int deleteTicket(int id){
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from ticket_tbl where ticketId=?";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setInt(1,id);
		    n=ps.executeUpdate();
		    }
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	public int updateTicket(Ticket tik){
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="update ticket_tbl set priority=?,location=?,mobileNo=?,category=?,workLocationNo=? where ticketId=?";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1,tik.getPriority());
		    ps.setString(2,tik.getLocation());
		    ps.setInt(3,tik.getMobNo());
		    ps.setString(4,tik.getCategory());
		    ps.setInt(5,tik.getLocationid());
		    ps.setInt(6,tik.getId());

		    n=ps.executeUpdate();
		    }
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	public int findTicket(int id){
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select*from ticket_tbl where ticketId=?";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setInt(1,id);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println("Ticket Id:"+rs.getInt(1)+"\nPriority:"+rs.getString(2)+"\nLocation:"+rs.getString(3)+"\nMobile No:"+rs.getInt(4)+"\nCategory:"+rs.getString(5)+"\nwork Location No:"+rs.getInt(6));
		    	n=1;
		    }
		    }
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	public int findAllTicket(){
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="select*from ticket_tbl ";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println("Ticket Id:"+rs.getInt(1)+"\nPriority:"+rs.getString(2)+"\nLocation:"+rs.getString(3)+"\nMobile No:"+rs.getInt(4)+"\nCategory:"+rs.getString(5)+"\nwork Location No:"+rs.getInt(6));
		    	n=1;
		    }
		    }
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
}
	
	
}


