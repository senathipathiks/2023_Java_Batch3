package com.day11jdbc.tsms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.day11jdbc.tsms.bean.Ticket;
import com.day11jdbc.tsms.dbutil.TicketUtility;

public class TicketDAO {

	static Connection c = TicketUtility.getConnection();

	public static int addTicket(Ticket t) throws SQLException {
		PreparedStatement ps = c.prepareStatement(
				"INSERT INTO `ticketms`.`ticket` (`tid`, `tdeptname`, `tcategory`, `tdesc`, `tstatus`, `mobileNo`) VALUES (?, ?, ?, ?, ?, ?);");
		ps.setInt(1, t.getTid());
		ps.setString(2, t.getDept());
		ps.setString(3, t.gettCatergory());
		ps.setString(4, t.gettDesc());
		ps.setString(5, t.gettStatus());
		ps.setLong(6, t.getMobNo());

		return ps.executeUpdate();

	}
	
	public static ResultSet fetchAll() throws SQLException {
		PreparedStatement ps = c.prepareStatement("SELECT * FROM ticketms.ticket;");
		return ps.executeQuery();	
	}
	
	public static ResultSet fetchByID(int id) throws SQLException {
		PreparedStatement ps = c.prepareStatement("SELECT * FROM ticketms.ticket where tid=?");
		ps.setInt(1, id);
		return ps.executeQuery();
		
	}
	
	public static int deleteById(int id) throws SQLException {
		PreparedStatement ps = c.prepareStatement("DELETE FROM `ticketms`.`ticket` WHERE (`tid` = ?);");
		ps.setInt(1, id);
		return ps.executeUpdate();
		
	}
	
	public static boolean deleteAll() throws SQLException {
		PreparedStatement ps = c.prepareStatement("truncate table `ticketms`.`ticket`;");
		return ps.execute();
		
	}
	
	public static int updateTicket(int id , String status) throws SQLException {
		PreparedStatement ps = c.prepareStatement("UPDATE `ticketms`.`ticket` SET `tstatus` = ? WHERE (`tid` = ?);");
		ps.setString(1, status);
		ps.setInt(2, id);
		return ps.executeUpdate();
		
	}

}
