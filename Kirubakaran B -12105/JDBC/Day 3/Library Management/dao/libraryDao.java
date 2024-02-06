package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lib.bean.library;
import com.lib.util.DBUtil;

public class libraryDao {

	public int insertLibraryDB(library lib) {
		int n=0;
		
		try {
			Connection con = DBUtil.getConnection();
			String q = "insert into lib values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, lib.getBookID());
			ps.setString(2,lib.getBookName());
			ps.setString(3, lib.getAuthorName());
			ps.setInt(4, lib.getPrice());
			ps.setString(5,lib.getPublisherName());
			ps.setString(6,lib.getBookGenre());
			ps.setString(7,lib.getPublishedYear());
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deleteLibraryDB(int id) {
		int n=0;
		
		try {
			Connection con = DBUtil.getConnection();
			String q = "delete from lib where bookid = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public boolean deleteAllLibraryDB(String pass) {
		final String password = "password@12345";
		boolean flag = true;
		try {
			Connection con = DBUtil.getConnection();
			String q = "delete from lib";
			java.sql.Statement st = con.createStatement();
			if(password.equals(pass))
				flag = st.execute(q);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public int updateLibraryDB(library lib) {
		int n=0;
		
		try {
			Connection con = DBUtil.getConnection();
			String q = "update lib set bookname = ? , authorname = ? , price = ?,publishedby =?,bookgenre =?,publishedyear=? where bookid = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(7, lib.getBookID());
			ps.setString(1,lib.getBookName());
			ps.setString(2, lib.getAuthorName());
			ps.setInt(3, lib.getPrice());
			ps.setString(4,lib.getPublisherName());
			ps.setString(5,lib.getBookGenre());
			ps.setString(6,lib.getPublishedYear());
			n=ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public library searchLibraryDB(int id) {
		ResultSet rs;
		try {
			Connection con = DBUtil.getConnection();
			String q = "select * from lib where bookid = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next())
				return(new library(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<library> searchAllLibraryDB() {
		ResultSet rs;
		List<library> list = new ArrayList<library>();
		
		try {
			Connection con = DBUtil.getConnection();
			java.sql.Statement st = con.createStatement();
			rs = st.executeQuery("select * from lib");
			while(rs.next()) {
				list.add(new library(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}
