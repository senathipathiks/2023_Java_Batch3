package com.hrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrs.bean.HotelRoomReservationSystem;

import com.hrs.util.HRSUtil;

public class HotelRoomReservationSystemDAO {
		public int insertHotelRoomReservationSystem(HotelRoomReservationSystem hrs)
		{
			int n=0;
			try {
				Connection con=HRSUtil.getDBConnection();
				String sql="insert into HotelRoomReservationSystem values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, hrs.getRoomID());
				ps.setString(2,hrs.getRoomType() );
				ps.setInt(3, hrs.getRoomTariff());
				ps.setString(4,hrs.getRoomDesc() );
				ps.setString(5,hrs.getOccupancy() );
				
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
	}
		
		
		public int deleteHotelRoomReservationSystem(int RoomID)
		{
			int n=0;
			try {
				Connection con=HRSUtil.getDBConnection();
				String sql="delete from HotelRoomReservationSystem where RoomID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, RoomID);
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
	}
		
	 public int updateHotelRoomReservationSystem(HotelRoomReservationSystem hrs)
		{
			int n=0;
			try {
				Connection con=HRSUtil.getDBConnection();
				String sql="update hotelroomreservationsystem set RoomType=?,RoomTariff=?,RoomDesc=?,Occupancy=? where RoomID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1,hrs.getRoomType() );
				ps.setInt(2, hrs.getRoomTariff());
				ps.setString(3,hrs.getRoomDesc() );
				ps.setString(4,hrs.getOccupancy() );
				ps.setInt(5, hrs.getRoomID());
				n=ps.executeUpdate();
					
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	   return n;
	}
	 
	 public HotelRoomReservationSystem findHotelRoomReservationSystem(int RoomID) {
		 HotelRoomReservationSystem hotelRoomReservationSystem = null;
			try {
				Connection con=HRSUtil.getDBConnection();
				String sql="select * from HotelRoomReservationSystem where RoomID=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, RoomID);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					hotelRoomReservationSystem = new HotelRoomReservationSystem(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
					}
			} catch (SQLException e) {
				System.out.println(e);
			}
			return hotelRoomReservationSystem;
		}
	 
	 public HotelRoomReservationSystem[] findAllHotelRoomReservationSystem() {
			List<HotelRoomReservationSystem> hotelRoomReservationSystem = new ArrayList<>();
			try {
				Connection con=HRSUtil.getDBConnection();
				String sql="select * from HotelRoomReservationSystem";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					hotelRoomReservationSystem.add(new HotelRoomReservationSystem(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
			return hotelRoomReservationSystem.toArray(new HotelRoomReservationSystem[hotelRoomReservationSystem.size()]);

	}
	}


