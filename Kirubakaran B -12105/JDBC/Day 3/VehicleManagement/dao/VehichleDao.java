package com.veh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.veh.bean.Vehichle;
import com.veh.util.DBUtil;

public class VehichleDao {

          
		public int insertVehichleDB(Vehichle stu) {
			int n=0;
			
			try {
				Connection con = DBUtil.getConnection();
				String q = "insert into veh values(?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(q);
				ps.setInt(1, stu.getId());
				ps.setString(2,stu.getName());
				ps.setString(3, stu.getBrand());
				ps.setString(4, stu.getColor());
				n=ps.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public int deleteVehichleDB(int id) {
			int n=0;
			
			try {
				Connection con = DBUtil.getConnection();
				String q = "delete from veh where vehid = ?";
				PreparedStatement ps = con.prepareStatement(q);
				ps.setInt(1, id);
				n=ps.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public boolean deleteAllVehichleDB(String pass) {
			final String password = "password@12345";
			boolean flag = true;
			try {
				Connection con = DBUtil.getConnection();
				String q = "delete from veh";
				java.sql.Statement st = con.createStatement();
				if(password.equals(pass))
					flag = st.execute(q);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
		
		public int updateVehichleDB(Vehichle stu) {
			int n=0;
			
			try {
				Connection con = DBUtil.getConnection();
				String q = "update veh set vehname = ? , vehbrand = ? , vehcolor = ? where vehid = ?";
				PreparedStatement ps = con.prepareStatement(q);
				ps.setInt(4, stu.getId());
				ps.setString(1,stu.getName());
				ps.setString(2, stu.getBrand());
				ps.setString(3, stu.getColor());
				n=ps.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n;
		}
		
		public Vehichle searchVehichleDB(int id) {
			ResultSet rs;
			try {
				Connection con = DBUtil.getConnection();
				String q = "select * from veh where vehid = ?";
				PreparedStatement ps = con.prepareStatement(q);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				if(rs.next())
					return(new Vehichle(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;	
		}
		
		public List<Vehichle> searchAllVehichleDB() {
			ResultSet rs;
			List<Vehichle> list = new ArrayList<Vehichle>();
			
			try {
				Connection con = DBUtil.getConnection();
				java.sql.Statement st = con.createStatement();
				rs = st.executeQuery("select * from veh");
				while(rs.next()) {
					list.add(new Vehichle(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
	}


