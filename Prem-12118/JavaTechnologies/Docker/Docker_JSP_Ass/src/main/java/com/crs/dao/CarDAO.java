package com.crs.dao;

import java.sql.*;
import java.util.LinkedList;

import com.crs.bean.Car;
import com.crs.util.DBUtil;

public class CarDAO {

    public int insertCar(Car car) {
        int n = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "insert into car values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, car.getId());
            ps.setString(2, car.getBrand());
            ps.setString(3, car.getModel());
            ps.setInt(4, car.getYear());
            n = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }

    public int updateCar(Car car) {
        int n = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "Update car set Car_brand=?, Car_model=?, Car_year=? where Car_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, car.getBrand());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setInt(4, car.getId());
            n = ps.executeUpdate();

            System.out.println(car.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public Car findCar(int id) {
        Car car = new Car();
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "SELECT * FROM car WHERE Car_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                car.setId(rs.getInt(1));
                car.setBrand(rs.getString(2));
                car.setModel(rs.getString(3));
                car.setYear(rs.getInt(4));

            } else {
                System.out.println("Car not found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return car;
    }

    public LinkedList<Car> findAllCars() {
        LinkedList<Car> list = new LinkedList<>();
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "SELECT * FROM car";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt(1));
                car.setBrand(rs.getString(2));
                car.setModel(rs.getString(3));
                car.setYear(rs.getInt(4));
                list.add(car);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int deleteCar(int id) {
        int n = 0;
        try {
            Connection con = DBUtil.getDBConnection();
            String sql = "delete from car where Car_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            n = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }
}
