package com.obs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.obs.bean.OnlineBusBookingSystem;
import com.obs.util.DBUtil;

public class OnlineBusBookingSystemDAO {
    int n = 0;
    private List<OnlineBusBookingSystem> list;
    private Connection con = DBUtil.getDBConnection();

    public int insertOnlineBusBookingSystem(OnlineBusBookingSystem obs) {

        try {
            String q = "insert into OnlineBusBookingSystem values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, obs.getBusNo());
            ps.setString(2, obs.getBusName());
            ps.setString(3, obs.getRouteFrom());
            ps.setString(4, obs.getRouteTo());
            ps.setString(5, obs.getBusType());
            ps.setString(6, obs.getDeparture());
            ps.setString(7, obs.getArrival());
            ps.setInt(8, obs.getTotalSeats());
            ps.setInt(9, obs.getAvailableSeats());
            ps.setInt(10, obs.getFare());
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    public int deleteOnlineBusBookingSystem(int BusNo) {

        try {
            String q = "delete from OnlineBusBookingSystem where BusNo=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, BusNo);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return n;
    }

    public int updateOnlineBusBookingSystem(OnlineBusBookingSystem obs) {

        try {
            String q = "update OnlineBusBookingSystem set BusName=?, RouteFrom=?,RouteTo=?,BusType=?,Departure=?,Arrival=?,TotalSeats=?,AvailSeats=?,Fare=? where BusNo=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, obs.getBusName());
            ps.setString(2, obs.getRouteFrom());
            ps.setString(3, obs.getRouteTo());
            ps.setString(4, obs.getBusType());
            ps.setString(5, obs.getDeparture());
            ps.setString(6, obs.getArrival());
            ps.setInt(7, obs.getTotalSeats());
            ps.setInt(8, obs.getAvailableSeats());
            ps.setInt(9, obs.getFare());
            ps.setInt(10, obs.getBusNo());
            n = ps.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return n;
    }

    public OnlineBusBookingSystem searchOnlineBusBookingSystem(int Bus) {
        ResultSet rs;

        try {
            String q = "select * from OnlineBusBookingSystem where BusNo = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, Bus);
            rs = ps.executeQuery();
            if (rs.next())
                return new OnlineBusBookingSystem(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9),
                        rs.getInt(10));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<OnlineBusBookingSystem> viewAll() {
        ResultSet rs;

        try {
            list = new ArrayList<OnlineBusBookingSystem>();
            String q = "select * from OnlineBusBookingSystem";
            PreparedStatement ps = con.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next())
                list.add(new OnlineBusBookingSystem(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9),
                        rs.getInt(10)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

