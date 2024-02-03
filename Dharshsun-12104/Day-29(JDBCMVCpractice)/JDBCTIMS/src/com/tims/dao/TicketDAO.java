package com.tims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.tims.bean.Ticket;
import com.tims.util.DBUtil;

//import com.sms.bean.Student;
//import com.sms.util.DBUtuil;

public class TicketDAO {
	public int insertTicket(Ticket tic) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql = "insert into nanba values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, tic.getTicketid());
			ps.setInt(2, tic.getDeptno());
			ps.setString(3, tic.getCategory());
			ps.setString(4,tic.getPriority());
			ps.setInt(5, tic.getPhoneno());
			n=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public int deleteTicket(int ticketid) {
		int n=0;
		try {
			Connection con=DBUtil.getDBConnection();
			String sql="delete from nanba where ticketid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ticketid);
			n=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
		public int updateTicket(Ticket tic) {
			int n=0;
			try {
				Connection con=DBUtil.getDBConnection();
				String sql="update nanba set deptno=?,category=?,Priority=?,phoneno=? where ticketid=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, tic.getDeptno());
				ps.setString(2, tic.getCategory());
				ps.setString(3, tic.getPriority());
				ps.setInt(4, tic.getPhoneno());
				ps.setInt(5, tic.getTicketid());
				n=ps.executeUpdate();
				
			}catch(Exception e) {
				System.out.println(e);
			}
			return n;
		}
			public Ticket searchTicketDB(int studid) {
				ResultSet rs;
				try {
					Connection con = DBUtil.getDBConnection();
					String q = "select * from nanba where ticketid = ?";
					PreparedStatement ps = con.prepareStatement(q);
					ps.setInt(1, studid);
					rs = ps.executeQuery();
					if(rs.next())
						return(new Ticket(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5)));		
					} catch (Exception e) {
					e.printStackTrace();
				}
				return null;	
			}
				public List<Ticket> searchAllTicketDB() {
					ResultSet rs1;
					List<Ticket> list = new ArrayList<Ticket>();
					
					try {
						Connection con = DBUtil.getDBConnection();
						Statement st = con.createStatement();
						rs1 = st.executeQuery("select * from nanba");
						while(rs1.next()) {
							list.add(new Ticket(rs1.getInt(1),rs1.getInt(2),rs1.getString(3),rs1.getString(4),rs1.getInt(5)));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					return list;
				
			}
		
	}




