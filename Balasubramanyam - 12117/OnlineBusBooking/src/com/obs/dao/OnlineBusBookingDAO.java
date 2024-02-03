package com.obs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.obs.bean.OnlineBusBooking;
import com.obs.util.OBSUtil;

public class OnlineBusBookingDAO {


	public int insertOnlineBusBooking(OnlineBusBooking obs)
	{
		int n=0;
		try {
			Connection con=OBSUtil.getDBConnection();
			String sql="insert into OnlineBusBooking values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, obs.getBusNo());
			ps.setString(2, obs.getBusName());
			ps.setString(3, obs.getRouteFrom());
			ps.setString(4, obs.getRouteTo());
			ps.setString(5, obs.getBusType());
			ps.setString(6, obs.getDeparture());
			ps.setString(7, obs.getArrival());
			ps.setInt(8, obs.getTotalSeats());
			ps.setInt(9, obs.getAvailSeats());
			ps.setInt(10, obs.getFare());
			
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
	
	
	public int deleteOnlineBusBooking(int BusNo)
	{
		int n=0;
		try {
			Connection con=OBSUtil.getDBConnection();
			String sql="delete from OnlineBusBooking where BusNo=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, BusNo);
			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
	
 public int updateOnlineBusBooking(OnlineBusBooking obs)
	{
		int n=0;
		try {
			Connection con=OBSUtil.getDBConnection();
			String sql="update OnlineBusBooking set BusName=?, RouteFrom=?,RouteTo=?,BusType=?,Departure=?,Arrival=?,TotalSeats=?,AvailSeats=?,Fare=? where BusNo=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, obs.getBusName());
			ps.setString(2, obs.getRouteFrom());
			ps.setString(3, obs.getRouteTo());
			ps.setString(4, obs.getBusType());
			ps.setString(5, obs.getDeparture());
			ps.setString(6, obs.getArrival());
			ps.setInt(7, obs.getTotalSeats());
			ps.setInt(8, obs.getAvailSeats());
			ps.setInt(9, obs.getFare());
			ps.setInt(10, obs.getBusNo());

			n=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   return n;
}
 
 public OnlineBusBooking findOnlineBusBooking(int BusNo) {
	 OnlineBusBooking onlineBusBooking = null;
		try {
			Connection con=OBSUtil.getDBConnection();
			String sql="select * from OnlineBusBooking where BusNo=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, BusNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				onlineBusBooking = new OnlineBusBooking(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getNString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getInt(10));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return onlineBusBooking;
	}
 
 public OnlineBusBooking[] findAllOnlineBusBooking() {
		List<OnlineBusBooking> onlineBusBooking = new ArrayList<>();
		try {
			Connection con=OBSUtil.getDBConnection();
			String sql="select * from OnlineBusBooking";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				onlineBusBooking.add(new OnlineBusBooking(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getNString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getInt(10)));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return onlineBusBooking.toArray(new OnlineBusBooking[onlineBusBooking.size()]);

}
} 


