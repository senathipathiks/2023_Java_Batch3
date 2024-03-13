package com.rrs.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.rrs.bean.RailwayReservationSystem;
import com.rrs.util.*;

public class RRSDAO {

	int n = 0;
	private List<RailwayReservationSystem> list;
	private Connection con = DBUtill.getDBConnection();

	public int insertRailwayReservationSystem(RailwayReservationSystem rrs) {

		try {
			String q = "insert into RailwayReservationSystem value(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, rrs.getTrainID());
			ps.setString(2, rrs.getTrainName());
			ps.setString(3, rrs.getTrainType());
			ps.setInt(4, rrs.getNo_of_seats());
			ps.setString(5, rrs.getSource());
			ps.setString(6, rrs.getDestination());
			ps.setFloat(7, rrs.getFare());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	public int deleteRailwayReservationSystem(int TrainId) {
		try {
			String q = "delete from RailwayReservationSystem where TrainId = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, TrainId);
			n = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return n;
	}

	public int updateRailwayReservationSystem(RailwayReservationSystem rrs) {

		try {
			String q = "update RailwayReservationSystem set TrainName = ?, TrainType = ? , No_of_seats = ?,Source = ?,Destination = ?,Fare  = ? where TrainId =?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, rrs.getTrainName());
			ps.setString(2, rrs.getTrainType());
			ps.setInt(3, rrs.getNo_of_seats());
			ps.setString(4, rrs.getSource());
			ps.setString(5, rrs.getDestination());
			ps.setFloat(6, rrs.getFare());
			ps.setInt(7, rrs.getTrainID());
			n = ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return n;
	}

	public RailwayReservationSystem searchRailwayReservationSystem(int TrainId) {
		ResultSet rs;

		try {
			String q = "select * from RailwayReservationSystem where TrainId = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, TrainId);
			rs = ps.executeQuery();
			if (rs.next())
				return new RailwayReservationSystem(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getFloat(7));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<RailwayReservationSystem> viewAll() {
		ResultSet rs;

		try {
			List<RailwayReservationSystem> list = new ArrayList<RailwayReservationSystem>();
			String q = "select * from RailwayReservationSystem";
			PreparedStatement ps = con.prepareStatement(q);
			rs = ps.executeQuery();
			while (rs.next())
				list.add(new RailwayReservationSystem(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getString(6), rs.getFloat(7)));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}